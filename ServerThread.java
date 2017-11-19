package com.example.myfirstattempt;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Date;

/**
 * Created by Preston on 11/18/2017.
 */

public class ServerThread extends Thread{

    private ObjectInputStream ois;
    private ObjectOutputStream oos;
    private Server myServer;

    public ServerThread(Socket s, Server server){
        try{
            this.myServer = server;
            oos = new ObjectOutputStream(s.getOutputStream());
            ois = new ObjectInputStream(s.getInputStream());
            this.start();
        }catch (IOException e){
            System.out.println("IOE: " + e.getMessage());
        }
    }


    public void run(){
        try{
            while(true){
                Query query = (Query) ois.readObject();
                String script = query.getMyScript();
                int type = query.getMyType();
                switch(type){
                    case 1: //TODO Add hook to database here, and for all cases
                        //RegisteredUser is return type
                        String name = "";
                        int age = 0;
                        int userID = 0;
                        String email = "";
                        boolean gender = false;
                        RegisteredUser temp = new RegisteredUser(name, age, userID, email, gender);
                        //String password = "";
                        //ArrayList<RegisteredUser> friends;
                        //ArrayList<Event> events;
                        //RegisteredUser temp = new RegisteredUser(name, age, userID, email, gender, password, friends, events);
                        break;
                    case 2: //TODO Add hook to database
                        //Event is return type
                        //TODO IMPORANT!!! - Should author be a registeredUser or String? String easier to parse from database, just requires front end
                        //todo to call getUserObjectFromName from the database (ie make another request)
                        //String author="";
                        RegisteredUser author=null;
                        Date date = null;
                        //TODO MAYBE CONSIDER NOT SAVING DATE AS ANYTHING BUT A STRING, BECAUSE
                        //TODO PARSING THE DATE OBJECT IS GOING TO BE TERRIBLE
                        Event output = new Event(author, date);
                        oos.writeObject(output);
                        break;
                    case 3: //TODO Add hook to database
                        //COMMENT is return type
                        String content = "";
                        Event event = null;
                        String userName = null;
                        Comment outputComment = new Comment(content, event, userName);
                        //TODO Are we ever quering for a comment but not an event? Event has a list of comments, may not ever need to use this segment
                        oos.writeObject(outputComment);
                        break;
                    case 4: //TODO Add hook to database
                        boolean bol = false;
                        oos.writeObject(bol);
                        break;
                }
            }
        }catch (IOException ioe){
            System.out.println(ioe.getMessage());
        }catch (ClassNotFoundException cnfe){
            System.out.println("CNFE: " + cnfe.getMessage());
        }



    }
}
