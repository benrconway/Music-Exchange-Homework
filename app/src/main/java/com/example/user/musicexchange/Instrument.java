package com.example.user.musicexchange;
import java.util.*;


/**
 * Created by user on 08/09/2017.
 */

public abstract class Instrument implements Playable{
    Enum<InstrumentStyle> type;
    String name;
    int costPrice;
    int salePrice;

    public Instrument(Enum<InstrumentStyle> type, String name, int costPrice, int salePrice){
        this.type = type;
        this.name = name;
        this.costPrice = costPrice;
        this.salePrice = salePrice;
    }

    abstract public String play();

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
