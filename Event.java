package com.example.myfirstattempt;

import android.location.Location;

import java.util.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Calendar;

/**
 * Created by Preston on 11/13/2017.
 */

public class Event {



    private Location myLocation;
    private Time myTime;
    private Date myDate;
    private String myTitle;
    private boolean isPast;
    private int accessibility;
    //Acessibility Legend: 1 = Public 2 = Friends 3 = Only participants
    private ArrayList<RegisteredUser> myMembers;
    private RegisteredUser myCreator;
    private ArrayList<Comment> myComments;

    public Event(RegisteredUser creator){
        myCreator = creator;
        myComments = new ArrayList<Comment>();
        myMembers = new ArrayList<RegisteredUser>();
        Date myDate = Calendar.getInstance().getTime();

    }

    public Event(RegisteredUser creator, Date date){
        myCreator = creator;
        myComments = new ArrayList<Comment>();
        myMembers = new ArrayList<RegisteredUser>();
        Date myDate = date;
    }


    public ArrayList<RegisteredUser> getMembers(){
        return myMembers;
    }

    public void addMember(RegisteredUser u){
        myMembers.add(u);
    }

    public void removeMember(RegisteredUser u){
        myMembers.remove(u);
    }

    public void addMember(String name){
        //TODO Hook up to database, find member by name, add to list
    }

    public void removeMember(String name){
        for(RegisteredUser current : myMembers){
            if(current.getName().equals(name)){
                myMembers.remove(current);
            }
        }
    }

    public void addComment(String text, RegisteredUser author){
        myComments.add(new Comment(text, this, author));
    }

    public ArrayList<Comment> getComments(){
        return myComments;
    }

    public android.location.Location getLocation() {
        return myLocation;
    }

    public void setLocation(android.location.Location location) {
        myLocation = location;
    }

    public java.sql.Time getTime() {
        return myTime;
    }

    public void setTime(java.sql.Time time) {
        myTime = time;
    }

    public java.util.Date getDate() {
        return myDate;
    }

    public void setDate(java.sql.Date date) {
        myDate = date;
    }

    public String getTitle() {
        return myTitle;
    }

    public void setTitle(String title) {
        myTitle = title;
    }

    public boolean isPast() {

        if(isPast == true){
            return isPast;
        }

        Date currentDate = Calendar.getInstance().getTime();
        if(myDate.after(currentDate)){
            isPast = true;
            return isPast;
        }

        return isPast;
    }

    public int getAccessibility() {
        return accessibility;
    }

    public void setAccessibility(int accessibility) {
        this.accessibility = accessibility;
    }

    public RegisteredUser getCreator() {
        return myCreator;
    }






}
