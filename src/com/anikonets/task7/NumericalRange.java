package com.anikonets.task7;

import java.util.ArrayList;
import java.util.List;

public class NumericalRange {

    public static List<Integer> getNumericalRange(int length, double value) {
        int start = (int) Math.ceil(Math.sqrt(value));
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            result.add(start);
            start++;
        }
        return result;
    }

    public static void printNumericalRange(List<Integer> list) {
        StringBuilder result = new StringBuilder();
        for (Integer i: list) {
            result.append(i).append(',');
        }
        String resultLine = result.toString();
        System.out.println(resultLine.substring(0, resultLine.length() - 1));
    }
}