package com.anikonets.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Controller {

    public static double[] readFromConsole() {
        String[] parametrs = new String[2];
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter height of the envelope: ");
            parametrs[0] = reader.readLine();
            while (EnvelopeBuilder.isNotPositiveDigit(parametrs[0])) {
                System.out.print("Please, enter a positive number: ");
                parametrs[0] = reader.readLine();
            }
            System.out.print("Now enter width of the envelope: ");
            parametrs[1] = reader.readLine();
            while (EnvelopeBuilder.isNotPositiveDigit(parametrs[1])) {
                System.out.print("Please, enter a positive number: ");
                parametrs[1] = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        double result[] = {Double.parseDouble(parametrs[0]), Double.parseDouble(parametrs[1])};
        return result;
    }

}