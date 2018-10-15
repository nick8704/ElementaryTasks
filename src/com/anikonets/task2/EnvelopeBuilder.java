package com.anikonets.task2;

public class EnvelopeBuilder {

    public static void checkCondition() {
        System.out.println("Please, enter parametrs of the first envelope.");
        Envelope firstEnvelope = makeEnvelope(Controller.readFromConsole());
        System.out.println("Now enter parametrs of the second envelope.");
        Envelope secondEnvelope = makeEnvelope(Controller.readFromConsole());
        assert firstEnvelope != null;
        if (firstEnvelope.isSmaller(secondEnvelope)) {
            System.out.println("You can put THE FIRST envelope IN THE SECOND.");
        } else {
            assert secondEnvelope != null;
            if (secondEnvelope.isSmaller(firstEnvelope)) {
                System.out.println("You can put THE SECOND envelope IN THE FIRST.");
            } else {
                System.out.println("You cann't put one envelope in another.");
            }
        }
    }

    public static Envelope makeEnvelope(double[] parametrs) {
        return new Envelope(parametrs[0], parametrs[1]);

    }

    public static boolean isNotPositiveDigit(String line) {
        boolean result = false;
        line = line.trim();
        if (line.isEmpty()) {
            result = true;
        }
        int dotCount = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '.') {
                dotCount++;
            }
            if ((!Character.isDigit(line.charAt(i)) && line.charAt(i) != '.') || line.charAt(i) == '-' || dotCount > 1) {
                result = true;
            }
        }
        return result;
    }

}