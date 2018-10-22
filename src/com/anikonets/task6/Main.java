package com.anikonets.task6;

public class Main {

    public static void main(String[] args) {
        matchingCountingMethods(1, 999999);
    }

    private static void matchingCountingMethods(int min, int max) {
        TicketsPack ticketsPack = new TicketsPack(min, max);
        int simpleCountingResult = ticketsPack.getQuantityBySimpleCounting();
        int complicatedCountingResult = ticketsPack.getQuantityByComplicatedCounting();
        if (simpleCountingResult > complicatedCountingResult) {
            System.out.println("Simple counting method won.");
        } else if (simpleCountingResult < complicatedCountingResult) {
            System.out.println("Complicated counting method won.");
        } else {
            System.out.println("Results of the Simple counting and Complicated counting methods are equal.");
        }
        printResults(min, max, simpleCountingResult, complicatedCountingResult);
    }

    private static void printResults (int min, int max, int simpleCountingResult, int complicatedCountingResult) {
        System.out.printf("Results for tickets in the interval %d - %d:\n", min, max);
        System.out.printf("Simple counting method: %d lucky tickets.\n", simpleCountingResult);
        System.out.printf("Complicated counting method: %d lucky tickets.\n", complicatedCountingResult);
    }

}