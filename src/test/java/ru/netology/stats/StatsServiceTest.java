package ru.netology.stats;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    StatsService service = new StatsService();
    int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void summary() {
        assertEquals(180, service.summary(purchases));
    }

    @Test
    void averageCost() {
        assertEquals(15, service.averageCost(purchases));
    }

    @Test
    void maxMonth() {
        assertEquals(8, service.maxMonth(purchases));
    }

    @Test
    void minMonth() {
        assertEquals(9, service.minMonth(purchases));
    }

    @Test
    void lowerMonths() {
        assertEquals(5, service.lowerMonths(purchases));
    }

    @Test
    void higherMonths() {
        assertEquals(5, service.higherMonths(purchases));
    }
}













