package com.anikonets.task3;

public abstract class TriangleBuilder {

    public static Triangle makeTriangle(String TriangleParametrs) {
        String[] parametrs = TriangleParametrs.split(",");
        return new Triangle(parametrs[0].toLowerCase().trim(),
                Double.parseDouble(parametrs[1].trim()),
                Double.parseDouble(parametrs[2].trim()),
                Double.parseDouble(parametrs[3].trim()));
    }

    public static boolean isNotPositiveDigit(String line) {
        boolean result = false;
        line = line.trim();
        if (line.isEmpty()) {
            result = true;
        }
        int dotCount = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '.') {
                dotCount++;
            }
            if ((!Character.isDigit(line.charAt(i)) && line.charAt(i) != '.') || line.charAt(i) == '-' || dotCount > 1) {
                result = true;
            }
        }
        return result;
    }

    public static boolean isNotTriangle(double a, double b, double c) {
        if ((a + b <= c) || (a + c <= b) || (b + c <= a)) {
            System.out.println("ERROR. There is no triangle with such sides.");
            return true;
        }
        return false;
    }

}