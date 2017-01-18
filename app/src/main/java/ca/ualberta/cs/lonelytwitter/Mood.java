package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by ejtang on 1/17/17.
 */

public abstract class Mood {
    private Date date;
    private String mood;

    public Mood(Date date, String mood) {
        this.date = date;
        this.mood = mood;
    }
    public Mood(String mood) {
        this.date = new Date();
        this.mood = mood;
    }

    public String getMood() {
        return mood;
    }

    public Date getDate() {
        return date;
    }
    public void setDate() {
        this.date = new Date(); // current time and date
    }
    public void setDate(Date date) {
        this.date = date;
    }


}
