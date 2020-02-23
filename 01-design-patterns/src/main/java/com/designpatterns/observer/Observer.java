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
public interface Observer {

    /**
     * Update() defines the action to be taken when subject provides new data.
     *
     * Here we intend to update the displays data for all the observers who
     * implement this interface. (AverageScoreDisplay & CurrentScoreDisplay)
     *
     * @param runs new runs value to update
     * @param wickets new wickets value to update
     * @param overs new overs value to update
     */
    public void update(int runs, int wickets, float overs);
}
