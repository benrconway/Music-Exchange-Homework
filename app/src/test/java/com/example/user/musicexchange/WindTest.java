package com.example.user.musicexchange;

import org.junit.Before;
import org.junit.Test;

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
    public void canGetType
}