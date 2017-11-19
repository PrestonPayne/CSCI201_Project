package com.example.myfirstattempt;

import android.location.Location;

import java.io.Serializable;
import java.util.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Vector;

/**
 * Created by Preston on 11/13/2017.
 */

public class Event implements Serializable {

    private static final long serialVerisionID = 1;
    private Location myLocation;
    private Time myTime;
    private Date myDate;
    private String myTitle;
    private boolean isPast;
    private int accessibility;
    //Acessibility Legend: 1 = Public 2 = Friends 3 = Only participants
    private Vector<String> myMembers;
    private RegisteredUser myCreator;
    private ArrayList<Comment> myComments;

    public Event(RegisteredUser creator){
        myCreator = creator;
        myComments = new ArrayList<Comment>();
        myMembers = new Vector<String>();
        Date myDate = Calendar.getInstance().getTime();

    }

    public Event(RegisteredUser creator, Date date){
        myCreator = creator;
        myComments = new ArrayList<Comment>();
        myMembers = new Vector<String>();
        Date myDate = date;
    }


    public Vector<String> getMembers(){
        return myMembers;
    }

    public RegisteredUser getUserObjectFromName(String name){
        return null;
    }


    public void addMember(String name){
        myMembers.add(name);
    }

    public void removeMember(String name){
        for(String current : myMembers){
            if(current.equals(name)){
                myMembers.remove(current);
            }
        }
    }

    public void addComment(String text, String author){
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

    public String getDateString(){
        String month =  String.valueOf(myDate.getMonth());
        String day = String.valueOf(myDate.getDate());
        String time = String.valueOf(myDate.getHours());
        return month + " " + day+ ", " + time;
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
