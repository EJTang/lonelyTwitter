package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by ejtang on 1/17/17.
 * Angry mood that is a subclass of mood
 * sets the mood to angry
 */
public class AngryMood extends Mood {

    /**
     * Instantiates a new Happy mood with the date parameter
     * calls the superclass with the String parameter "Angry"
     * to indicate the mood for the tweet and also sets
     * the date to a selected date instead of the current date
     * @param date the date
     */
    public AngryMood(Date date) {
        super(date, "Angry");

    }

    /**
     * Instantiates a new Angry mood.
     * calls the superclass with the String parameter "Angry"
     * to indicate the mood for the tweet
     */
    public AngryMood() {
        super("Angry");
    }
}
