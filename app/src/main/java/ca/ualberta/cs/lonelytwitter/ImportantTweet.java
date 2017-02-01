package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by ejtang on 1/17/17.
 * This class marks a Tweet as an important tweet and whenever the
 * class is called to get printed we add extra "!!!!" to the end of the string
 * This class will set the isImportant Boolean to true to indicated to our
 * program that this tweet is important
 */

public class ImportantTweet extends Tweet {

    /**
     * Instantiates a new Important tweet.
     *
     * @param date    the date
     * @param message the message
     * @throws TweetTooLongException the tweet too long exception
     */
    public ImportantTweet(Date date, String message) throws TweetTooLongException{
        super(date, message);
    }

    public ImportantTweet(String message) throws TweetTooLongException {
        super(message);
    }

    public Boolean isImportant() {
        return Boolean.TRUE;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + "!!!!";
    }
}
