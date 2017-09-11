package com.example.user.musicexchange;


/**
 * Created by user on 08/09/2017.
 */

public abstract class Instrument implements Playable, Sellable{
    private Enum<InstrumentStyle> type;
    private String name;
    private int costPrice;
    private int salePrice;

    public Instrument(Enum<InstrumentStyle> type, String name, int costPrice, int salePrice){
        this.type = type;
        this.name = name;
        this.costPrice = costPrice;
        this.salePrice = salePrice;
    }

    abstract public String play();

    abstract public int calculateMarkUp();

    public Enum<InstrumentStyle> getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getCostPrice() {
        return costPrice;
    }

    public int getSalePrice() {
        return salePrice;
    }
}
