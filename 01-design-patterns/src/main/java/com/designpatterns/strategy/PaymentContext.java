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
public class PaymentContext {

    // Context maintains a reference to one of the concrete strategies
    private PaymentStrategy strategy;

    // Context exposes a setter which lets client replace the strategy associated with the context at run-time
    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    // Context only communication with the object is via the strategy (in this case, PaymentStrategy) interface
    public void pay(int amount) {
        this.strategy.pay(amount);
    }
}
