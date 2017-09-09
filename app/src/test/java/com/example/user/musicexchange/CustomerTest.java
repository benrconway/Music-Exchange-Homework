package com.example.user.musicexchange;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by user on 09/09/2017.
 */
public class CustomerTest {

    Customer customer;
    Shop shop;
    Wind ocarina;

    @Before
    public void before(){
        customer = new Customer();
        shop = new Shop();
        ocarina = new Wind(InstrumentStyle.WIND, "Dragontooth", 10, 120);
    }

    @Test
    public void canGetBag() {
        assertEquals(0, customer.getBag().size());
    }

    @Test
    public void canGetWallet() {
        assertEquals(400, customer.getWallet());
    }

    @Test
    public void canBuyItem(){
        shop.buyIntoStock(ocarina);
        customer.buyItem(ocarina, shop);
        assertEquals(280, customer.getWallet());
        assertEquals(1, customer.getBag().size());
        assertEquals(ocarina, customer.getBag().get(0));
        assertEquals(0, shop.getStock().size());
        assertEquals(1610, shop.accountBalance());
    }

}