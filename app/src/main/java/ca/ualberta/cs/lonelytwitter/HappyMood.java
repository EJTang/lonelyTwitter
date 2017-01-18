package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by ejtang on 1/17/17.
 */

public class HappyMood extends Mood {
    public HappyMood(Date date) {
        super(date, "Happy");


    }
    public HappyMood() {
        super("Happy");
    }
}
