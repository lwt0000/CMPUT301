package com.example.lonelytwitter;

import java.util.Date;

public abstract class Mood {
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    protected Date date;
    protected String mood;//using protected as Encapsulation

    public Mood(){
        this.date = new Date();
        this.mood = "";
    }
    public Mood(Date date){
        this.date = date;
    }

    public Mood(Date date, String mood){
        this.mood = mood;
        this.date = date;
    }

    public void print_current_mood(){
        System.out.println("I am in default mood");
    }
    public abstract Boolean isHappy();
}
