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
/**
 * CurrentScoreDisplay implements the observer interface as it needs to update
 * data on change
 */
public class CurrentScoreDisplay implements Observer {

    // private properties
    private int runs, wickets;
    private float overs;

    // private property to reference the subject   
    private Subject scoreSubject;

    /**
     * Constructor
     *
     * @param s subject instance to register our observer on
     */
    CurrentScoreDisplay(Subject s) {
        // sets the subject
        this.scoreSubject = s;

        // registers current observer instance (this keyword) with our scoreSubject
        this.scoreSubject.registerObserver(this);
    }

    /**
     * Implements the observer update()
     *
     * @param runs value to update
     * @param wickets value to update
     * @param overs value to update
     */
    @Override
    public void update(int runs, int wickets, float overs) {
        this.runs = runs;
        this.wickets = wickets;
        this.overs = overs;

        this.display();
    }

    /**
     * Displays the CurrentScoreDetails to console
     */
    public void display() {
        System.out.println("Current Score Display\n Runs: " + this.runs + "\n Wickets: " + this.wickets + "\n Overs: "
                + this.overs);
    }
    
}
