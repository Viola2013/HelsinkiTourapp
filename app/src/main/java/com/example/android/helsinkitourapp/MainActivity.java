package com.example.android.helsinkitourapp;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create the viewpager
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        //Set the adapter for the viewpager
        PlacePagerAdapter adapter = new PlacePagerAdapter(getSupportFragmentManager(), this);
        viewPager.setAdapter(adapter);

        //Set the TabLayout for the ViewPager
        TabLayout tabs = (TabLayout) findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);

    }
}