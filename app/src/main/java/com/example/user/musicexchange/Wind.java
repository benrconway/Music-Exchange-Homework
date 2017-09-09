package com.example.user.musicexchange;

/**
 * Created by user on 08/09/2017.
 */

public class Wind extends Instrument implements Playable {
    Enum<InstrumentStyle> type;
    String name;
    int costPrice;
    int salePrice;

    public Wind(Enum<InstrumentStyle> type, String name, int costPrice, int salePrice){
        super(type, name, costPrice, salePrice);
    }

    public String play() {
        return "Tweet Toot Tweet";
    }

    public int calculateMarkUp() {
        int cost = this.getCostPrice();
        int sale = this.getSalePrice();
        int markUp = sale - cost;
        return markUp;
    }
}
