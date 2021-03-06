package com.anikonets.task5;

public class UaConfig {

    public final static String ZERO = "нуль";
    public final static String MINUS = "мінус ";

    public final static String[][] RANK_NAME = new String[][]{
            {"0", "", "", ""},
            {"1", "тисяча ", "тисячі ", "тисяч "},
            {"0", "мільйон ", "мільйона ", "мільйонів "},
            {"0", "мільярд ", "мільярда ", "мільярдів "},
    };

    public final static String[][] DIGIT_NAME = new String[][]{
            {"", "", "десять ", "", ""},
            {"один ", "одна ", "одинадцять ", "десять ", "сто "},
            {"два ", "дві ", "дванадцять ", "двадцять ", "двісті "},
            {"три ", "три ", "тринадцять ", "тридцять ", "триста "},
            {"чотири ", "чотири ", "чотирнадцять ", "сорок ", "чотириста "},
            {"п'ять ", "п'ять ", "п'ятнадцять ", "п'ятдесят ", "п'ятсот "},
            {"шість ", "шість ", "шістнадцять ", "шістдесят ", "шістсот "},
            {"сім ", "сім ", "сімнадцять ", "сімдесят ", "сімсот "},
            {"вісім ", "вісім ", "вісімнадцять ", "вісімдесят ", "вісімсот "},
            {"дев'ять ", "дев'ять ", "дев'ятнадцять ", "дев'яносто ", "дев'ятсот "}
    };

}