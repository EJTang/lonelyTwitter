package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by ejtang on 1/17/17.
 */

public interface Tweetable {
    public String getMessage();
    public Date getDate();
    public ArrayList<Mood> getMoods();
}
