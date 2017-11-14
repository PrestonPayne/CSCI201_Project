package com.example.myfirstattempt;

import android.location.Location;

import java.util.ArrayList;

/**
 * Created by Preston on 11/13/2017.
 */

public class User {

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
