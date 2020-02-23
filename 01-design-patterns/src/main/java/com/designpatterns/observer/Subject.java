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

public interface Subject {

    /**
     * Registers an observer
     * @param o observer to register
     */
    public void registerObserver(Observer o);

    /**
     * Removes an observer
     * @param o observer to remove
     */
    public void unregisterObserver(Observer o);

    /**
     * Notifies the observers (all subscribers) that data has changed
     */
    public void notifyObservers();
}
