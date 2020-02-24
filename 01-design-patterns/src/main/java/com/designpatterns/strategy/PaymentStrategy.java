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
 * Strategy interface is common to all concrete strategies, it declares a method
 * the context uses to execute a strategy.
 *
 * All our concrete strategies can execute the pay() method from our
 * PaymentContext.
 */
public interface PaymentStrategy {

    /**
     * simulates making a payment
     * @param amount to be paid
     */
    public void pay(int amount);

}
