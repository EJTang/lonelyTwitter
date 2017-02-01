package ca.ualberta.cs.lonelytwitter;

/**
 * Created by ejtang on 1/17/17.
 * This exception specifically lets our program know that the tweet that is
 * trying to get posted is too long and will throw an exception.
 */
public class TweetTooLongException  extends Exception{
    public TweetTooLongException() {

    }

    /**
     * Construstor for our TweetTooLongException
     * @param detailMessage a more detailed message about what went
     *                      wrong
     */
    public TweetTooLongException(String detailMessage) {
        super(detailMessage);
    }
}
