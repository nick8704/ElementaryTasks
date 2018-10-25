package com.anikonets.task6;

public class Ticket {

    private int number;
    private static final int NUMBER_LEHGTH = 6;

    public Ticket() {
    }

    public Ticket(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isLuckyBySimpleCounting() {
        boolean isLucky = false;
        int[] tmpArray = makeNumeralArray(number);
        int firstSum = 0;
        int secondSum = 0;
        for (int i = 0; i < NUMBER_LEHGTH; i++) {
            if (i < 3) {
                firstSum += tmpArray[i];
            } else {
                secondSum += tmpArray[i];
            }
        }
        if (firstSum == secondSum) {
            isLucky = true;
        }
        return isLucky;
    }

    public boolean isLuckyByComplicatedCounting() {
        boolean isLucky = false;
        int[] tmpArray = makeNumeralArray(number);
        int firstSum = 0;
        int secondSum = 0;
        for (int i = 0; i < NUMBER_LEHGTH; i++) {
            if (tmpArray[i] % 2 == 0) {
                firstSum += tmpArray[i];
            } else {
                secondSum += tmpArray[i];
            }
        }
        if (firstSum == secondSum) {
            isLucky = true;
        }
        return isLucky;
    }

    private static int[] makeNumeralArray(int number) {
        if(number < 0) {
            number = -number;
        }
        String tmpLine = Integer.toString(number);
        if (tmpLine.length() < NUMBER_LEHGTH) {
            int tmpNumber = NUMBER_LEHGTH - tmpLine.length();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < tmpNumber; i++) {
                sb.append("0");
            }
            sb.append(tmpLine);
            tmpLine = sb.toString();
        }
        int[] result = new int[tmpLine.length()];
        for (int i = 0; i < result.length; i++) {
            result[i] = Integer.parseInt(String.valueOf(tmpLine.charAt(i)));
        }
        return result;
    }

}