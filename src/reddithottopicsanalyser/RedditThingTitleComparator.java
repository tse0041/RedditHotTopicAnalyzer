/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reddithottopicsanalyser;

import java.util.Comparator;

/**
 * The RedditThingTitleComparator class compares two RedditThing Objects' title
 * variables lexicographically.
 *
 * @author Maxwell Coleman
 * @see RedditThing
 */
public class RedditThingTitleComparator implements Comparator<RedditThing> {

    /**
     * Compares two RedditThing objects lexicographically based on their title
     * variables. The result is a negative integer if the title variable of the
     * RedditThing being compared to is lexicographically less than that of
     * RedditThing object being compared; The result is a positive integer if
     * this title variable of the RedditThing being compared to is
     * lexicographically greater than that of RedditThing object being compared;
     * The result is zero if the title variables of both RedditThings are equal.
     *
     * @param t RedditThing object to be compared to
     * @param t1 RedditThing object being compared
     * @return the value 0 if the RedditThing objects being compared have equal
     * title variables; a value less than 0 if the RedditThing object to be
     * compared to has a title variable that is lexicographically less than that
     * of RedditThing object being compared; and a value greater than 0 if the
     * RedditThing object to be compared to has a title variable that is
     * lexicographically greater than that of RedditThing object being compared;
     */
    @Override
    public int compare(RedditThing t, RedditThing t1) {
        return t.getTitle().compareTo(t1.getTitle());
    }

}
