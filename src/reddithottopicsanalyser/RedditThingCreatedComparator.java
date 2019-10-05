/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reddithottopicsanalyser;

import java.util.Comparator;

/**
 * The RedditThingCreatedComparator class compares two RedditThing Objects'
 * created variables lexicographically.
 *
 * @author Maxwell Coleman
 * @see RedditThing
 */
public class RedditThingCreatedComparator implements Comparator<RedditThing> {

    /**
     * Compares two RedditThing objects lexicographically based on their created
     * variables. The result is a negative integer if the created variable of
     * the RedditThing being compared to is lexicographically less than that of
     * RedditThing object being compared; The result is a positive integer if
     * this created variable of the RedditThing being compared to is
     * lexicographically greater than that of RedditThing object being compared;
     * The result is zero if the created variables of both RedditThings are
     * equal.
     *
     * @param t RedditThing object to be compared to
     * @param t1 RedditThing object being compared
     * @return the value 0 if the RedditThing objects being compared have equal
     * created variables; a value less than 0 if the RedditThing object to be
     * compared to has a created variable that is lexicographically less than
     * that of RedditThing object being compared; and a value greater than 0 if
     * the RedditThing object to be compared to has a created variable that is
     * lexicographically greater than that of RedditThing object being compared.
     */
    @Override
    public int compare(RedditThing t, RedditThing t1) {
        return t.getCreated().compareTo(t1.getCreated());
    }
}
