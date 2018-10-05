package com.anikonets.task8;

public class FibonacciSequence {

    public static void main(String[] args) {
        printFibonacciSequence(7);
        System.out.println();
        printFibonacciSequence(10_000L, 500_000_000L);
    }

    private static void printFibonacciSequence(int length) {
        if (length <= 0) {
            return;
        }
        long firstElement = 1L;
        long secondElement = 1L;
        long nextElement = firstElement + secondElement;
        if (length == 1) {
            System.out.print(firstElement + " " + secondElement + " ");
        }
        while (Long.toString(nextElement).length() <= length) {
            nextElement = firstElement + secondElement;
            firstElement = secondElement;
            secondElement = nextElement;
            if (Long.toString(nextElement).length() == length) {
                System.out.print(nextElement + " ");
            }
        }
    }

    private static void printFibonacciSequence(long lowerLimit, long upperLimit) {
        if(upperLimit <= 0) {
            return;
        }
        if (lowerLimit <= 0) {
            lowerLimit = 1L;
        }
        long firstElement = 1L;
        long secondElement = 1L;
        if (lowerLimit == 1) {
            System.out.print(firstElement + " " + secondElement + " ");
        }
        long nextElement = firstElement + secondElement;
        while (nextElement <= upperLimit) {
            nextElement = firstElement + secondElement;
            firstElement = secondElement;
            secondElement = nextElement;
            if (nextElement >= lowerLimit && nextElement <= upperLimit) {
                System.out.print(nextElement + " ");
            }
        }
    }

}