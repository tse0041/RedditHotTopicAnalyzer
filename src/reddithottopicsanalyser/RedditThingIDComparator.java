/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reddithottopicsanalyser;

import java.util.Comparator;

/**
 * The RedditThingIDComparator class compares two RedditThing Objects' ID
 * variables lexicographically.
 *
 * @author Maxwell Coleman
 * @see RedditThing
 */
public class RedditThingIDComparator implements Comparator<RedditThing> {

    /**
     * Compares two RedditThing objects lexicographically based on their ID
     * variables. The result is a negative integer if the ID variable of the
     * RedditThing being compared to is lexicographically less than that of
     * RedditThing object being compared; The result is a positive integer if
     * this ID variable of the RedditThing being compared to is
     * lexicographically greater than that of RedditThing object being compared;
     * The result is zero if the ID variables of both RedditThings are equal.
     *
     * @param t RedditThing object to be compared to
     * @param t1 RedditThing object being compared
     * @return the value 0 if the RedditThing objects being compared have equal
     * ID variables; a value less than 0 if the RedditThing object to be
     * compared to has a ID variable that is lexicographically less than that of
     * RedditThing object being compared; and a value greater than 0 if the
     * RedditThing object to be compared to has a ID variable that is
     * lexicographically greater than that of RedditThing object being compared.
     */
    public int compare(RedditThing t, RedditThing t1) {
        return t.getId().compareTo(t1.getId());
    }

}
