/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reddithottopicsanalyser;

import java.util.Comparator;

/**
 * The RedditThingScoreComparator class compares two RedditThing Objects' score
 * variables numerically.
 *
 * @author Maxwell Coleman
 * @see RedditThing
 */
public class RedditThingScoreComparator implements Comparator<RedditThing> {

    /**
     * Compares two RedditThing objects numerically based on their score
     * variables. The result is a negative integer if the score variable of the
     * RedditThing being compared to is numerically less than that of
     * RedditThing object being compared; The result is a positive integer if
     * this score variable of the RedditThing being compared to is numerically
     * greater than that of RedditThing object being compared; The result is
     * zero if the score variables of both RedditThings are equal.
     *
     * @param t RedditThing object to be compared to
     * @param t1 RedditThing object being compared
     * @return the value 1 if the RedditThing object to be compared to has a
     * score variable that is numerically greater than that of RedditThing
     * object being compared; the value 0 if the RedditThing objects being
     * compared have equal score variables; the value -1 if the RedditThing
     * object to be compared to has a score variable that is numerically less
     * than that of RedditThing object being compared.
     */
    public int compare(RedditThing t, RedditThing t1) {
        if (t.getScore() > t1.getScore()) {
            return 1;
        } else if (t.getScore() == t1.getScore()) {
            return 0;
        }
        return -1;
    }

}
