package com.example.user.musicexchange;


import static org.junit.Assert.*;
import org.junit.*;

/**
 * Created by user on 09/09/2017.
 */

public class SellableItemsTest {
    SheetMusic sheetMusic;
    MusicStand musicStand;

    @Before
    public void before(){
        sheetMusic = new SheetMusic(3,20);
        musicStand = new MusicStand(7, 15);
    }

    @Test
    public void canGetCostPrice(){
        assertEquals(3, sheetMusic.getCostPrice());
        assertEquals(7, musicStand.getCostPrice());
    }

    @Test
    public void canGetSalePrice(){
        assertEquals(20, sheetMusic.getSalePrice());
        assertEquals(15, musicStand.getSalePrice());
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(17, sheetMusic.calculateMarkUp());
        assertEquals(8, musicStand.calculateMarkUp());
    }

}
