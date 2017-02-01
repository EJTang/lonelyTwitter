package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by ejtang on 1/17/17.
 *
 * Tweet class is a super class that implements Tweetable
 * Tweet is a message that will get posted directly on the screen.
 * Tweet can take in a array of moods which indicate how the user may be feeling
 */

public abstract class Tweet implements Tweetable{
    private Date date;
    private String message;
    private ArrayList<Mood> moods;
    //private String hiddenString

    /**
     * allows the user to get the date from our attributes
     * @return date
     */
    public Date getDate() {
        return date;
    }

    /**
     * allows the user to set the date in out attributes
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * allows the user to retrieve the message we have stored for the particular tweet
     * @return message that is in the tweet
     */
    public String getMessage() {
        return message;
    }

    /**
     * Allows the program to get the moods that the user may have set
     * when they posted their tweet
     * @return list of moods
     */
    public ArrayList<Mood> getMoods() {
        return moods;
    }

    /**
     * Instantiates a new Tweet. This is if we are given a date along with the
     * string for the message in the tweet
     *
     * @param date    the date
     * @param message the message
     * @throws TweetTooLongException the tweet too long exception
     */
    public Tweet(Date date, String message) throws TweetTooLongException {
        this.date = date;
        this.setMessage(message);
    }

    /**
     * Instantiates a new Tweet. This is the case where we are not provided the date,
     * and just the message that is to be our tweet
     *
     * @param message the message
     * @throws TweetTooLongException the tweet too long exception
     */
    public Tweet(String message) throws TweetTooLongException {
        this.setMessage(message);
        this.date = new Date(); //current time and date
    }
    public abstract Boolean isImportant();

    /**
     * sets the message to what is entered within our message parameter in the
     * EDITTEXT portion of our application.
     *
     * @param message message that is entered to be our tweet
     * @throws TweetTooLongException if the message length is greater than 144 which is the maximum
     * amount of characters for each tweet
     */
    public void setMessage(String message) throws TweetTooLongException {
        if(message.length() > 144) {
            //todo throw new error here
            throw new TweetTooLongException();
        } else {
            this.message = message;
        }
    }

    /**
     * This method will return a string for when the program is trying to
     * print out the Tweet. This specifies the format that the tweet
     * will be displayed on the screen.
     * @return string to be displayed on screen
     */
    public String toString(){
        return date.toString() + " | " + message;
    }
}
