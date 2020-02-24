/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.designpatterns.strategy;

import java.util.ArrayList;

/**
 *
 * @author amritaramnauth
 */

/**
 * Shopping cart abstraction
 */
public class Cart {

    // cart contains list of items
    private ArrayList<Item> items;

    Cart() {
        // instantiate the items list
        this.items = new ArrayList<Item>();
    }

    /**
     * Adds an item to cart
     * @param newItem item to add
     */
    public void addItem(Item newItem) {
        this.items.add(newItem);
    }

    /**
     * Removes an item from cart
     * @param removeItem item to remove from cart
     */
    public void removeItem(Item removeItem) {
        this.items.remove(removeItem);
    }

    /**
     * Calculates total for all items in cart
     * @return total cost for items in cart
     */
    public int calculateTotal() {
        int sum = 0;
        for (Item item : items) {
            sum += item.getPrice();
        }
        return sum;
    }
}
