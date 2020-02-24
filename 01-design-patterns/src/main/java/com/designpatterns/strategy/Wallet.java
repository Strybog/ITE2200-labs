/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.designpatterns.strategy;

/**
 *
 * @author amritaramnauth
 */

/**
 * Wallet abstraction
 */
public class Wallet {

    // private property
    private String name;

    // Constructor
    Wallet(String name) {
        this.name = name;
    }

    /**
     * Gets name
     * @return name
     */
    public String getName() {
        return name;
    }

}
