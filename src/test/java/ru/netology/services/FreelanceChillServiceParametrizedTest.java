package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class FreelanceChillServiceParametrizedTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/FreelanceChillService.csv")
    public void shouldCalculateAmountMonthOfRest(int expected, int income, int expenses, int threshold) {

        FreelanceChillService service = new FreelanceChillService();

        int actual = service.calcMonth(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}