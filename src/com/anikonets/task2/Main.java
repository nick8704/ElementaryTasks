package com.anikonets.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final String FIRST_ANSWER = "y";
    private static final String SECOND_ANSWER = "yes";

    public static void main(String[] args) {
        primaryMethod();
    }

    private static void primaryMethod() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            CoverMaker.checkCondition();
            String str;
            while (true) {
                System.out.println();
                System.out.println("Do you want to continue?");
                str = reader.readLine();
                if (str.equalsIgnoreCase(FIRST_ANSWER) || str.equalsIgnoreCase(SECOND_ANSWER)) {
                    CoverMaker.checkCondition();
                } else {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}