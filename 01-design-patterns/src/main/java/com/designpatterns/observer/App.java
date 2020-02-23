/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.designpatterns.observer;

/**
 *
 * @author amritaramnauth
 */
public class App {

    public static void main(String[] args) {

        // creates an instance of CricketData subject
        // cricketData subject maintains the observer list (all subscribed observers)
        CricketData cricketData = new CricketData();

        // creates an observer for AverageScoreDisplay 
        // constructor registers the observer on the cricketData subject
        AverageScoreDisplay avgScoreDisplayObserver = new AverageScoreDisplay(cricketData);

        // creates an observer for CurrentScoreDisplay
        // likewise, here as well, the constructor registers the observer on the cricketData subject
        CurrentScoreDisplay currentScoreDisplayObserver = new CurrentScoreDisplay(cricketData);

        /**
         * Here we update the subject's data properties, so all observers
         * registered with the cricketData subject will be notified of the
         * change.
         *
         */
        cricketData.setOvers(10);
        cricketData.setRuns(20);
        
        // unregisters the currentScoreDisplayObserver
        cricketData.unregisterObserver(currentScoreDisplayObserver);
        
        cricketData.setRuns(100);

    }
}
