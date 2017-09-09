package com.example.user.musicexchange;

import static junit.framework.Assert.*;
import org.junit.*;

/**
 * Created by user on 08/09/2017.
 */
public class WindTest {
    Wind wind;

    @Before
    public void before(){
        wind = new Wind(InstrumentStyle.WIND, "Ocarina", 10, 25);
    }

    @Test
    public void canGetType(){
        assertEquals(InstrumentStyle.WIND, wind.getType());
    }

    @Test
    public void canGetName(){
        assertEquals("Ocarina", wind.getName());
    }

    @Test
    public void canGetCostPrice(){
        assertEquals(10, wind.getCostPrice());
    }

    @Test
    public void canGetSalePrice(){
        assertEquals(25, wind.getSalePrice());
    }

    @Test
    public void canPlay(){
        assertEquals("Tweet Toot Tweet", wind.play());
    }

    @Test
    public void canCalculateMarkUp() {
        assertEquals(15, wind.calculateMarkUp());
    }

}