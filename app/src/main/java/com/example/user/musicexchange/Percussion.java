package com.example.user.musicexchange;

/**
 * Created by user on 09/09/2017.
 */

public class Percussion extends Instrument {
    private Enum<InstrumentStyle> type;
    private String name;
    private int costPrice;
    private int salePrice;

    public Percussion(Enum<InstrumentStyle> type, String name, int costPrice, int salePrice){
        super(type, name, costPrice, salePrice);
    }

    public String play() {
        return "Boom Boom Bam!";
    }

    public int calculateMarkUp() {
        int cost = this.getCostPrice();
        int sale = this.getSalePrice();
        int markUp = sale - cost;
        System.out.println(sale);
        System.out.println(sale - cost);
        return markUp;
    }

}
