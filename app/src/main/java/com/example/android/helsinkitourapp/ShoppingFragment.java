package com.example.android.helsinkitourapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public class ShoppingFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //Inflate the list
        View rootView = inflater.inflate(R.layout.list_place, container, false);

        //Create the ArrayList for the places
        ArrayList<Places> places = new ArrayList<>();

        //Add the places to the ArrayList
        places.add(new Places(getString(R.string.aarikka_name), getString(R.string.aarikka_address), getString(R.string.aarikka_desc), R.drawable.aarikka, getString(R.string.aarikka_url), getString(R.string.aarikka_loc)));
        places.add(new Places(getString(R.string.iittala_name), getString(R.string.iittala_address), getString(R.string.iittala_desc), R.drawable.iittala, getString(R.string.iittala_url), getString(R.string.iittala_loc)));
        places.add(new Places(getString(R.string.pentik_name), getString(R.string.pentik_address), getString(R.string.pentik_desc), R.drawable.pentik, getString(R.string.pentik_url), getString(R.string.pentik_loc)));
        places.add(new Places(getString(R.string.moomin_name), getString(R.string.moomin_address), getString(R.string.moomin_desc), R.drawable.moomin, getString(R.string.moomin_url), getString(R.string.moomin_loc)));


        //Set the adapter for the places
        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.list_place);

        listView.setAdapter(adapter);

        //Return the  rootview
        return rootView;
    }
}