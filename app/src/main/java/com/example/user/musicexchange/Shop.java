package com.example.user.musicexchange;

import java.util.*;

/**
 * Created by user on 09/09/2017.
 */

class Shop {
    private ArrayList<Sellable> stock;
    private int account;

    public Shop(){
        this.account = 1500;
        this.stock = new ArrayList<>();
    }


    public int accountBalance() {
        return account;
    }
    public ArrayList<Sellable> getStock() {
        ArrayList<Sellable> currentStock = this.stock;
        return currentStock;
    }

    public void addToStock(Sellable item) {
        stock.add(item);
    }

    public void removeFromStock(Sellable item) {
        ArrayList<Sellable> filteredStock = new ArrayList<>();
        for (Sellable itemInStock: this.stock){
           if (itemInStock != item){
               filteredStock.add(itemInStock);
           }
        }
        this.stock = filteredStock;
    }

    public int calculateProfit() {
        int potentialProfit = 0;
        for(Sellable itemInStock: this.stock){
            potentialProfit += itemInStock.calculateMarkUp();
        }
        return potentialProfit;

    }

}
