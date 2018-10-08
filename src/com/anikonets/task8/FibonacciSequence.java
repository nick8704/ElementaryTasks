package com.anikonets.task8;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSequence {

    public static List<Long> getFibonacciSequence(int length) {
        List<Long> result = new ArrayList<>();
        if (length <= 0) {
            return result;
        }

        long firstElement = 1L;
        long secondElement = 1L;
        long nextElement = firstElement + secondElement;
        if (length == 1) {
            result.add(firstElement);
            result.add(secondElement);
        }
        while (Long.toString(nextElement).length() <= length) {
            nextElement = firstElement + secondElement;
            firstElement = secondElement;
            secondElement = nextElement;
            if (Long.toString(nextElement).length() == length) {
                result.add(nextElement);
            }
        }
        return result;
    }

    public static List<Long> getFibonacciSequence(long lowerLimit, long upperLimit) {
        List<Long> result = new ArrayList<>();
        if(upperLimit <= 0) {
            return result;
        }
        if (lowerLimit <= 0) {
            lowerLimit = 1L;
        }
        long firstElement = 1L;
        long secondElement = 1L;
        if (lowerLimit == 1) {
            result.add(firstElement);
            result.add(secondElement);
        }
        long nextElement = firstElement + secondElement;
        while (nextElement <= upperLimit) {
            nextElement = firstElement + secondElement;
            firstElement = secondElement;
            secondElement = nextElement;
            if (nextElement >= lowerLimit && nextElement <= upperLimit) {
                result.add(nextElement);
            }
        }
        return result;
    }

    public static void printFibonacciSequence(List<Long> list) {
        for (Long number: list) {
            System.out.print(number + " ");
        }
    }

}