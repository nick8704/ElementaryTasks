package com.anikonets.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    private static final String FIRST_ANSWER = "y";
    private static final String SECOND_ANSWER = "yes";
    private static List<Triangle> trianglesList = new ArrayList<>();

    public static void main(String[] args) {
        primaryMethod();
        printTrianglesList();
    }

    private static void primaryMethod() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            trianglesList.add(makeTriangle());
            String str;
            while (true) {
                System.out.println();
                System.out.println("Do you want to add another one triangle?");
                str = reader.readLine();
                if (str.equalsIgnoreCase(FIRST_ANSWER) || str.equalsIgnoreCase(SECOND_ANSWER)) {
                    trianglesList.add(makeTriangle());
                } else {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Triangle makeTriangle() {
        String TriangleParametrs;
        try {
            System.out.println("Please, enter parametrs of triangle (name and 3 sides) with comma separated.");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            TriangleParametrs = reader.readLine();
            String[] parametrs = TriangleParametrs.split(",");
            while (parametrs.length != 4
                    || (!isPositiveDigit(parametrs[1]) || !isPositiveDigit(parametrs[2]) || !isPositiveDigit(parametrs[3]))) {
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

    private static void printTrianglesList() {
        System.out.println("================ Triangles list: ================");
        int i = 1;
        Collections.sort(trianglesList);
        for (Triangle triangle: trianglesList) {
            System.out.print(i + ". ");
            System.out.println(triangle.toString());
            i++;
        }
    }

}