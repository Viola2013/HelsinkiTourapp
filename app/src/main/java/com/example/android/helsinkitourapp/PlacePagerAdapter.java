package com.example.android.helsinkitourapp;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


/**
 * Created by Mervi on 16.6.2017.
 */


public class PlacePagerAdapter extends FragmentPagerAdapter {

    private final Context mContext;

    //Public constructor for the ViewPager Adapter
    public PlacePagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        //Set the Fragments as ViewPager items
        //And else is required!!
        if (position == 0){
            return new SightsFragment();
        }
        else if (position == 1){
            return new RestaurantsFragment();
        }
        else if (position == 2){
            return new MuseumsFragment();
        }
        else{
            return new ShoppingFragment();
        }
    }

    @Override
    public int getCount() {

        //Returns the number of items of the Viewpager
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        //Set the titles of the tabs for the TabLayout
        if (position == 0){
            return mContext.getString(R.string.sights);
        }
        else if (position == 1){
            return mContext.getString(R.string.restaurants);
        }
        else if (position == 2){
            return mContext.getString(R.string.museums);
        }
        else {
            return mContext.getString(R.string.shopping);
        }
    }
}