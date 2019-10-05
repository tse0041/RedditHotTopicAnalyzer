/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reddithottopicsanalyser;

/**
 * The RedditThing class stores a static rtCount which represents how many
 * RedditThings have been made and an rtNumber which assigned when a new
 * RedditThing to indicate in which order they were initialized. RedditThing
 * also stores the ID number, title, selftext, selftext_html, date created,
 * subreddit, author, score, up-votes and down-votes of a Reddit topic.
 * <p>
 * This class is used to store different Reddit topics and their entities.
 *
 * @author Maxwell Coleman
 */
public class RedditThing {

    private static int rtCount = 0;
    private int rtNumber = 0;
    private String id;
    private String title;
    private String selftext;
    private String selftext_html;
    private String created;
    private String subreddit;
    private String author;
    private int score;
    private int ups;
    private int downs;

    /**
     * Constructs a RedditThing object that contains the ID, title, selftext,
     * selftext_html, date created, subreddit, author, score, up-votes and
     * down-votes of a Reddit topic.
     *
     * @param id String that is assigned to the object variable: id.
     * @param title String that is assigned to the object variable: title.
     * @param selftext String that is assigned to the object variable: selftext.
     * @param selftext_html String that is assigned to the object variable:
     * selftext_html.
     * @param created String that is assigned to the object variable: created.
     * @param subreddit String that is assigned to the object variable:
     * subreddit.
     * @param author String that is assigned to the object variable: author.
     * @param score Integer that is assigned to the object variable: score.
     * @param ups Integer that is assigned to the object variable: ups.
     * @param downs Integer that is assigned to the object variable: downs.
     */
    public RedditThing(String id, String title, String selftext, String selftext_html, String created, String subreddit, String author, int score, int ups, int downs) {
        this.id = id;
        this.title = title;
        this.selftext = selftext;
        this.selftext_html = selftext_html;
        this.created = created;
        this.subreddit = subreddit;
        this.author = author;
        this.score = score;
        this.ups = ups;
        this.downs = downs;
        rtCount++;
        rtNumber = rtCount;
    }

    /**
     * Returns the rtNumber of the RedditThing as an integer.
     *
     * @return An int equal to the rtNumber.
     */
    public int getRtNumber() {
        return rtNumber;
    }

    /**
     * Returns the id of the RedditThing as a string.
     *
     * @return A string equal to id.
     */
    public String getId() {
        return id;
    }

    /**
     * Returns the title of the RedditThing as a string.
     *
     * @return A string equal to title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Returns the selftext of the RedditThing as a string.
     *
     * @return A string equal to selftext.
     */
    public String getSelftext() {
        return selftext;
    }

    /**
     * Returns the selftext_html of the RedditThing as a string.
     *
     * @return A string equal to selftext_html.
     */
    public String getSelftext_html() {
        return selftext_html;
    }

    /**
     * Returns the created of the RedditThing as a string.
     *
     *
     * @return A string equal to created.
     */
    public String getCreated() {
        return created;
    }

    /**
     * Returns the subreddit of the RedditThing as a string.
     *
     * @return A string equal to subreddit.
     */
    public String getSubreddit() {
        return subreddit;
    }

    /**
     * Returns the author of the RedditThing as a string.
     *
     *
     * @return A string equal to author.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Returns the score of the RedditThing as a integer.
     *
     *
     * @return A integer equal to the value of score.
     */
    public int getScore() {
        return score;
    }

    /**
     * Returns the ups of the RedditThing as a integer.
     *
     *
     * @return A integer equal to the value of ups.
     */
    public int getUps() {
        return ups;
    }

    /**
     * Returns the downs of the RedditThing as a integer.
     *
     *
     * @return A integer equal to the value of downs.
     */
    public int getDowns() {
        return downs;
    }

    /**
     * Returns a string representation of the class containing information
     * including the rtNumber, id, title, selftext, selftext_html, date created,
     * subreddit, author, score, up-votes and down-votes of the object.
     *
     * @return a string containing the rtNumber, id, title, selftext,
     * selftext_html, created, subreddit, author, score, up-votes, down-votes
     * and identifiers for each.
     */
    @Override
    public String toString() {
        return id + ", " + author + ", " + title;
        /*
        return ("\nRedditThing: " + rtNumber
                + "\nid = " + id
                + "\ntitle = " + title
                + "\nselftext = " + selftext
                + "\nselftext_html = " + selftext_html
                + "\ncreated = " + created
                + "\nsubreddit = " + subreddit
                + "\nauthor = " + author
                + "\nscore = " + score
                + "\nups = " + ups
                + "\ndowns = " + downs
                + "\n");
        */
    }

}
