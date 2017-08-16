package com.example.android.helsinkitourapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Mervi on 15.6.2017.
 */


class PlacesAdapter extends ArrayAdapter<Places> {

    private final Context context = getContext();

    PlacesAdapter(Activity context, ArrayList<Places> places) {
        super(context, 0, places);
    }


    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (convertView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Place} object located at this position in the list
        Places currentPlace = getItem(position);

        //Get the object's properties
        String name = null;
        if (currentPlace != null) {
            name = currentPlace.getName();
        }
        String address = currentPlace.getAddress();
        String description = currentPlace.getDescription();
        int imageID = currentPlace.getImageResourceID();
        String siteURL = currentPlace.getSiteURL();
        String location = currentPlace.getLocation();

        //Get the ImageView and set the name of the Object
        final ImageView itemImageView = (ImageView) listItemView.findViewById(R.id.list_image);
        itemImageView.setImageResource(imageID);

        //Get the TextView and set the name of the Object
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.list_name);
        nameTextView.setText(name);

        //Get the TextView and set the name of the Object
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.list_address);
        addressTextView.setText(address);

        //Create an implicit intent to display the detailed place information if the user taps on the list item
        final Intent itemIntent = new Intent(context, PlacesDetailActivity.class);

        //Put the properties of the Object to the intent
        itemIntent.putExtra(context.getString(R.string.name_var), name);
        itemIntent.putExtra(context.getString(R.string.address_var), address);
        itemIntent.putExtra(context.getString(R.string.desc_var), description);
        itemIntent.putExtra(context.getString(R.string.img_var), imageID);
        itemIntent.putExtra(context.getString(R.string.site_var), siteURL);
        itemIntent.putExtra(context.getString(R.string.loc_var), location);


        //Start the intent if the user taps on the list item
        listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(itemIntent);
            }
        });

        return listItemView;
    }
}