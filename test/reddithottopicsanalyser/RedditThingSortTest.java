/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reddithottopicsanalyser;

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author user
 */
public class RedditThingSortTest {

    RedditThing thing1, thing2, thing3;
    ArrayList<RedditThing> list = new ArrayList<>();;

    public RedditThingSortTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        this.thing1 = new RedditThing("1234", "The Title", "The is some selftext", "selftext_html", "1521515108", "askscience", "Joe Bloggs", 9999, 1111, 2222);
        this.thing2 = new RedditThing("5555", "AAAA", "A,The is some selftext", "aselftext_html", "1121515108", "bscience", "A Bloggs", 1111, 2222, 3333);
        this.thing3 = new RedditThing("8888", "BBBB", "B,The is some selftext", "bselftext_html", "1221515108", "science", "B Bloggs", 5666, 5555, 5555);
        this.list.add(thing1);
        this.list.add(thing2);
        this.list.add(thing3);
    }

    /**
     * Test of sortByCreated method, of class RedditThingSort.
     */
    @Test
    public void testSortByCreated() {
        System.out.println("sortByCreated");       
        ArrayList<RedditThing> inputList = list;
        RedditThingSort instance = new RedditThingSort();
        String expResult = "5555";
        String result = instance.sortByCreated(inputList).get(0).getId();
        assertEquals(expResult, result);

    }

    /**
     * Test of sortById method, of class RedditThingSort.
     */
    @Test
    public void testSortById() {
        System.out.println("sortById");
        ArrayList<RedditThing> inputList = list;
        RedditThingSort instance = new RedditThingSort();
        String expResult = "1234";
        String result = instance.sortById(inputList).get(0).getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of sortByTitle method, of class RedditThingSort.
     */
    @Test
    public void testSortByTitle() {
        System.out.println("sortByTitle");
        ArrayList<RedditThing> inputList = list;
        RedditThingSort instance = new RedditThingSort();
        String expResult = "5555";
        String result = instance.sortByTitle(inputList).get(0).getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of sortBySubreddit method, of class RedditThingSort.
     */
    @Test
    public void testSortBySubreddit() {
        System.out.println("sortBySubreddit");
        ArrayList<RedditThing> inputList = list;
        RedditThingSort instance = new RedditThingSort();
        String expResult = "1234";
        String result = instance.sortBySubreddit(inputList).get(0).getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of sortByScore method, of class RedditThingSort.
     */
    @Test
    public void testSortByScore() {
        System.out.println("sortByScore");
        ArrayList<RedditThing> inputList = list;
        RedditThingSort instance = new RedditThingSort();
        String expResult = "5555";
        String result = instance.sortByScore(inputList).get(0).getId();
        assertEquals(expResult, result);
    }

}
