package com.example.user.musicexchange;

import java.util.*;

/**
 * Created by user on 09/09/2017.
 */

public class Customer {
    private ArrayList<Sellable> bag;
    private int wallet;

    public Customer(){
        bag = new ArrayList<>();
        wallet = 400;
    }

    public ArrayList<Sellable> getBag() {
        return bag;
    }

    public int getWallet() {
        return wallet;
    }


    public void buyItem(Sellable item, Shop shop) {
        if( this.wallet >= item.getSalePrice()){
            wallet -= item.getSalePrice();
            Sellable itemSold = shop.sellItem(item);
            bag.add(itemSold);

        }
    }
}
