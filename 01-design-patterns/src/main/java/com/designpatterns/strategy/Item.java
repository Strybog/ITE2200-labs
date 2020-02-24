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
 * Item abstraction
 */
public class Item {

    // private properties
    private int itemNo;
    private String itemName;
    private int price;

    // Constructor
    Item(String name, int no, int price) {
        this.itemName = name;
        this.itemNo = no;
        this.price = price;
    }

    /**
     * Getter to return item price
     * @return price of item
     */
    public int getPrice() {
        return this.price;
    }

}
