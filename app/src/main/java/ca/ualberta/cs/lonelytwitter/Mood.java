package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by ejtang on 1/17/17.
 * This class allows users to input a mood they may be feeling
 * The mood class is an abstract class and must be created with one of its
 * sub classes.
 */

public abstract class Mood {
    private Date date;
    private String mood;

    /**
     * Constructor for out mood class, this will set the mood
     * as well as the date that is given to us
     * @param date date given by program
     * @param mood mood that the user is feeling this is given by the subclasses of
     *             moods
     */
    public Mood(Date date, String mood) {
        this.date = date;
        this.mood = mood;
    }

    /**
     * Constructor for out mood class, this will set the mood
     * @param mood mood that the user is feeling this is given by the subclasses of
     *             moods
     */
    public Mood(String mood) {
        this.date = new Date();
        this.mood = mood;
    }

    /**
     * Sends a string version of the mood to allow for printing of our class
     * @return mood
     */
    public String getMood() {
        return mood;
    }

    /**
     * Gets date of our mood
     *
     * @return date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets date of our mood, this is if we are not given a specific date,
     * we will set it to the current date
     */
    public void setDate() {
        this.date = new Date(); // current time and date
    }

    /**
     * Sets date. given a specific date by the user
     *
     * @param date the date
     */
    public void setDate(Date date) {
        this.date = date;
    }


}
