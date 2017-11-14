package com.example.myfirstattempt;

import android.location.Location;

import java.sql.Time;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Preston on 11/13/2017.
 */

public class Comment {

    private String comment;
    private Event myEvent;
    private RegisteredUser myCreator;
    private Date myDate;
    private Time myTime;
    private Location myLocation;

    public Comment(String text, Event event, RegisteredUser author){
        comment = text;
        myEvent = event;
        myCreator = author;
        myDate = Calendar.getInstance().getTime();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Event getMyEvent() {
        return myEvent;
    }

    public void setMyEvent(Event myEvent) {
        this.myEvent = myEvent;
    }

    public RegisteredUser getMyCreator() {
        return myCreator;
    }

    public void setMyCreator(RegisteredUser myCreator) {
        this.myCreator = myCreator;
    }

    public Date getMyDate() {
        return myDate;
    }

    public void setMyDate(Date myDate) {
        this.myDate = myDate;
    }

    public Time getMyTime() {
        return myTime;
    }

    public void setMyTime(Time myTime) {
        this.myTime = myTime;
    }

    public Location getMyLocation() {
        return myLocation;
    }

    public void setMyLocation(Location myLocation) {
        this.myLocation = myLocation;
    }

}
