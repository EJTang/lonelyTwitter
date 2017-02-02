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
     * Important tweet is a subclass of Tweet and expresses the tweets
     * importance by adding "!!!!" to the end of the message
     *
     * @param date    the date
     * @param message the message that is to be use for the tweet
     * @throws TweetTooLongException if the tweet exceeds the maximum character limit
     */
    public ImportantTweet(Date date, String message) throws TweetTooLongException{
        super(date, message);
    }

    /**
     * Instantiates a new Important tweet with the current date.
     * See ImportantTweet(Date date, String message) for more details
     *
     * @param message the message that is to be used for the tweet
     * @throws TweetTooLongException if the tweet exceeds the maximum character limit
     */
    public ImportantTweet(String message) throws TweetTooLongException {
        super(message);
    }

    /**
     * sets the Boolean to True, this will allow our program to check if the
     * tweet is an important tweet and if it is we will add the emphasis to the tweet
     * @return Boolean.TRUE
     */
    public Boolean isImportant() {
        return Boolean.TRUE;
    }

    /**
     * overriding the getMessage() of our superclass since we want to add more
     * to the original tweet to indicate that it is a important message.
     * @return Tweet + "!!!!"
     */
    @Override
    public String getMessage() {
        return super.getMessage() + "!!!!";
    }
}
