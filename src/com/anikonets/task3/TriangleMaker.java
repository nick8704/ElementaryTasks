package com.anikonets.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TriangleMaker {

    public static Triangle makeTriangle() {
        String TriangleParametrs;
        try {
            System.out.println("Please, enter parametrs of triangle (name and 3 sides) with comma separated.");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            TriangleParametrs = reader.readLine();
            String[] parametrs = TriangleParametrs.split(",");
            while (parametrs.length != 4
                    || ((parametrs[0].isEmpty()
                    || !isPositiveDigit(parametrs[1])
                    || !isPositiveDigit(parametrs[2])
                    || !isPositiveDigit(parametrs[3])))
                    || !isTriangle(Double.parseDouble(parametrs[1].trim()),
                    Double.parseDouble(parametrs[2].trim()),
                    Double.parseDouble(parametrs[3].trim()))) {
                System.out.print("Please check your input and try again.");
                TriangleParametrs = reader.readLine();
                parametrs = TriangleParametrs.split(",");
            }
            return new Triangle(parametrs[0].toLowerCase().trim(),
                    Double.parseDouble(parametrs[1].trim()),
                    Double.parseDouble(parametrs[2].trim()),
                    Double.parseDouble(parametrs[3].trim()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static boolean isPositiveDigit(String line) {
        line = line.trim();
        if (line.isEmpty()) {
            return false;
        }
        int dotCount = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '.') {
                dotCount++;
            }
            if ((!Character.isDigit(line.charAt(i)) && line.charAt(i) != '.') || line.charAt(i) == '-' || dotCount > 1) {
                return false;
            }
        }
        return true;
    }

    private static boolean isTriangle(double firstSide, double secondSide, double thirdSide) {
        double p = (firstSide + secondSide + thirdSide) / 2;
        return (!(p - firstSide <= 0)) && (!(p - secondSide <= 0)) && (!(p - thirdSide <= 0));
    }

}