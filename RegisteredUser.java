package com.example.myfirstattempt;

import java.util.ArrayList;

/**
 * Created by Preston on 11/13/2017.
 */

public class RegisteredUser extends User{

    private int myAge;
    private int myUserID;
    private boolean myGender;
    private String myName;
    private String myEmail;
    private String myPassword;
    private ArrayList<RegisteredUser> myFriends = new ArrayList<RegisteredUser>();
    private ArrayList<Event> myEvents = new ArrayList<Event>();


    public void addEvent(Event event){
        myEvents.add(event);
    }

    public void removeEvent(Event event){
        myEvents.remove(event);
    }

    public void addFriend(int UserID){

        //TODO Hook up to Database, find list of users by UserID, add that user to myFriends

    }

    public RegisteredUser searchUser(String name){
        //TODO Hook up to Database, find user by name, return that user
        return null;
    }

    public void addFriend(RegisteredUser newFriend){
        myFriends.add(newFriend);
    }

    public void removeFriend(int otherUserID){

        for(RegisteredUser currentUser : myFriends){
            if(currentUser.getUserID() == otherUserID){
                myFriends.remove(currentUser);
            }
        }
    }

    public void removeFriend(RegisteredUser toRemove){

        myFriends.remove(toRemove);
    }

    public int getAge() {
        return myAge;
    }

    public void setAge(int myAge) {
        this.myAge = myAge;
    }

    public int getUserID() {
        return myUserID;
    }

    public void setUserID(int myUserID) {
        this.myUserID = myUserID;
    }

    public boolean getGender() {
        return myGender;
    }

    public void setGender(boolean myGender) {
        this.myGender = myGender;
    }

    public String getName() {
        return myName;
    }

    public void setName(String myName) {
        this.myName = myName;
    }

    public String getEmail() {
        return myEmail;
    }

    public void setEmail(String myEmail) {
        this.myEmail = myEmail;
    }

    public String getPassword() {
        return myPassword;
    }

    public void setPassword(String myPassword) {
        this.myPassword = myPassword;
    }
}
