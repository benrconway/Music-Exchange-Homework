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
        shop.buyIntoStock(ocarina);
        assertEquals(1, shop.getStock().size());
        assertEquals(ocarina, shop.getStock().get(0));
    }

    @Test
    public void canRemoveStockFromShop(){
        shop.buyIntoStock(ocarina);
        shop.buyIntoStock(stompBox);
        shop.removeFromStock(ocarina);
        assertEquals(1, shop.getStock().size());
        assertEquals("BigFoot", shop.getStock().get(0).getName());
    }

    @Test
    public void canCalculatePotentialProfit(){
        shop.buyIntoStock(ocarina);
        shop.buyIntoStock(stompBox);
        shop.buyIntoStock(mozart);
        shop.buyIntoStock(stand);
        assertEquals(179, shop.calculateProfit());
    }

    @Test
    public void addingtoStockReducesAccountBalance(){
        shop.buyIntoStock(ocarina);
        assertEquals(1470, shop.accountBalance());
    }


    @Test
    public void canCheckStockFail(){
        shop.buyIntoStock(stand);
        assertFalse(shop.checkStock(ocarina));
    }

    @Test
    public void canCheckStockPass(){
        shop.buyIntoStock(stand);
        assertTrue(shop.checkStock(stand));
    }

    @Test
    public void sellingStockIncreasesAccountBalance(){
        shop.buyIntoStock(ocarina);
        shop.sellItem(ocarina);
        assertEquals(1620, shop.accountBalance());
        assertEquals(0, shop.getStock().size());
    }



}
