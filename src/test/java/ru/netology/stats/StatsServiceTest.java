package ru.netology.stats;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void summary() {
        StatsService service = new StatsService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.summary(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void averageCost() {
        StatsService service = new StatsService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.averageCost(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void maxMonth() {
        StatsService service = new StatsService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.maxMonth(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void minMonth() {
        StatsService service = new StatsService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.minMonth(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void lowerMonths() {
        StatsService service = new StatsService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.lowerMonths(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void higherMonths() {
        StatsService service = new StatsService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.higherMonths(purchases);

        assertEquals(expected, actual);
    }
}













