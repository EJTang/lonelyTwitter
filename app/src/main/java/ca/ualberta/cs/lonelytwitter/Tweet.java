package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by romansky on 1/14/16.
 */
public abstract class Tweet implements Comparable<Tweet>{
    protected String message;
    private Date date;

    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    public Tweet(String message) {
        this.message = message;
        this.date = new Date(System.currentTimeMillis());
    }

    public Date getDate() {
        return date;
    }

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140) {
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage(){
        return this.message;
    }

    abstract public boolean isImportant();

    public int compareTo(Tweet tweet) {
        return getDate().compareTo(tweet.getDate());
    }

    @Override
    public String toString(){
        return date.toString() + " | " + message;
    }
}
