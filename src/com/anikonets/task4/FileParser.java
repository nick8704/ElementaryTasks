package com.anikonets.task4;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileParser {

    public static int lineCounting(String path, String line) {
        Pattern pattern = Pattern.compile(line);
        int count = 0;
        for (String s : makeListFromFile(path)) {
            Matcher matcher = pattern.matcher(s);
            while (matcher.find()) {
                count++;
            }
        }
        return count;
    }

    public static boolean lineReplacement(String path, String oldLine, String newLine) {
        List<String> tmpList = makeListFromFile(path);
        try (FileWriter writer = new FileWriter(path)) {
            for (String s : tmpList) {
                writer.write(s.replaceAll(oldLine, newLine) + "\n");
                writer.flush();
            }
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    private static List<String> makeListFromFile(String path) {
        List<String> result = null;
        try {
            result = Files.readAllLines(Paths.get(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

}