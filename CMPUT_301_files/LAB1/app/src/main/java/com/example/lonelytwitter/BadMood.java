package com.example.lonelytwitter;

import java.util.Date;

public class BadMood extends Mood implements Moodable{
    public BadMood(){
        super();
    }

    public BadMood(Date date){
        super(date);
    }

    public BadMood(Date date, String mood){
        super(date, mood);
    }

    @Override
    public Boolean isHappy() {
        return Boolean.FALSE;
    }


    @Override
    public String getMood() {
        return "I am not happy";
    }
}
