package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by ejtang on 1/17/17.
 */

public class NormalTweet extends Tweet {
    /**
     * Instantiates a new Normal tweet with the date specified by the program and user
     *
     * @param date    the date specified by the program
     * @param message the message that is to be associated with the tweet
     * @throws TweetTooLongException if the tweet exceeds the character limit
     */
    public NormalTweet(Date date, String message) throws TweetTooLongException {
        super(date, message);
    }

    /**
     * Instantiates a new Normal tweet and sets the date to the current date
     * see Tweet for more details
     *
     * @param message the message that is to be associated with the tweet
     * @throws TweetTooLongException if the tweet exceeds the character limit
     */
    public NormalTweet(String message) throws TweetTooLongException {
        super(message);
    }

    /**
     * sets the boolean isImportant() to false so we know that the tweet
     * is not a important tweet and just a normal one
     * @return Boolean.FALSE
     */
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
