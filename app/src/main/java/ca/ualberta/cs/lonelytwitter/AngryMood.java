package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by ejtang on 1/17/17.
 * Angry mood that is a subclass of mood
 * sets the mood to angry
 */

public class AngryMood extends Mood {
    public AngryMood(Date date) {
        super(date, "Angry");

    }
    public AngryMood() {
        super("Angry");
    }
}
