package com.anikonets.task5;

public class EngConfig {

    public final static String ZERO = "zero";
    public final static String MINUS = "minus ";
    public final static String AND = "and ";

    public final static String[][] RANK_NAME = new String[][]{
            {"0", "", "", ""},
            {"0", "thousand ", "thousand ", "thousand "},
            {"0", "million ", "million ", "million "},
            {"0", "billion ", "billion ", "billion "},
    };

    public final static String[][] DIGIT_NAME = new String[][]{
            {"", "", "ten ", "", ""},
            {"one ", "one ", "eleven ", "ten ", "one hundred "},
            {"two ", "two ", "twelve ", "twenty ", "two hundred "},
            {"three ", "three ", "thirteen ", "thirty ", "three hundred "},
            {"four ", "four ", "fourteen ", "forty ", "four hundred "},
            {"five ", "five ", "fifteen ", "fifty ", "five hundred "},
            {"six ", "six ", "sixteen ", "sixty ", "six hundred "},
            {"seven ", "seven ", "seventeen ", "seventy ", "seven hundred "},
            {"eight ", "eight ", "eighteen ", "eighty ", "eight hundred "},
            {"nine ", "nine ", "nineteen ", "ninety ", "nine hundred "}
    };

}
