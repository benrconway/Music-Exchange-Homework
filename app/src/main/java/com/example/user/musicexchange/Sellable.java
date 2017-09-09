package com.example.user.musicexchange;

/**
 * Created by user on 09/09/2017.
 */

public interface Sellable {
    int calculateMarkUp();

    int getCostPrice();

    int getSalePrice();

    String getName();
}
