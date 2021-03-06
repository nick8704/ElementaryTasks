package com.anikonets.task5;

public class IntegerConverter {

    private IntegerConverter() {
    }

    private final static int MAX_RANK = 4;

    private static String[][] rankName;
    private static String[][] digitName;
    private static String zero;
    private static String minus;
    private static boolean isEnglish = false;

    public static String numberToString(int number, Language language) {
        languageInitialization(language);

        StringBuilder result = new StringBuilder();
        int quotient;
        double divisor = Math.pow(1000, MAX_RANK);

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

        for (int i = MAX_RANK - 1; i >= 0; i--) {
            divisor /= 1000;
            quotient = (int) (number / divisor);
            number %= divisor;
            if (quotient == 0 && i > 0) {
                continue;
            } else {
                if (quotient >= 100) {
                    result.append(digitName[quotient / 100][hun]);
                    quotient %= 100;
                    if (isEnglish && quotient <= 20 && quotient > 0) {
                        result.append(EngConfig.AND);
                    }
                }
                if (quotient >= 20) {
                    if (isEnglish && quotient % 10 != 0) {
                        result.append(EngConfig.AND).append(digitName[quotient / 10][dec]).append('-');
                    } else {
                        result.append(digitName[quotient / 10][dec]);
                    }
                    quotient %= 10;
                }
                if (quotient >= 10) {
                    if (isEnglish) {
                        result.append(EngConfig.AND).append(digitName[quotient - 10][dec2]);
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
        return formatString(result.toString());
    }

    public static String numberToString(int number) {
        return numberToString(number, Language.RUS);
    }

    private static void languageInitialization(Language language) {
        switch (language) {
            case ENG:
                EngLanguageInitialization();
                break;
            case UA:
                UaLanguageInitialization();
                break;
            default:
                RusLanguageInitialization();
                break;
        }
    }

    private static void EngLanguageInitialization() {
        rankName = EngConfig.RANK_NAME;
        digitName = EngConfig.DIGIT_NAME;
        zero = EngConfig.ZERO;
        minus = EngConfig.MINUS;
        isEnglish = true;
    }

    private static void UaLanguageInitialization() {
        rankName = UaConfig.RANK_NAME;
        digitName = UaConfig.DIGIT_NAME;
        zero = UaConfig.ZERO;
        minus = UaConfig.MINUS;
    }

    private static void RusLanguageInitialization() {
        rankName = RusConfig.RANK_NAME;
        digitName = RusConfig.DIGIT_NAME;
        zero = RusConfig.ZERO;
        minus = RusConfig.MINUS;
    }

    private static String formatString(String line) {
        if (line.endsWith(" ")) {
            line = line.substring(0, line.length() - 1);
        }
        if (line.startsWith("-")) {
            line = line.substring(1, line.length());
        }
        if (line.startsWith("and ")) {
            line = line.substring(4, line.length());
        }
        return line
                .replaceAll(" -", "-")
                .replaceAll("minus and ", "minus ")
                .replaceAll("and and", "and");
    }

}