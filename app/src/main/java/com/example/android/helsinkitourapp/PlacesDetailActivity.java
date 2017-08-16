package com.example.android.helsinkitourapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Mervi on 11.6.2017.
 */


public class PlacesDetailActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_details);

        //Get the properties of the Place Object from the intent
        Bundle b = getIntent().getExtras();
        String placeName = b.getString(getString(R.string.name));
        String placeAddress = b.getString(getString(R.string.address));
        String placeDescription = b.getString(getString(R.string.desc));
        int placeImage = b.getInt(getString(R.string.img));
        final String placeSite = b.getString(getString(R.string.site_var));
        final String placeLocation = b.getString(getString(R.string.loc));

        //Set the name of the place as the title of the screen
        this.setTitle(placeName);

        //Set the image to the ImageView in the activity_place_details.xml
        ImageView imageView = (ImageView) findViewById(R.id.detailed_image);
        imageView.setImageResource(placeImage);

        //Set the name to the TextView in the activity_place_details.xml
        TextView nameTextView = (TextView) findViewById(R.id.detailed_name);
        nameTextView.setText(placeName);

        //Set the address to the TextView in the activity_place_details.xml
        TextView addressTextView = (TextView) findViewById(R.id.detailed_address);
        addressTextView.setText(placeAddress);

        //Set the description to the TextView in the activity_place_details.xml
        TextView descriptionTextView = (TextView) findViewById(R.id.detailed_desc);
        descriptionTextView.setText(placeDescription);


            //Get the properties of the Places Object from the intent
            b = getIntent().getExtras();
            placeName = b.getString(getString(R.string.name));
            placeAddress = b.getString(getString(R.string.address));
            placeDescription = b.getString(getString(R.string.desc));
            placeImage = b.getInt(getString(R.string.img));


            //Set the name of the place as the title of the screen
            this.setTitle(placeName);

            //Set the image to the ImageView in the activity_place_details.xml
            imageView = (ImageView) findViewById(R.id.detailed_image);
            imageView.setImageResource(placeImage);

            //Set the name to the TextView in the activity_place_details.xml
            nameTextView = (TextView) findViewById(R.id.detailed_name);
            nameTextView.setText(placeName);

            //Set the address to the TextView in the activity_place_details.xml
            addressTextView = (TextView) findViewById(R.id.detailed_address);
            addressTextView.setText(placeAddress);

            //Set the description to the TextView in the activity_place_details.xml
            descriptionTextView = (TextView) findViewById(R.id.detailed_desc);
            descriptionTextView.setText(placeDescription);



        //Create an intent for the web page of the Place Object
        LinearLayout linkView = (LinearLayout) findViewById(R.id.link_webpage);
        linkView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //If clicking on the icon, goes to the site of the place
                Uri webpage = Uri.parse(placeSite);
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                if (webIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(webIntent);
                }
            }
        });

        //Create an intent for the web page of the Place Object
        LinearLayout mapView = (LinearLayout) findViewById(R.id.link_map);
        mapView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //If clicking on the icon, goes to the site of the place
                Uri geoLocation = Uri.parse("geo:" + placeLocation + "?z=16");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, geoLocation);
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }
            }
        });

    }
    }

