package com.example.lonelytwitter;

import java.util.Date;

public class NormalTweet extends Tweet implements Tweetable{


    public NormalTweet() {
    }

    public NormalTweet(String message) {
        super(message);
    }

    public NormalTweet(Date date, String message) {
        super(date, message);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
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
        System.out.println("adaw");
    }


}
