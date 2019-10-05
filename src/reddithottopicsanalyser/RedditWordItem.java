/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reddithottopicsanalyser;

import java.util.HashSet;

/**
 * The RedditWordItem class stores a word, count and a HashSet of RedditThing
 * objects. It contains method to get each variable, increment count and print
 * information about the object.
 * <p>
 * This class is used for creating objects that contain unique words and
 * associate RedditThings and a counts to the word.
 *
 * @author Maxwell Coleman
 */
public class RedditWordItem {

    String word;
    int count = 1;
    HashSet<RedditThing> things = new HashSet<>(); // TWL: good choice of data structure!

    /**
     * Constructs a RedditWordItem object containing a word.
     *
     * @param word String that is assigned to the object variable: word.
     */
    public RedditWordItem(String word) {
        this.word = word;
    }

    /**
     * Adds a RedditThing to the end of the objects' HashMap of associated
     * RedditThings.
     *
     * @param rt RedditThing to be added
     */
    public void add(RedditThing rt) {
        things.add(rt);
    }

    /**
     * Returns the objects' unique word.
     *
     * @return A string equal to word.
     */
    public String getWord() {
        return word;
    }

    /**
     * Returns the objects' count.
     *
     * @return An integer representing the variable count.
     */
    public int getCount() {
        return count;
    }

    /**
     * Increments the count by 1.
     */
    public void incCount() {
        count++;
    }

    /**
     * Returns the objects' HashSet of RedditThings.
     *
     * @return the variable things as a HashSet.
     */
    public HashSet<RedditThing> getThings() {
        return things;
    }

    /**
     * Returns a string representation of the class containing information
     * including the word, count and associated RedditThings.
     *
     * @return a string containing the word, count, size of things (how many
     * RedditThings are associated with the word), each the ID of every
     * RedditThing in the HashMap: things (all RedditThings associated with the
     * objects word).
     */
    @Override
    public String toString() {
        String s = "\n" + word + ", " + count + ", " + things.size() + ", [ ";
        for (RedditThing rt : things) {
            s += rt.getId() + " ";
        }
        return s += "]";
    }

}
