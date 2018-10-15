package com.anikonets.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Controller {

    public static String readFromConsole() {
        String TriangleParametrs = null;
        try {
            System.out.println("Please, enter parametrs of triangle (name and 3 sides) with comma separated.");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            TriangleParametrs = reader.readLine();
            String[] parametrs = TriangleParametrs.split(",");

            while (parametrs.length != 4
                    || ((parametrs[0].isEmpty()
                    || TriangleBuilder.isNotPositiveDigit(parametrs[1])
                    || TriangleBuilder.isNotPositiveDigit(parametrs[2])
                    || TriangleBuilder.isNotPositiveDigit(parametrs[3])))
                    || TriangleBuilder.isNotTriangle(Double.parseDouble(parametrs[1].trim()),
                    Double.parseDouble(parametrs[2].trim()),
                    Double.parseDouble(parametrs[3].trim()))) {

                System.out.print("Please check your input and try again.");
                TriangleParametrs = reader.readLine();
                parametrs = TriangleParametrs.split(",");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return TriangleParametrs;
    }

}