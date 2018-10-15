package com.anikonets.task3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class TriangleBuilderTest {

    @Test
    void shouldMakeTriangle1() {
        Triangle expected = new Triangle("first", 6, 6, 6.6);
        Triangle actual = TriangleBuilder.makeTriangle("first,6,6,6.6");
        assertEquals(expected, actual);
    }

    @Test
    void shouldMakeTriangle2() {
        Triangle expected = new Triangle("second", 8, 7.1, 6);
        Triangle actual = TriangleBuilder.makeTriangle("   SeCOnD,   8 ,  7.1,6");
        assertEquals(expected, actual);
    }

    @Test
    void shouldMakeTriangle3() {
        Triangle expected = new Triangle("third", 5, 9.3, 8);
        Triangle actual = TriangleBuilder.makeTriangle("THIRD      ,   5    ,9.3 ,8  ");
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @ValueSource(strings = {"-9", "  -0.01  ", " -5.2  ", "-18", "   -6.3"})
    void isNotPositiveDigit1(String line) {
        boolean expected = true;
        boolean actual = TriangleBuilder.isNotPositiveDigit(line);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @ValueSource(strings = {"1", "  2.1  ", " 0.02  ", "5", "   3.8"})
    void isNotPositiveDigit2(String line) {
        boolean expected = false;
        boolean actual = TriangleBuilder.isNotPositiveDigit(line);
        assertEquals(expected, actual);
    }

    @Test
    void isNotTriangle1() {
        boolean expected = true;
        boolean actual = TriangleBuilder.isNotTriangle(0, 5, 9);
        assertEquals(expected, actual);
    }

    @Test
    void isNotTriangle2() {
        boolean expected = true;
        boolean actual = TriangleBuilder.isNotTriangle(22.5, 15, 4);
        assertEquals(expected, actual);
    }

    @Test
    void isNotTriangle3() {
        boolean expected = false;
        boolean actual = TriangleBuilder.isNotTriangle(6.6, 5, 8);
        assertEquals(expected, actual);
    }

    @Test
    void isNotTriangle4() {
        boolean expected = false;
        boolean actual = TriangleBuilder.isNotTriangle(20, 17.9, 14.7);
        assertEquals(expected, actual);
    }

}