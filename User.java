package com.example.myfirstattempt;

import android.location.Location;
import android.location.LocationManager;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Prest`on on 11/13/2017.
 */

public class User implements Serializable{
    private static final long serialVerisionID = 1;
    protected Location myLocation;

    public User(){
        //TODO Get the current location of the user, see README for implementation and why it hasn't
        //TODO been implemented already
    }

    public ArrayList<Event> getNearbyEvents(){

        ArrayList<Event> temp = new ArrayList<Event>();
        return temp;
    }

    public RegisteredUser searchUser(String name){

        //TODO Hook up to database, search table for user with passed Name varaiable
        return null;

    }





}
