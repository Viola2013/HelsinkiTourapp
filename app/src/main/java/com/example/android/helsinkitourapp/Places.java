package com.example.android.helsinkitourapp;

/**
 * Created by Mervi on 11.6.2017.
 */

public class Places {

    //The name of the place
    private String mPlaceName;

    //The address of the place
    private String mPlaceAddress;

    //The description of the place
    private String mPlaceDescription;

    //The ID of the image resource of the place
    private int mPlaceImageResourceID;

    //The site URL of the place
    private String mPlaceSiteURL;

    //The location coordinates of the place
    private String mPlaceLocation;


    //Public constructor of the Place
    public Places(String name, String address, String description, int imageResourceID, String siteUrl, String location){
        mPlaceName = name;
        mPlaceAddress = address;
        mPlaceImageResourceID = imageResourceID;
        mPlaceDescription = description;
        mPlaceSiteURL = siteUrl;
        mPlaceLocation = location;
    }



    //Get the name of the place
    public String getName(){
        return mPlaceName;
    }

    //Get the address of the place
    public String getAddress(){
        return mPlaceAddress;
    }

    //Get the description of the place
    public String getDescription(){
        return mPlaceDescription;
    }

    //Get the image resource ID of the place
    public int getImageResourceID(){
        return mPlaceImageResourceID;
    }

    //Get the site URL of the place
    public String getSiteURL(){
        return mPlaceSiteURL;
    }

    //Get the location coordinates of the place
    public String getLocation(){
        return mPlaceLocation;
    }
}