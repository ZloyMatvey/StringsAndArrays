package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatsServiceTest {
    int[] salesArray = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


    @Test
    void AmountOfSalesTest() {
        StatsService service = new StatsService();

        // параметры для сравнения
        int expected = 180;

        //Вызываем цедевой метод
        int actual = service.AmountOfSales(salesArray);

        //Производим проверку
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void AverageSalesAmountTest() {
        StatsService service = new StatsService();

        // параметры для сравнения
        int expected = 15;

        //Вызываем цедевой метод
        int actual = service.AverageSalesAmount(salesArray);

        //Производим проверку
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void MonthOfMaximumSalesTest() {
        StatsService service = new StatsService();

        // параметры для сравнения
        int expected = 8;

        //Вызываем цедевой метод
        int actual = service.MonthOfMaximumSales(salesArray);

        //Производим проверку
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void MonthOfMinimumSalesTest() {
        StatsService service = new StatsService();

        // параметры для сравнения
        int expected = 9;

        //Вызываем цедевой метод
        int actual = service.MonthOfMinimumSales(salesArray);

        //Производим проверку
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void MonthsBelowAverageTest() {
        StatsService service = new StatsService();

        // параметры для сравнения
        int expected = 5;

        //Вызываем цедевой метод
        int actual = service.MonthsBelowAverage(salesArray);

        //Производим проверку
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void MonthsAboveAverageTest() {
        StatsService service = new StatsService();

        // параметры для сравнения
        int expected = 5;

        //Вызываем цедевой метод
        int actual = service.MonthsAboveAverage(salesArray);

        //Производим проверку
        Assertions.assertEquals(expected, actual);
    }
}

