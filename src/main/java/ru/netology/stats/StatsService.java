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

    private int getLargest(int[] purchases) {
        int largest = purchases[0];
        for (int purchase : purchases) {
            if (largest < purchase) {
                largest = purchase;
            }
        }
        return largest;
    }

    public int maxMonth(int[] purchases) {
        int largest = getLargest(purchases);

        int index = 0;
        int lastLargest = 0;
        for (int purchase : purchases) {
            index++;
            if (purchase == largest) {
                lastLargest = index;
            }
        }
        return lastLargest;
    }

    private int getSmallest(int[] purchases) {
        int smallest = purchases[0];
        for (int purchase : purchases) {
            if (smallest > purchase) {
                smallest = purchase;
            }
        }
        return smallest;
    }

    public int minMonth(int[] purchases) {
        int smallest = getSmallest(purchases);

        int index = 0;
        int lastSmallest = 0;
        for (int purchase : purchases) {
            index++;
            if (purchase == smallest) {
                lastSmallest = index;
            }
        }
        return lastSmallest;
    }

    public int lowerMonths(int[] purchases) {
        int averageCost = averageCost(purchases);
        int badMonth = 0;
        for (int purchase : purchases) {
            if (purchase < averageCost) {
                badMonth++;
            }
        }
        return badMonth;
    }

    public int higherMonths(int[] purchases) {
        int averageCost = averageCost(purchases);
        int goodMonth = 0;
        for (int purchase : purchases) {
            if (purchase > averageCost) {
                goodMonth++;
            }
        }
        return goodMonth;
    }
}







