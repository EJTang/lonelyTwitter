package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by ejtang on 1/17/17.
 * Interface that Tweet must follow
 * This indicates that all tweets must have a message, date, and list of moods
 */

public interface Tweetable {
    public String getMessage();
    public Date getDate();
    public ArrayList<Mood> getMoods();
}
