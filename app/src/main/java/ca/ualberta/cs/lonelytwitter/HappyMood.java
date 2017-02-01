package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by ejtang on 1/17/17.
 * Happy mood that is a subclass of mood
 * sets the mood to happy
 */
public class HappyMood extends Mood {
    /**
     * Instantiates a new Happy mood.
     *
     * @param date the date
     */
    public HappyMood(Date date) {
        super(date, "Happy");
    }

    /**
     * Instantiates a new Happy mood.
     */
    public HappyMood() {
        super("Happy");
    }
}
