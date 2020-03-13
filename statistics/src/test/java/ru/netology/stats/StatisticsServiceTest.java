package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {
    private long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void calculateSum() {
        StatisticsService service = new StatisticsService();
        long expected = 180;
        long actual = service.calculateSum(sales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateAverage() {
        StatisticsService service = new StatisticsService();
        long expected = 15;
        long actual = service.calculateAverage(sales);
        assertEquals(expected, actual);
    }

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();
        long expected = 8;
        long actual = service.findMax(sales);
        assertEquals(expected, actual);
    }

    @Test
    void findMin() {
        StatisticsService service = new StatisticsService();
        long expected = 9;
        long actual = service.findMin(sales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateBelowAverage() {
        StatisticsService service = new StatisticsService();
        long expected = 5;
        long actual = service.calculateBelowAverage(sales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateAboveAverage() {
        StatisticsService service = new StatisticsService();
        long expected = 5;
        long actual = service.calculateAboveAverage(sales);
        assertEquals(expected, actual);
    }

}


