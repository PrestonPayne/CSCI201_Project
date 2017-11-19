package com.example.myfirstattempt;

import java.io.Serializable;

/**
 * Created by Preston on 11/18/2017.
 */

public class Query implements Serializable{
    private static final long serialVersionID = 1;
    private static final int REGISTERED_USER = 1;
    private static final int EVENT = 2;
    private static final int COMMENT = 3;
    private static final int BOOL = 4;
    int myType = -1;
    String myScript = "";
    public Query(String key, int querryType){

        myType = querryType;

        //TODO Implement creation of mySQL script from key. Key is the name, etc of whatever is being searched for
    }

    public String getMyScript(){
        return myScript;
    }

    public int getMyType(){
        return myType;
    }

}
