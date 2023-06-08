package ru.netology.javaqa.SalesCalculationSrvise.SalesStatistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiseTest {
    @Test
    public void testSum() {
        StatsServise servise = new StatsServise();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = servise.sum(sales);
        long expected = 180;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testAverageSum() {
        StatsServise servise = new StatsServise();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = servise.AverageAmount(sales);
        long expected = 180 / 12;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testMaximumMonthSale() {
        StatsServise servise = new StatsServise();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = servise.MaximumSale(sales);
        long expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinimumMonthSale() {
        StatsServise servise = new StatsServise();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = servise.MinimumSale(sales);
        long expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBelowAverageSales() {
        StatsServise servise = new StatsServise();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = servise.BelowAverageSales(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testHigherAverageSales() {
        StatsServise servise = new StatsServise();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = servise.HigherAverageSales(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }



}