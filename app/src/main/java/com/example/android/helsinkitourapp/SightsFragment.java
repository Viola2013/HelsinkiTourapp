package com.example.android.helsinkitourapp;

/* Created by Mervi on 17.6.2017.*/

import android.support.v4.app.Fragment;

        import android.os.Bundle;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ListView;
        import java.util.ArrayList;

public class SightsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //Inflate the list
        View rootView = inflater.inflate(R.layout.list_place, container, false);

        //Create the ArrayList for the places
        ArrayList<Places> places = new ArrayList<>();

        //Add the places to the ArrayList
        places.add(new Places(getString(R.string.Helsinki_cathedral_name), getString(R.string.Helsinki_cathedral_address), getString(R.string.Helsinki_cathedral_desc), R.drawable.cathedral, getString(R.string.Helsinki_cathedral_url), getString(R.string.Helsinki_Cathedral_loc)));
        places.add(new Places(getString(R.string.Suomenlinna_name), getString(R.string.Suomenlinna_address), getString(R.string.Suomenlinna_desc), R.drawable.suomenlinna, getString(R.string.Suomenlinna_url), getString(R.string.Suomenlinna_loc)));
        places.add(new Places(getString(R.string.Zoo_name), getString(R.string.Zoo_address), getString(R.string.Zoo_desc), R.drawable.korkeasaari_logo, getString(R.string.Zoo_url), getString(R.string.Zoo_loc)));
        places.add(new Places(getString(R.string.Linnanmaki_name), getString(R.string.Linnanmaki_address), getString(R.string.Linnanmaki_desc), R.drawable.linnanmaki, getString(R.string.Linnanmaki_url), getString(R.string.Linnanmaki_loc)));
        places.add(new Places(getString(R.string.Olympic_stadium_name), getString(R.string.Olympic_stadium_address), getString(R.string.Olympic_stadium_desc), R.drawable.olympic_stadium, getString(R.string.Olympic_stadium_url), getString(R.string.Olympic_stadium_loc)));
        places.add(new Places(getString(R.string.Parliament_name), getString(R.string.Parliament_address), getString(R.string.Parliament_desc), R.drawable.parliament, getString(R.string.Parliament_url), getString(R.string.Parliament_loc)));

        //Set the adapter for the places
        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places);


        ListView listView = (ListView) rootView.findViewById(R.id.list_place);

        listView.setAdapter(adapter);

        //Return the fragment rootview
        return rootView;
    }

}
