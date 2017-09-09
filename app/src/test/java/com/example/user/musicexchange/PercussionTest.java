package com.example.user.musicexchange;
import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by user on 09/09/2017.
 */
public class PercussionTest {

    Percussion stompBox;

    @Before
    public void before(){
        stompBox = new Percussion(InstrumentStyle.PERCUSSION, "StompBox", 5, 20);
    }

    @Test
    public void canGetType(){
        assertEquals(InstrumentStyle.PERCUSSION, stompBox.getType());
    }

    @Test
    public void canGetName(){
        assertEquals("StompBox", stompBox.getName());
    }

    @Test
    public void canGetCostPrice(){
        assertEquals(5, stompBox.getCostPrice());
    }

    @Test
    public void canGetSalePrice(){
        assertEquals(20, stompBox.getSalePrice());
    }

    @Test
    public void canPlay(){
        assertEquals("Boom Boom Bam!", stompBox.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(15, stompBox.calculateMarkUp());
    }

}