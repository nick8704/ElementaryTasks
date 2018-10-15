package com.anikonets.task5;

public class IntegerConverter {

    private final static int MAX_RANK = 4;

    private static String[][] rankName;
    private static String[][] digitName;
    private static String zero;
    private static String minus;

    public static String numberToString(int number, Language language) {
        if (language == Language.RUS) {
            rankName = RusConfig.RANK_NAME;
            digitName = RusConfig.DIGIT_NAME;
            zero = RusConfig.ZERO;
            minus = RusConfig.MINUS;
        } else if (language == Language.UA) {
            rankName = UaConfig.RANK_NAME;
            digitName = UaConfig.DIGIT_NAME;
            zero = UaConfig.ZERO;
            minus = UaConfig.MINUS;
        } else if (language == Language.UK) {
            rankName = UkConfig.RANK_NAME;
            digitName = UkConfig.DIGIT_NAME;
            zero = UkConfig.ZERO;
            minus = UkConfig.MINUS;
        }

        StringBuilder result = new StringBuilder();
        int quotient;
        long divisor = 1;

        int one = 1;
        int four = 2;
        int many = 3;

        int hun = 4;
        int dec = 3;
        int dec2 = 2;

        if (number == 0) {
            return zero;
        }

        if (number < 0) {
            result.append(minus);
            number = -number;
        }

        for (int i = 0; i < MAX_RANK; i++) {
            divisor *= 1000;
        }

        for (int i = MAX_RANK - 1; i >= 0; i--) {
            divisor /= 1000;
            quotient = (int) (number / divisor);
            number %= divisor;
            if (quotient == 0) {
                if (i > 0) {
                    continue;
                }
            } else {
                if (quotient >= 100) {
                    result.append(digitName[quotient / 100][hun]);
                    quotient %= 100;
                    if (language == Language.UK && quotient <= 20 && quotient > 0) {
                        result.append(UkConfig.AND);
                    }
                }
                if (quotient >= 20) {
                    if (language == Language.UK) {
                        result.append(UkConfig.AND).append(digitName[quotient / 10][dec]).append('-');
                    } else {
                        result.append(digitName[quotient / 10][dec]);
                    }
                    quotient %= 10;
                }
                if (quotient >= 10) {
                    if (language == Language.UK) {
                        result.append(UkConfig.AND).append(digitName[quotient - 10][dec2]);
                    } else {
                        result.append(digitName[quotient - 10][dec2]);
                    }
                } else {
                    if (quotient >= 1) {
                        result.append(digitName[quotient]["0".equals(rankName[i][0]) ? 0 : 1]);
                    }
                }
                switch (quotient) {
                    case 1:
                        result.append(rankName[i][one]);
                        break;
                    case 2:
                    case 3:
                    case 4:
                        result.append(rankName[i][four]);
                        break;
                    default:
                        result.append(rankName[i][many]);
                        break;
                }
            }
        }

        String resultString = result.toString();
        if (resultString.endsWith(" ")) {
            resultString = resultString.substring(0, resultString.length() - 1);
        }
        if (resultString.endsWith("-")) {
            resultString = resultString.substring(0, resultString.length() - 1);
        }
        if (resultString.startsWith("-")) {
            resultString = resultString.substring(1, resultString.length());
        }
        if (resultString.startsWith("and ")) {
            resultString = resultString.substring(4, resultString.length());
        }


        return resultString
                .replaceAll(" -", "-")
                .replaceAll("minus and ", "minus ")
                .replaceAll("and and", "and");
    }

    public static String numberToString(int number) {
        return numberToString(number, Language.RUS);
    }

}