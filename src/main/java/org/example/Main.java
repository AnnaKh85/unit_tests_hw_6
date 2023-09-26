package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(5, 7, 9);
        List<Integer> list2 = Arrays.asList(2, 4, 6);

        ListStatistics stats1 = new ListStatistics(list1);
        ListStatistics stats2 = new ListStatistics(list2);

        ListComparer listComparer = new ListComparer();

        String comparisonResult = listComparer.compareLists(stats1, stats2);

        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        System.out.println("Comparison Result: " + comparisonResult);
    }
}