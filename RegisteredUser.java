package com.example.myfirstattempt;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Preston on 11/13/2017.
 */

public class RegisteredUser extends User implements Serializable{
    private static final long serialVerisionID = 1;
    private String myName;
    private int myAge;
    private int myUserID;
    private String myEmail;
    private boolean myGender;
    private String myPassword;
    private ArrayList<RegisteredUser> myFriends = new ArrayList<RegisteredUser>();
    private ArrayList<Event> myEvents = new ArrayList<Event>();


    public RegisteredUser(String name, int age, int userID, String email, boolean gender){
        myName = name;
        myAge = age;
        myUserID = userID;
        myEmail = email;
    }

    public RegisteredUser(String name, int age, int userID, String email, boolean gender, String password){
        myName = name;
        myAge = age;
        myUserID = userID;
        myEmail = email;
        myGender = gender;
    }

    public RegisteredUser(String name, int age, int userID, String email, boolean gender, ArrayList<Event> events){
        myName = name;
        myAge = age;
        myUserID = userID;
        myEmail = email;
        myGender = gender;
        myEvents = events;
    }

    public RegisteredUser(String name, int age, int userID, String email, boolean gender, String password, ArrayList<Event> events){
        myName = name;
        myAge = age;
        myUserID = userID;
        myEmail = email;
        myGender = gender;
        myPassword = password;
        myEvents = events;
    }

    public RegisteredUser(String name, int age, int userID, String email, boolean gender, String password, ArrayList<RegisteredUser> friends, ArrayList<Event> events){
        myName = name;
        myAge = age;
        myUserID = userID;
        myEmail = email;
        myGender = gender;
        myPassword = password;
        myFriends = friends;
        myEvents = events;
    }


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
