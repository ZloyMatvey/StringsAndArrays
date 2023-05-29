package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatsServiceTest {
    int[] salesArray = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


    @Test
    void amountOfSalesTest() {
        StatsService service = new StatsService();

        // параметры для сравнения
        int expected = 180;

        //Вызываем цедевой метод
        int actual = service.amountOfSales(salesArray);

        //Производим проверку
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void averageSalesAmountTest() {
        StatsService service = new StatsService();

        // параметры для сравнения
        int expected = 15;

        //Вызываем цедевой метод
        int actual = service.averageSalesAmount(salesArray);

        //Производим проверку
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void monthOfMaximumSalesTest() {
        StatsService service = new StatsService();

        // параметры для сравнения
        int expected = 8;

        //Вызываем цедевой метод
        int actual = service.monthOfMaximumSales(salesArray);

        //Производим проверку
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void monthOfMinimumSalesTest() {
        StatsService service = new StatsService();

        // параметры для сравнения
        int expected = 9;

        //Вызываем цедевой метод
        int actual = service.monthOfMinimumSales(salesArray);

        //Производим проверку
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void monthsBelowAverageTest() {
        StatsService service = new StatsService();

        // параметры для сравнения
        int expected = 5;

        //Вызываем цедевой метод
        int actual = service.monthsBelowAverage(salesArray);

        //Производим проверку
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void monthsAboveAverageTest() {
        StatsService service = new StatsService();

        // параметры для сравнения
        int expected = 5;

        //Вызываем цедевой метод
        int actual = service.monthsAboveAverage(salesArray);

        //Производим проверку
        Assertions.assertEquals(expected, actual);
    }
}

