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
 * PayPal is a subclass for Wallet and implements the PaymentStrategy
 *
 * PayPal is a concrete strategy.
 *
 */
public class PayPal extends Wallet implements PaymentStrategy {

    // private property
    private String email;

    // constructor
    public PayPal(String name, String email) {
        super(name);
        this.email = email;
    }

    /**
     * simulates a PayPal payment
     *
     * @param amount to be paid
     *
     * Concrete strategies implement different variations of an algorithm that
     * the context uses.
     */
    @Override
    public void pay(int amount) {
        System.out.println(this.getName() + " paid $" + (int) (amount) + " using PayPal payment.\n");
    }

}
