package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackerServiceTest {
    @Test
    public void ShouldReturnZero() {

        CashbackHackerService service = new CashbackHackerService();
        int expected = 0;
        int amount = 1000;
        int actual = service.remain(amount);

        assertEquals(actual,expected);
    }

    @Test
    public void ShouldReturnHundred() {
        CashbackHackerService service = new CashbackHackerService();
        int expected = 100;
        int amount = 900;
        int actual = service.remain(amount);

        assertEquals(expected,actual);
    }

}
