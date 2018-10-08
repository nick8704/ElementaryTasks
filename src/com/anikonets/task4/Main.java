package com.anikonets.task4;

public class Main {

    private static final String PATH = "task4.txt";
    private static final String LINE_TO_COUNT = "THIS IS LINE TO COUNT";
    private static final String LINE_TO_REPLACEMENT = "THIS IS LINE TO REPLACEMENT";
    private static final String NEW_LINE = "NEW LINE";

    public static void main(String[] args) {
        int lineCount = FileParser.lineCounting(PATH, LINE_TO_COUNT);
        System.out.printf("In file %s line \"%s\" is found %d times.", PATH, LINE_TO_COUNT, lineCount);
        FileParser.lineReplacement(PATH, LINE_TO_REPLACEMENT, NEW_LINE);
    }

}