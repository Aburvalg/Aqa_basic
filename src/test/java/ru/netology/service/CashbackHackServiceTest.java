package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    private CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
    public void shouldCalcRemainAmountLess1000() {
        int amount = 300;
        int actual = cashbackHackService.remain(amount);
        int expected = 700;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalcRemainAmountMore1000() {
        int amount = 3300;
        int actual = cashbackHackService.remain(amount);
        int expected = 700;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalcRemainAmount1000() {
        int amount = 1000;
        int actual = cashbackHackService.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalcRemainAmount1() {
        int amount = 1;
        int actual = cashbackHackService.remain(amount);
        int expected = 999;
        assertEquals(actual, expected);
    }
}