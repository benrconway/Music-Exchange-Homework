package com.example.user.musicexchange;

import static org.junit.Assert.*;
import org.junit.*;

/**
 * Created by user on 09/09/2017.
 */

public class ShopTest {
    Wind ocarina;
    Wind flute;
    Percussion stompBox;
    Percussion triangle;
    SheetMusic mozart;
    MusicStand stand;
    Shop shop;


    @Before
    public void before(){
        ocarina = new Wind(InstrumentStyle.WIND, "Dragontooth", 30, 150);
        flute = new Wind(InstrumentStyle.WIND, "Folk", 5, 60);
        stompBox = new Percussion(InstrumentStyle.PERCUSSION, "BigFoot", 8, 35);
        triangle = new Percussion(InstrumentStyle.PERCUSSION, "C-minor", 5, 8);
        mozart = new SheetMusic(5, 25);
        stand = new MusicStand(8, 20);
        shop = new Shop();
    }

    @Test
    public void shopBeginsEmpty(){
        assertEquals(0, shop.getStock().size());
    }

    @Test
    public void canGetAccountBalance(){
        assertEquals(1500, shop.accountBalance());
    }

    @Test
    public void canAddStockToShop(){
        shop.addToStock(ocarina);
        assertEquals(1, shop.getStock().size());
        assertEquals(ocarina, shop.getStock().get(0));
    }

    @Test
    public void canRemoveStockFromShop(){
        shop.addToStock(ocarina);
        shop.addToStock(stompBox);
        shop.removeFromStock(ocarina);
        assertEquals(1, shop.getStock().size());
        assertEquals("BigFoot", shop.getStock().get(0).getName());
    }

    @Test
    public void canCalculatePotentialProfit(){
        shop.addToStock(ocarina);
        shop.addToStock(stompBox);
        shop.addToStock(mozart);
        shop.addToStock(stand);
        assertEquals(179, shop.calculateProfit());
    }

    @Test
    public void addingtoStockReducesAccountBalance(){
        shop.addToStock(ocarina);
        assertEquals(1470, shop.accountBalance());
    }


}
