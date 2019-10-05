/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reddithottopicsanalyser;

/**
 * The RedditListingParserException class takes a String that is presented if a
 * reddit listing parser exception occurs and passes it to the super class
 * constructor.
 *
 * @author Maxwell Coleman
 */
public class RedditListingParserException extends Exception {

    /**
     * Takes a string and passes it to the Exception constructor to display when
     * an exception is caused.
     *
     * @param message The message to be displayed when there is an exception.
     * @see Exception
     */
    RedditListingParserException(String message) {
        super(message);
    }

}
