package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackerServiceTest2 {


        @Test
        public void ShouldReturnZero() {

            CashbackHackerService service = new CashbackHackerService();
            int expected = 0;
            int amount = 1000;
            int actual = service.remain(amount);

            assertEquals(expected,actual);
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