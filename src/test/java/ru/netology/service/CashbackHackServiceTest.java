package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldCalcRemainAmountLess1000() {
        CashbackHackService cashbackHackService=new CashbackHackService();
        int amount = 300;
        int actual = cashbackHackService.remain(amount);
        int expected = 700;
        assertEquals(expected,actual);
    }

    @Test
    public void shouldCalcRemainAmountMore1000() {
        CashbackHackService cashbackHackService=new CashbackHackService();
        int amount = 3300;
        int actual = cashbackHackService.remain(amount);
        int expected = 700;
        assertEquals(expected,actual);
    }

    @Test
    public void shouldCalcRemainAmount1000() {
        CashbackHackService cashbackHackService=new CashbackHackService();
        int amount = 2000;
        int actual = cashbackHackService.remain(amount);
        int expected = 0;
        assertEquals(expected,actual);
    }

    @Test
    public void shouldCalcRemainAmount1() {
        CashbackHackService cashbackHackService=new CashbackHackService();
        int amount = 1;
        int actual = cashbackHackService.remain(amount);
        int expected = 999;
        assertEquals(expected,actual);
    }
}