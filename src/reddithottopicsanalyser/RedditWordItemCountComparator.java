/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reddithottopicsanalyser;

import java.util.Comparator;

/**
 * The RedditWordItemCountComparator class compares two RedditWordItem Objects
 * based on their count variable.
 *
 * @author Maxwell Coleman
 * @see RedditThing
 */
public class RedditWordItemCountComparator implements Comparator<RedditWordItem> {

    /**
     * Compares two RedditWordItem objects numerically based on their count
     * variables. The result is a negative integer if the count variable of the
     * RedditWordItem being compared to is numerically less than that of
     * RedditWordItem object being compared; The result is a positive integer if
     * this count variable of the RedditWordItem being compared to is
     * numerically greater than that of RedditWordItem object being compared;
     * The result is zero if the count variables of both RedditWordItems are
     * equal.
     *
     * @param t RedditWordItem object to be compared to
     * @param t1 RedditWordItem object being compared
     * @return the value 1 if the RedditWordItem object to be compared to has a
     * count variable that is numerically greater than that of RedditWordItem
     * object being compared; the value 0 if the RedditWordItem objects being
     * compared have equal count variables; the value -1 if the RedditWordItem
     * object to be compared to has a count variable that is numerically less
     * than that of RedditWordItem object being compared.
     */
    @Override
    public int compare(RedditWordItem t, RedditWordItem t1) {
        if (t.getCount() > t1.getCount()) {
            return -1;
        } else if (t.getCount() == t1.getCount()) {
            return 0;
        }
        return 1;
    }

}
