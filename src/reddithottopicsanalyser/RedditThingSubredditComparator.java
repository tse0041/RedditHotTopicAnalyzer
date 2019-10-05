/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reddithottopicsanalyser;

import java.util.Comparator;

/**
 * The RedditThingSubredditComparator class compares two RedditThing Objects'
 * subreddit variables lexicographically.
 *
 * @author Maxwell Coleman
 * @see RedditThing
 */
public class RedditThingSubredditComparator implements Comparator<RedditThing> {

    /**
     * Compares two RedditThing objects lexicographically based on their
     * subreddit variables. The result is a negative integer if the subreddit
     * variable of the RedditThing being compared to is lexicographically less
     * than that of RedditThing object being compared; The result is a positive
     * integer if this subreddit variable of the RedditThing being compared to
     * is lexicographically greater than that of RedditThing object being
     * compared; The result is zero if the subreddit variables of both
     * RedditThings are equal.
     *
     * @param t RedditThing object to be compared to
     * @param t1 RedditThing object being compared
     * @return the value 0 if the RedditThing objects being compared have equal
     * subreddit variables; a value less than 0 if the RedditThing object to be
     * compared to has a subreddit variable that is lexicographically less than
     * that of RedditThing object being compared; and a value greater than 0 if
     * the RedditThing object to be compared to has a subreddit variable that is
     * lexicographically greater than that of RedditThing object being compared.
     */
    @Override
    public int compare(RedditThing t, RedditThing t1) {
        return t.getSubreddit().compareTo(t1.getSubreddit());
    }
}
