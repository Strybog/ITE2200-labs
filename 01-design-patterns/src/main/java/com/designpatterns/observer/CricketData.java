/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.designpatterns.observer;

import java.util.ArrayList;

/**
 *
 * @author amritaramnauth
 */
/**
 *
 * CricketData implements Subject (hence an Observable) and maintains a list of
 * observers, or registered subscribers.
 */
public class CricketData implements Subject {

    // public properties
    public int runs, wickets;
    public float overs;

    // observers list
    private ArrayList<Observer> observers;

    // constructor
    CricketData() {
        // instantiate the observers list
        this.observers = new ArrayList<Observer>();
    }

    /**
     * Setter for runs property
     * @param runs value
     */
    public void setRuns(int runs) {
        this.runs = runs;

        // notify observers in list of the data change
        this.notifyObservers();
    }

    /**
     * Setter for wickets property  
     * @param wickets value
     */
    public void setWickets(int wickets) {
        this.wickets = wickets;

        // notify observers in list of the data change
        this.notifyObservers();
    }

    /**
     * Setter for overs property
     * @param overs value
     */
    public void setOvers(float overs) {
        this.overs = overs;

        // notify observers in list of the data change
        this.notifyObservers();
    }

    /**
     * Registers or subscribes an observer in the observer list
     *
     * @param newObserver to add to list
     */
    @Override
    public void registerObserver(Observer newObserver) {
        this.observers.add(newObserver);
    }

    /**
     * Removes or unsubscribes an observer from the observer list
     *
     * @param removeObserver to remove from list
     */
    @Override
    public void unregisterObserver(Observer removeObserver) {
        this.observers.remove(removeObserver);
    }

    /**
     * Notifies observers of data change
     *
     * Here, we iterate through our observer list (which is all our registered
     * observers) and call on update() to update the observer state.
     *
     * Note that our observers in this example have different implementations
     * for how the update() works.
     */
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(runs, wickets, overs);
        }
    }
}
