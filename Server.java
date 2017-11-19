package com.example.myfirstattempt;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;

/**
 * Created by Preston on 11/18/2017.
 */

public class Server {

    private LinkedList<ServerThread> myThreads;
    private static final int PORT_NUMBER = 1234;

    public Server(){
        ServerSocket ss = null;
        myThreads = new LinkedList<ServerThread>();

        try {
            ss = new ServerSocket(PORT_NUMBER);
            while(true){
                Socket s = ss.accept();
                ServerThread st = new ServerThread(s, this);
                //TODO Add reference to database to ServerThread
                myThreads.add(st);

            }

        } catch(IOException e){
            System.out.println("ioe: " + e.getMessage());
        }

    }

}
