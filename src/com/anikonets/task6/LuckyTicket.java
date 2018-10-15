package com.anikonets.task6;

public class LuckyTicket {

    private LuckyTicket() {
    }

    public static int simpleCounting(int min, int max) {
        int count = 0;
        int[] tmpArray;
        int firstSum = 0;
        int secondSum = 0;
        for (int i = min; i <= max; i++) {
            tmpArray = makeNumeralArray(i);
            for (int j = 0; j < 6; j++) {
                if (j < 3) {
                    firstSum += tmpArray[j];
                } else {
                    secondSum += tmpArray[j];
                }
            }
            if (firstSum == secondSum) {
                count++;
            }
            firstSum = 0;
            secondSum = 0;
        }
        return count;
    }

    public static int complicatedCounting(int min, int max) {
        int count = 0;
        int[] tmpArray;
        int firstSum = 0;
        int secondSum = 0;
        for (int i = min; i <= max; i++) {
            tmpArray = makeNumeralArray(i);
            for (int j = 0; j < 6; j++) {
                if (tmpArray[j] % 2 == 0) {
                    firstSum += tmpArray[j];
                } else {
                    secondSum += tmpArray[j];
                }
            }
            if (firstSum == secondSum) {
                count++;
            }
            firstSum = 0;
            secondSum = 0;
        }
        return count;
    }

    private static int[] makeNumeralArray(int number) {
        String tmpLine = Integer.toString(number);
        if(tmpLine.length() < 6) {
            int tmpNumber = 6 - tmpLine.length();
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