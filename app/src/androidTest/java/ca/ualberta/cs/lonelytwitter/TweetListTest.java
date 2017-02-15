/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by ejtang on 2/14/17.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2{

    public TweetListTest() {
        super(LonelyTwitterActivity.class);
    }

    public void testAddTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test tweet");

        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));

    }

    public void testGetTweet() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Another Test Tweet");

        tweets.add(tweet);
        Tweet returnedTweet = tweets.getTweet(0);

        assertEquals(returnedTweet.getMessage(), tweet.getMessage());
        assertEquals(returnedTweet.getDate(), tweet.getDate());
    }

    public void testDeleteTweet() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Last tweet");

        tweets.add(tweet);
        tweets.delete(tweet);

        assertFalse(tweets.hasTweet(tweet));
    }

    public void testStrings() {
        assertEquals("'test' should be 'test'","test", "test");
        assertTrue("'test' should start with 't'","test".startsWith("t"));
    }

    public void testAddTweets() {
        TweetList tweets = new TweetList();
        Date date = new Date();
        Tweet tweet = new NormalTweet("same tweet", date);

        try {
            tweets.addTweet(tweet);
            tweets.addTweet(tweet);
            fail();
        } catch (IllegalArgumentException e) {
        }
    }
    public void testGetTweets() {
        TweetList tweets = new TweetList();
        Date date = new Date();
        tweets.add(new NormalTweet("tweet 1"));
        tweets.add(new NormalTweet("tweet 2"));
        tweets.add(new NormalTweet("tweet 3"));
        tweets.add(new NormalTweet("tweet 4"));
        tweets.add(new NormalTweet("tweet 5",date));

        ArrayList<Tweet> returnedTweets = new ArrayList<Tweet>();
        returnedTweets = tweets.getTweets();
        int n = tweets.getCount();
        for (int i = 1; i < n; i++) {
            assertFalse(tweets.getTweet(i-1).getDate().before(tweets.getTweet(i).getDate()));
        }
    }
    public void testHasTweet() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("tweet 1");
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }
    public void testGetCount() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("tweet 1");
        tweets.add(tweet);
        assertEquals("The TweetList should have 1 tweet",tweets.getCount(),1);
    }
}
