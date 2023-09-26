package org.example;

import java.util.List;

public class ListStatistics {
    private List<Integer> list;

    public ListStatistics(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List is empty or null");
        }
        this.list = list;
    }

    public double getAverage() {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return (double) sum / list.size();
    }
}
