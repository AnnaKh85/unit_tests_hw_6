package org.example;

public class ListComparer {
    public String compareLists(ListStatistics listStats1, ListStatistics listStats2) {
        double average1 = listStats1.getAverage();
        double average2 = listStats2.getAverage();

        if (average1 > average2) {
            return "The first list has a larger average value";
        } else if (average2 > average1) {
            return "The second list has a larger average value";
        } else {
            return "Average values are equal";
        }
    }
}
