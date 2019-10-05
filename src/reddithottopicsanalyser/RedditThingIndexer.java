/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reddithottopicsanalyser;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * The RedditThingIndexer class takes an ArrayList of RedditThing objects and
 * searches through to find unique words from the title and selftext string
 * variables of each RedditThing. Indexing stores each unique word as a key in a
 * HashMap. The values of this HashMap are RedditWordItems. Indexing creates new
 * RedditWordItem objects storing a word, count and all redditThing objects that
 * are associated with that word. The HashMap can be searched for specific
 * words, sorted and retrieved.
 *
 * @author Maxwell Coleman
 */
public class RedditThingIndexer {

    private ArrayList<RedditThing> things = new ArrayList<>();
    private Map<String, RedditWordItem> words = new HashMap<>();

    /**
     * Constructs a RedditThingIndexer containing a List of the given
     * RedditThing Objects.
     *
     * @param rt ArrayList of RedditThing objects to be contained
     */
    public RedditThingIndexer(ArrayList<RedditThing> rt) {
        this.things = rt;
    }

    /**
     * Traverses the ArrayList things containing RedditThing objects and indexes
     * words from selftext and title string variables. Stores unique words as
     * keys in the HashMap words. Each unique word is also stored in a
     * RedditWordItem object along with a count of how many times it occurs and
     * each RedditThing that contains that word. The RedditWordItem is then
     * stored as the value of the corresponding key.
     *
     * @see RedditThing
     * @see RedditWordItem
     */
    public void index() {
        for (int i = 0; things.size() > i; i++) {
            String[] textArr = (things.get(i).getSelftext() + " " + things.get(i).getTitle()).split(" ");
            for (String s : textArr) {
                if (!s.equals("")) {
                    if (words.containsKey(s)) {
                        words.get(s).incCount();
                    } else {
                        words.put(s, new RedditWordItem(s));
                    }
                    words.get(s).add(things.get(i));
                }
            }
        }
    }

    /**
     * Searches the objects' indexed words for the key that corresponds to a
     * given String. Returns the value of that key.
     *
     * @param word a String representing which word is to be retrieved.
     * @return The RedditWordItem object that corresponds to the given String.
     */
    public RedditWordItem getWordItem(String word) {
        for (int i = 0; i < words.size(); i++) {
            if (words.containsKey(word)) {
                System.out.println("word: " + words.get(word).getWord());
                System.out.println("how many times the " + word + " shows: " + words.get(word).getCount());
                System.out.println("records that used the word: ");
                RedditThing[] array = new RedditThing[words.get(word).getThings().size()];
                words.get(word).getThings().toArray(array);
                for (RedditThing temp : array) {
                    System.out.println(temp);
                }
                return words.get(word);
            } else {
                return null;
                
            }
        }
        return null;
    }

    /**
     * Returns the values of the objects' indexed words as an ArrayList of
     * RedditWordItem objects.
     *
     * @return All RedditWordItem objects as an ArrayList.
     */
    public ArrayList<RedditWordItem> getWordItems() {
        ArrayList<RedditWordItem> WordItems = new ArrayList<>(words.values());
        return WordItems;
    }

    /**
     * Returns the values of the objects' indexed words as an ArrayList of
     * RedditWordItem objects and sorts them largest to smallest by their count
     * variables numerically.
     *
     * @return All RedditWordItem objects as a sorted ArrayList.
     * @see RedditWordItemCountComparator
     */
    public ArrayList<RedditWordItem> getSortedWordItems() {
        ArrayList<RedditWordItem> SortedWordItems = new ArrayList<>(words.values());
        Collections.sort(SortedWordItems, new RedditWordItemCountComparator());
        return SortedWordItems;
    }

    /**
     * Finds and returns the RedditWordItem object with the largest count
     * variable.
     *
     * @return The RedditWordItem that has the highest count variable.
     */
    public RedditWordItem mostUsed() {
        return (getSortedWordItems().get(0));
    }
}
