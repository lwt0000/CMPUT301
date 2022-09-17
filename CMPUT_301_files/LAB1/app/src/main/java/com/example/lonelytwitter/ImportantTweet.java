package com.example.lonelytwitter;

import java.util.Date;

public class ImportantTweet extends Tweet implements Tweetable{
    public ImportantTweet(){
        super();
        //super keyword calls the parent class constructor,
        // paas a string will call the constroctor with a string as agrument
    }
    public ImportantTweet(String message){
        super(message);
    }

    public ImportantTweet(Date date, String message){
        super(date, message);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    @Override
    public Date getDate() {
        return this.date;
    }

    @Override
    public void printTweet() {

    }

}
