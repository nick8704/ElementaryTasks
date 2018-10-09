package com.anikonets.task5;

public class IntegerConverter {

    private final static int MAX_RANK = 4;

    private final static String[][] rankName = new String[][]{
            {"0", "", "", ""},
            {"1", "тысяча ", "тысячи ", "тысяч "},
            {"0", "миллион ", "миллиона ", "миллионов "},
            {"0", "миллиард ", "миллиарда ", "миллиардов "},
    };

    private final static String[][] digitName = new String[][]{
            {"", "", "десять ", "", ""},
            {"один ", "одна ", "одиннадцать ", "десять ", "сто "},
            {"два ", "две ", "двенадцать ", "двадцать ", "двести "},
            {"три ", "три ", "тринадцать ", "тридцать ", "триста "},
            {"четыре ", "четыре ", "четырнадцать ", "сорок ", "четыреста "},
            {"пять ", "пять ", "пятнадцать ", "пятьдесят ", "пятьсот "},
            {"шесть ", "шесть ", "шестнадцать ", "шестьдесят ", "шестьсот "},
            {"семь ", "семь ", "семнадцать ", "семьдесят ", "семьсот "},
            {"восемь ", "восемь ", "восемнадцать ", "восемьдесят ", "восемьсот "},
            {"девять ", "девять ", "девятнадцать ", "девяносто ", "девятьсот "}
    };

    public static String numberToString(int number) {
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
            return "ноль";
        }

        if (number < 0) {
            result.append("минус ");
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
                }
                if (quotient >= 20) {
                    result.append(digitName[quotient / 10][dec]);
                    quotient %= 10;
                }
                if (quotient >= 10) {
                    result.append(digitName[quotient - 10][dec2]);
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
        return result.toString();
    }

}