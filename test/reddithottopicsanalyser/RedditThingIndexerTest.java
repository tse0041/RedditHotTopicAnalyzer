/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reddithottopicsanalyser;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class RedditThingIndexerTest {

    public RedditThingIndexerTest() {
    }

    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of index method, of class RedditThingIndexer.
     */
    @Test
    public void testIndex() throws FileNotFoundException, RedditListingParserException {
        System.out.println("index");
        String fileName = "data/askscience-1.json";
        RedditListingParser rlp = new RedditListingParser();
        ArrayList<RedditThing> parsedList = rlp.parse(fileName);
        RedditThingIndexer instance = new RedditThingIndexer(parsedList);
        instance.index();
        ArrayList<RedditWordItem> rwiArray = instance.getWordItems();
        int expResult = 17;
        int result = rwiArray.size();
        assertEquals(expResult, result);
    }

    /**
     * Test of getWordItem method, of class RedditThingIndexer.
     */
    @Test
    public void testGetWordItemWithWordCount() throws FileNotFoundException, RedditListingParserException {
        System.out.println("getWordItem");
        String word = "we";
        String fileName = "data/askscience-1.json";
        RedditListingParser rlp = new RedditListingParser();
        ArrayList<RedditThing> parsedList = rlp.parse(fileName);
        RedditThingIndexer instance = new RedditThingIndexer(parsedList);
        instance.index();
        int expResult = 3;
        int result = instance.getWordItem(word).count;
        assertEquals(expResult, result);

    }
    
    @Test
    public void testGetWordItemWithString() throws FileNotFoundException, RedditListingParserException {
        System.out.println("getWordItem");
        String word = "What";
        String fileName = "data/askscience-5.json";
        RedditListingParser rlp = new RedditListingParser();
        ArrayList<RedditThing> parsedList = rlp.parse(fileName);
        RedditThingIndexer instance = new RedditThingIndexer(parsedList);
        instance.index();
        String expResult = "\nWhat, 2, 2, [ 85kaz5 85kp0d ]";
        String result = instance.getWordItem(word).toString();
        assertEquals(expResult, result);

    }

    /**
     * Test of getSortedWordItems method, of class RedditThingIndexer.
     */
    @Test
    public void testGetSortedWordItems() throws FileNotFoundException, RedditListingParserException {
        System.out.println("getSortedWordItems");
        String fileName = "data/askscience-1.json";
        RedditListingParser rlp = new RedditListingParser();
        ArrayList<RedditThing> parsedList = rlp.parse(fileName);
        RedditThingIndexer instance = new RedditThingIndexer(parsedList);
        instance.index();
        String expResult = "we";
        String result = instance.getSortedWordItems().get(0).getWord();
        assertEquals(expResult, result);

    }

    /**
     * Test of mostUsed method, of class RedditThingIndexer.
     */
    @Test
    public void testMostUsed() throws FileNotFoundException, RedditListingParserException {
        System.out.println("mostUsed");
        String fileName = "data/askscience-1.json";
        RedditListingParser rlp = new RedditListingParser();
        ArrayList<RedditThing> parsedList = rlp.parse(fileName);
        RedditThingIndexer instance = new RedditThingIndexer(parsedList);
        instance.index();
        String expResult = "we";
        String result = instance.mostUsed().getWord();
        assertEquals(expResult, result);
    }
}
