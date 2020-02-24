/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.designpatterns.strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author amritaramnauth
 */
public class App {

    public static void main(String[] args) throws IOException {

        // Instance of shopping cart
        Cart shoppingCart = new Cart();

        // Instance of items
        Item item1 = new Item("milk", 123, 300);
        Item item2 = new Item("cheese", 123, 1500);

        // Add items to shopping cart
        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);

        // Instance of a reader to read text from the System.in input stream for keyboard input in your console
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Select your payment method: \n1. Credit Card\n2. PayPal\n");

        // captures value passed to reader
        int paymentOption = 0;
        try {
            // parse value as number
            paymentOption = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException nfe) {
            // throws exception if reader input is not number
            System.out.println("Invalid number format");
        }

        // Instance of context
        PaymentContext paymentContext = new PaymentContext();

        // Context sets the strategy associated with the selected payment option
        if (paymentOption == 1) {
            paymentContext.setStrategy(new CreditCard("John Doe", "12345", "678", "08/2022"));
        } else {
            paymentContext.setStrategy(new PayPal("Jane Doe", "jane@email.com"));
        }

        /**
         * The context calls the execution method of the linked strategy object
         * each time it needs to run. The context doesn't know how the algorithm
         * is implemented for the different strategies.
         */
        paymentContext.pay(shoppingCart.calculateTotal());
    }
}
