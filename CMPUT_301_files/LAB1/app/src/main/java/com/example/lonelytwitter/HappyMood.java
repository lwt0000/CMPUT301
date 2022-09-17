package com.example.lonelytwitter;

import java.util.Date;

public class HappyMood extends Mood implements Moodable{
    public HappyMood(){
        super();
    }

    public HappyMood(Date date){
        super(date);
    }

    public HappyMood(Date date, String mood){
        super(date, mood);
    }

    @Override
    public Boolean isHappy() {
        return Boolean.TRUE;
    }

    @Override
    public String getMood() {
        return "I am Happy";
    }
}
