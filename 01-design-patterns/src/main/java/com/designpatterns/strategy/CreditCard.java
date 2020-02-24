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
 * CreditCard is a subclass for Wallet and implements the PaymentStrategy
 *
 * CreditCard is a concrete strategy.
 *
 */
public class CreditCard extends Wallet implements PaymentStrategy {

    // private properties
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    // constructor
    CreditCard(String name, String cardNo, String cvv, String exp) {
        super(name);
        this.cardNumber = cardNo;
        this.cvv = cvv;
        this.dateOfExpiry = exp;
    }

    /**
     * simulates a CreditCard payment
     *
     * @param amount to be paid
     *
     * Concrete strategies implement different variations of an algorithm that
     * the context uses.
     */
    @Override
    public void pay(int amount) {
        System.out.println(this.getName() + " paid $" + (int) (amount) + " using Credit Card payment.\n");
    }
}
