/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reddithottopicsanalyser;

import java.util.ArrayList;
import java.util.Collections;

/**
 * The RedditThingSort class sorts ArrayLists of RedditThing objects based on
 * their variables; created, ID, Title, Subreddit and score. Contains methods
 * that sort by the chosen variable.
 *
 * @author Maxwell Coleman
 */
public class RedditThingSort {

    /**
     * Sorts an ArrayList of RedditThing objects based on their created.
     *
     * @param inputList ArrayList of RedditThing objects to be sorted.
     * @return An ArrayList of RedditThings sorted lexicographically by created.
     * @see RedditThingCreatedComparator
     * @see Collections#sort(java.util.List, java.util.Comparator)
     */
    public ArrayList<RedditThing> sortByCreated(ArrayList<RedditThing> inputList) {
        Collections.sort(inputList, new RedditThingCreatedComparator());
        return inputList;
    }

    /**
     * Sorts an ArrayList of RedditThing objects based on their ID.
     *
     * @param inputList ArrayList of RedditThing objects to be sorted.
     * @return An ArrayList of RedditThings sorted lexicographically by ID.
     * @see RedditThingIDComparator
     * @see Collections#sort(java.util.List, java.util.Comparator)
     */
    public ArrayList<RedditThing> sortById(ArrayList<RedditThing> inputList) {
        Collections.sort(inputList, new RedditThingIDComparator());
        return inputList;
    }

    /**
     * Sorts an ArrayList of RedditThing objects based on their title.
     *
     * @param inputList ArrayList of RedditThing objects to be sorted.
     * @return An ArrayList of RedditThings sorted lexicographically by title.
     * @see RedditThingTitleComparator
     */
    public ArrayList<RedditThing> sortByTitle(ArrayList<RedditThing> inputList) {
        Collections.sort(inputList, new RedditThingTitleComparator());
        return inputList;
    }

    /**
     * Sorts an ArrayList of RedditThing objects based on their subreddit.
     *
     * @param inputList ArrayList of RedditThing objects to be sorted.
     * @return An ArrayList of RedditThings sorted lexicographically by
     * subreddit.
     * @see RedditThingSubredditComparator
     * @see Collections#sort(java.util.List, java.util.Comparator)
     */
    public ArrayList<RedditThing> sortBySubreddit(ArrayList<RedditThing> inputList) {
        Collections.sort(inputList, new RedditThingSubredditComparator());
        return inputList;
    }

    /**
     * Sorts an ArrayList of RedditThing objects based on their score.
     *
     * @param inputList ArrayList of RedditThing objects to be sorted.
     * @return An ArrayList of RedditThings sorted numerically by score.
     * @see RedditThingScoreComparator
     * @see Collections#sort(java.util.List, java.util.Comparator)
     */
    public ArrayList<RedditThing> sortByScore(ArrayList<RedditThing> inputList) {
        Collections.sort(inputList, new RedditThingScoreComparator());
        return inputList;
    }

}
