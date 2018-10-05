package com.anikonets.task7;

public class NumericalRange {

    public static void main(String[] args) {
        printNumericalRange(10, 19.9);
    }

    private static void printNumericalRange(int length, double value) {
        int start = (int) Math.ceil(Math.sqrt(value));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(start).append(',');
            start++;
        }
        String result = sb.toString();
        System.out.println(result.substring(0, result.length() - 1));
    }

}