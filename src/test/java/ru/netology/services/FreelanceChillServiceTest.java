package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class FreelanceChillServiceTest {

    @Test
    public void shouldCalculate3MonthOfRest() {
        FreelanceChillService service = new FreelanceChillService();

        int actual = service.calcMonth(10_000, 3000, 20_000);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculate2MonthOfRest() {
        FreelanceChillService service = new FreelanceChillService();

        int actual = service.calcMonth(100_000, 60_000, 150_000);
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }
}
