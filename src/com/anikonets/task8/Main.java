package com.anikonets.task8;

import java.util.List;

public class Main {

    private static List<Long> firstTestList = FibonacciSequence.getFibonacciSequence(2);
    private static List<Long> secondTestList = FibonacciSequence.getFibonacciSequence(100_000L, 500_000_000L);

    public static void main(String[] args) {
        FibonacciSequence.printFibonacciSequence(firstTestList);
        System.out.println();
        FibonacciSequence.printFibonacciSequence(secondTestList);
    }

}