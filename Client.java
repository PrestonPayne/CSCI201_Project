package com.example.myfirstattempt;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Preston on 11/18/2017.
 */

public class Client extends Thread{
    private static final int REGISTERED_USER = 1;
    private static final int EVENT = 2;
    private static final int COMMENT = 3;
    private static final int BOOLEAN = 4;

    private ObjectOutputStream oos;
    private ObjectInputStream ois;

    public Client(){
        int myPort = 1234;
        String myHostName = "localhost";
        Socket s = null;
        try{
            s = new Socket(myHostName, myPort);
            oos = new ObjectOutputStream(s.getOutputStream());
            ois = new ObjectInputStream(s.getInputStream());
            this.start();
            while(true){
                //TODO HOW ARE ACTUALLY INTERACTING WITH THE CLIENT CLASS ITSELF?
                //TODO GENERATE QUERY HERE. ASK JACK FOR HELP ON SYNTAX OF QUERY
                String key = "";
                int messageType = 0;
                Query myQuery = new Query(key, messageType);
                oos.writeObject(myQuery);
                oos.flush();
            }


        }catch (IOException ioe){
            System.out.println("ioe:" + ioe.getMessage());
        }
    }

    public void run(){
        try{
            while(true){
                //TODO MAY NEED TO IMPLEMENT A RESPONSE CLASS SO THAT THE CLIENT CAN PARSE WHAT IT IS GIVEN, SAME AS SERVER
                //ACTUALLY WE ALMOST DEFINITELY SHOULD WRITE A RESPONSE CLASS
                Object placeholder = ois.readObject();
            }
        }catch(ClassNotFoundException cnfe){

        }catch(IOException ioe){
            
        }
    }

}
