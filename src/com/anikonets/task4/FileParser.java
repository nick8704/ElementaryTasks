package com.anikonets.task4;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileParser {

    private static final String PATH = "task4.txt";
    private static final String LINE_TO_COUNT = "THIS IS LINE TO COUNT";
    private static final String LINE_TO_REPLACEMENT = "THIS IS LINE TO REPLACEMENT";
    private static final String NEW_LINE = "NEW LINE";

    public static void main(String[] args) {
        int lineCount = lineCounting(PATH, LINE_TO_COUNT);
        System.out.printf("In file %s line \"%s\" is found %d times.", PATH, LINE_TO_COUNT, lineCount);
        lineReplacement(PATH, LINE_TO_REPLACEMENT, NEW_LINE);
    }

    private static int lineCounting(String path, String line) {
        int count = 0;
        for (String s : makeListFromFile(path)) {
            if (s.equals(line)) {
                count++;
            }
        }
        return count;
    }

    private static void lineReplacement(String path, String oldLine, String newLine) {
        List<String> tmpList = makeListFromFile(path);
        try (FileWriter writer = new FileWriter(path)) {
            for (String s : tmpList) {
                if (s.equals(oldLine)) {
                    writer.write(newLine + "\n");
                } else {
                    writer.write(s + "\n");
                }
                writer.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<String> makeListFromFile(String path) {
        List<String> result = null;
        try {
            result = Files.readAllLines(Paths.get(PATH));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

}