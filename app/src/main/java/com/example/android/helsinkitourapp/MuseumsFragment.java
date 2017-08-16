package com.example.android.helsinkitourapp;

/* Created by Mervi on 17.6.2017. */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public class MuseumsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //Inflate the list
        View rootView = inflater.inflate(R.layout.list_place, container, false);

        //Create the ArrayList for the places
        ArrayList<Places> places = new ArrayList<>();

        //Add the places to the ArrayList
        places.add(new Places(getString(R.string.ateneum_name), getString(R.string.ateneum_address), getString(R.string.ateneum_desc), R.drawable.ateneum, getString(R.string.ateneum_url), getString(R.string.ateneum_loc)));
        places.add(new Places(getString(R.string.kiasma_name), getString(R.string.kiasma_address), getString(R.string.kiasma_desc), R.drawable.kiasma, getString(R.string.kiasma_url), getString(R.string.kiasma_loc)));
        places.add(new Places(getString(R.string.seurasaari_name), getString(R.string.seurasaari_address), getString(R.string.seurasaari_desc), R.drawable.seurasaari, getString(R.string.seurasaari_url), getString(R.string.seurasaari_loc)));
        places.add(new Places(getString(R.string.natural_name), getString(R.string.natural_address), getString(R.string.natural_desc), R.drawable.natural, getString(R.string.natural_url), getString(R.string.natural_loc)));
        places.add(new Places(getString(R.string.technology_name), getString(R.string.technology_address), getString(R.string.technology_desc), R.drawable.technology, getString(R.string.technology_url), getString(R.string.technology_loc)));



        //Set the adapter for the places
        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places);


        ListView listView = (ListView) rootView.findViewById(R.id.list_place);

        listView.setAdapter(adapter);

        //Return the fragment rootview
        return rootView;
    }
}

