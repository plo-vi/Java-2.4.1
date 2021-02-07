package ru.netology.stats;

public class StatsService {

    public int summary(int[] purchases) {
        int sum = 0;
        for (int purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    public int averageCost(int[] purchases) {
        return summary(purchases) / purchases.length;
    }

    public int maxMonth(int[] purchases) {
        int largest = purchases[0], index = 0;
        for (int i = 1; i < purchases.length; i++) {
            if (purchases[i] >= largest) {
                largest = purchases[i];
                index = ++i;
            }
        }
        return index;
    }

    public int minMonth(int[] purchases) {
        int smallest = Integer.MAX_VALUE, index = 1;
        for (int i = 1; i < purchases.length; i++) {
            if (purchases[i] <= smallest) {
                smallest = purchases[i];
                index = ++i;
            }
        }
        return index;
    }

    public int lowerMonths(int[] purchases) {
        int badMonth = 0;
        for (int purchase : purchases) {
            if (purchase > averageCost(purchases)) {
                badMonth++;
            }
        }
        return badMonth;
    }

    public int higherMonths(int[] purchases) {
        int goodMonth = 0;
        for (int purchase : purchases) {
            if (purchase > averageCost(purchases)) {
                goodMonth++;
            }
        }
        return goodMonth;
    }
}







