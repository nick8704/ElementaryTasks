package com.anikonets.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class TriangleBuilder {

    public static Triangle makeTriangle() {
        String TriangleParametrs;
        try {
            System.out.println("Please, enter parametrs of triangle (name and 3 sides) with comma separated.");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            TriangleParametrs = reader.readLine();
            String[] parametrs = TriangleParametrs.split(",");

            while (parametrs.length != 4
                    || ((parametrs[0].isEmpty()
                    || isNotPositiveDigit(parametrs[1])
                    || isNotPositiveDigit(parametrs[2])
                    || isNotPositiveDigit(parametrs[3])))
                    || isNotTriangle(Double.parseDouble(parametrs[1].trim()),
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

    private static boolean isNotPositiveDigit(String line) {
        line = line.trim();
        if (line.isEmpty()) {
            return true;
        }
        int dotCount = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '.') {
                dotCount++;
            }
            if ((!Character.isDigit(line.charAt(i)) && line.charAt(i) != '.') || line.charAt(i) == '-' || dotCount > 1) {
                return true;
            }
        }
        return false;
    }

    private static boolean isNotTriangle(double a, double b, double c) {
        if ((a + b <= c) || (a + c <= b) || (b + c <= a)) {
            System.out.println("ERROR. There is no triangle with such sides.");
            return true;
        }
        return false;
    }

}