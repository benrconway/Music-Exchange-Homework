package com.example.user.musicexchange;

/**
 * Created by user on 09/09/2017.
 */

public class SheetMusic implements Sellable {
    private int costPrice;
    private int salePrice;

    public SheetMusic(int costPrice, int salePrice){
        this.costPrice = costPrice;
        this.salePrice = salePrice;
    }

    public int getCostPrice() {
        return costPrice;
    }

    public int getSalePrice() {
        return salePrice;
    }

    public int calculateMarkUp(){
        int cost = this.getCostPrice();
        int sale = this.getSalePrice();
        int markUp = sale - cost;
        return markUp;
    }
}