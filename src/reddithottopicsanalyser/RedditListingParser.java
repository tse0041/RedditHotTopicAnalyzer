/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reddithottopicsanalyser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.stream.JsonParsingException;

/**
 * The RedditListingParser class finds a Json file and proceeds to parse through
 * each child extracting specific entities. These entities include the ID,
 * title, selftext, selftext_html, created, subreddit, author, score, up-votes
 * and down-votes. A new RedditThing is created for each child and assigned
 * these entities. An ArrayList of all children is then returned when all
 * children have been parsed.
 *
 * @author Maxwell Coleman
 */
public class RedditListingParser {

    /**
     * Reads a file, parses it and returns an array list of RedditThing objects
     * that contain the parsed data. Each child of the Json file is assigned a
     * RedditThing object by parsing and assigning variables using the
     * {@link RedditListingParser#addRedditThing(javax.json.JsonObject) addRedditThing(JsonObject)}
     * method. The returned RedditThing is then added to an ArrayList. When all
     * children are assigned a RedditThing object the ArrayList is returned.
     *
     * @param fileName the name of file being parsed
     * @return an ArrayList of RedditThing objects for each child of the Json
     * file.
     * @see RedditListingParser#addRedditThing(javax.json.JsonObject)
     * addRedditThing(JsonObject)
     * @throws FileNotFoundException If the filename passed is not found the
     * FileNotFoundException is thrown
     * @throws RedditListingParserException If the Json files' data is malformed
     * the RedditListingParserException is thrown
     */
    public ArrayList<RedditThing> parse(String fileName) throws FileNotFoundException, RedditListingParserException {
        JsonReader jsonReader = Json.createReader(new FileInputStream(fileName));
        JsonObject fileData = null;
        try {
            fileData = jsonReader.readObject();
        } catch (JsonParsingException e) {
            throw new RedditListingParserException("Error parsing due to malformed Json file");
        }
        JsonObject jsonData = fileData.getJsonObject("data");
        JsonArray children = jsonData.getJsonArray("children");

        ArrayList<RedditThing> parsedList = new ArrayList();

        for (int i = 0; i < children.size(); i++) {
            JsonObject child = children.getJsonObject(i);
            JsonObject childData = child.getJsonObject("data");
            parsedList.add(addRedditThing(childData));
        }
        return parsedList;
    }

    /**
     * Takes a JsonObject; parses and assigns the ID, title, selftext,
     * selftext_html, created, subreddit, author, score, ups and downs entities
     * to a new RedditThing object. The new RedditThing object is returned.
     *
     * @param childData the JsonObject to be parsed.
     * @return a RedditThing object containing the parsed JsonObject data.
     */
    public RedditThing addRedditThing(JsonObject childData) {
        RedditThing newRedditThing = new RedditThing(
                childData.getString("id"),
                childData.getString("title"),
                childData.getString("selftext"),
                childData.getString("selftext_html", ""),
                childData.getInt("created") + "",
                childData.getString("subreddit"),
                childData.getString("author"),
                childData.getInt("score"),
                childData.getInt("ups"),
                childData.getInt("downs")
        );
        return newRedditThing;
    }
}
