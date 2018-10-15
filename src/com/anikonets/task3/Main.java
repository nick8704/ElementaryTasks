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
            trianglesList.add(TriangleBuilder.makeTriangle(Controller.readFromConsole()));
            String str;
            while (true) {
                System.out.println();
                System.out.println("Do you want to add another one triangle?");
                str = reader.readLine();
                if (str.equalsIgnoreCase(FIRST_ANSWER) || str.equalsIgnoreCase(SECOND_ANSWER)) {
                    trianglesList.add(TriangleBuilder.makeTriangle(Controller.readFromConsole()));
                } else {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
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