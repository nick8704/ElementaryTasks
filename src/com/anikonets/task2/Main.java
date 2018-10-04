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
            checkCondition();
            String str;
            while (true) {
                System.out.println();
                System.out.println("Do you want to continue?");
                str = reader.readLine();
                if (str.equalsIgnoreCase(FIRST_ANSWER) || str.equalsIgnoreCase(SECOND_ANSWER)) {
                    checkCondition();
                } else {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void checkCondition() {
        System.out.println("Please, enter parametrs of the first cover.");
        Cover firstCaver = makeCover();
        System.out.println("Now enter parametrs of the second cover.");
        Cover secondCover = makeCover();
        assert firstCaver != null;
        if (firstCaver.canPut(secondCover)) {
            System.out.println("You can put THE FIRST cover IN THE SECOND.");
        } else {
            assert secondCover != null;
            if (secondCover.canPut(firstCaver)) {
                System.out.println("You can put THE SECOND cover IN THE FIRST.");
            } else {
                System.out.println("You cann't put one cover in another.");
            }
        }
    }

    private static Cover makeCover() {
        String firstParametr;
        String secondParametr;
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter height of the cover: ");
            firstParametr = reader.readLine();
            while (!isPositiveDigit(firstParametr)) {
                System.out.print("Please, enter a positive number: ");
                firstParametr = reader.readLine();
            }
            System.out.print("Now enter width of the cover: ");
            secondParametr = reader.readLine();
            while (!isPositiveDigit(secondParametr)) {
                System.out.print("Please, enter a positive number: ");
                secondParametr = reader.readLine();
            }
            return new Cover(Double.parseDouble(firstParametr), Double.parseDouble(secondParametr));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static boolean isPositiveDigit(String line) {
        if (line == null || line.isEmpty()) {
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

}