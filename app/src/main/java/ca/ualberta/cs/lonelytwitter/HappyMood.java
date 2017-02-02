package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by ejtang on 1/17/17.
 * Happy mood that is a subclass of mood
 * sets the mood to happy
 */
public class HappyMood extends Mood {
    /**
     * Instantiates a new Happy mood with the date parameter
     * calls the superclass with the String parameter "Happy"
     * to indicate the mood for the tweet and also sets
     * the date to a selected date instead of the current date
     * @param date the date
     */
    public HappyMood(Date date) {
        super(date, "Happy");
    }

    /**
     * Instantiates a new Happy mood.
     * calls the superclass with the String parameter "Happy"
     * to indicate the mood for the tweet
     */
    public HappyMood() {
        super("Happy");
    }
}
