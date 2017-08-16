package com.example.android.helsinkitourapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {

      @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //Inflate the list
        View rootView = inflater.inflate(R.layout.list_place, container, false);

        //Create the ArrayList for the places
        ArrayList<Places> places = new ArrayList<>();

            //Add the places to the ArrayList
           places.add(new Places(getString(R.string.Gaijin_name), getString(R.string.Gaijin_address), getString(R.string.gaijin_desc), R.drawable.gaijin, getString(R.string.gaijin_url), getString(R.string.gaijin_loc)));
          places.add(new Places(getString(R.string.Juuri_name), getString(R.string.Juuri_address), getString(R.string.Juuri_desc), R.drawable.juuri, getString(R.string.Juuri_url), getString(R.string.juuri_loc)));
          places.add(new Places(getString(R.string.Kuu_name), getString(R.string.Kuu_address), getString(R.string.Kuu_desc), R.drawable.kuu, getString(R.string.Kuu_url), getString(R.string.kuu_loc)));
          places.add(new Places(getString(R.string.Sandro_name), getString(R.string.Sandro_address), getString(R.string.Sandro_desc), R.drawable.sandro, getString(R.string.Sandro_url), getString(R.string.sandro_loc)));


            //Set the adapter for the places
            PlacesAdapter adapter = new PlacesAdapter(getActivity(), places);


        ListView listView = (ListView) rootView.findViewById(R.id.list_place);

            listView.setAdapter(adapter);

            //Return the fragment rootview
            return rootView;
        }

    }