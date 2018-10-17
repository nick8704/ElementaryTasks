package com.anikonets.task5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerConverterTest {

    @Test
    void shouldNumberToString1() {
        String expected = "ноль";
        String actual = IntegerConverter.numberToString(0);
        assertEquals(expected, actual);
    }

    @Test
    void shouldNumberToString2() {
        String expected = "минус два миллиарда тридцать четыре миллиона сто пятнадцать тысяч сорок";
        String actual = IntegerConverter.numberToString(-2034115040);
        assertEquals(expected, actual);
    }

    @Test
    void shouldNumberToString3() {
        String expected = "пятьдесят семь тысяч девятьсот тринадцать";
        String actual = IntegerConverter.numberToString(57913, Language.RUS);
        assertEquals(expected, actual);
    }

    @Test
    void shouldNumberToString4() {
        String expected = "нуль";
        String actual = IntegerConverter.numberToString(0, Language.UA);
        assertEquals(expected, actual);
    }

    @Test
    void shouldNumberToString5() {
        String expected = "мінус вісім мільйонів чотириста шість тисяч триста тридцять один";
        String actual = IntegerConverter.numberToString(-8406331, Language.UA);
        assertEquals(expected, actual);
    }

    @Test
    void shouldNumberToString6() {
        String expected = "дев'ятсот сімдесят шість тисяч шістсот";
        String actual = IntegerConverter.numberToString(976600, Language.UA);
        assertEquals(expected, actual);
    }

    @Test
    void shouldNumberToString7() {
        String expected = "zero";
        String actual = IntegerConverter.numberToString(0, Language.ENG);
        assertEquals(expected, actual);
    }

    @Test
    void shouldNumberToString8() {
        String expected = "minus fifty-two million seven hundred thousand eight hundred and forty-three";
        String actual = IntegerConverter.numberToString(-52700843, Language.ENG);
        assertEquals(expected, actual);
    }

    @Test
    void shouldNumberToString9() {
        String expected = "ninety-three thousand five hundred and seventeen";
        String actual = IntegerConverter.numberToString(93517, Language.ENG);
        assertEquals(expected, actual);
    }

}