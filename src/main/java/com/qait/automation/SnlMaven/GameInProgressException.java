package com.qait.automation.SnlMaven;

/**
 *
 * @author Ramandeep 
 */
public class GameInProgressException extends Exception{
    
    public GameInProgressException(){
        super("New player cannot join since the game has started");
    }
}
