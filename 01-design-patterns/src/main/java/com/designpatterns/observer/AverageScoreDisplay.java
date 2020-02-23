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
 * AverageScoreDisplay implements the observer interface as it needs to update
 * data on change
 */
public class AverageScoreDisplay implements Observer {

    // private properties
    private float runRate;
    private int predictedScore;
    private final int TOTAL_OVERS = 50;

    // private property to reference the subject
    private Subject scoreSubject;

    /**
     * Constructor
     *
     * @param s subject instance to register our observer on
     */
    AverageScoreDisplay(Subject s) {
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
        this.runRate = (float) runs / overs;
        this.predictedScore = (int) (this.runRate * this.TOTAL_OVERS);

        this.display();
    }

    /**
     * Displays the AverageScoreDetails to console
     */
    public void display() {
        System.out.println(
                "Average Score Display\n" + " Run rate: " + this.runRate + "\n Predicted score: " + this.predictedScore);
    }
}
