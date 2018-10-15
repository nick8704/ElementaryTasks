package com.anikonets.task7;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class NumericalRangeTest {

    @Test
    public void shouldGetNumericalRange1() {
        List<Integer> expected = Arrays.asList(6, 7, 8, 9, 10);
        List<Integer> actual = NumericalRange.getNumericalRange(5, 25.8);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldGetNumericalRange2() {
        List<Integer> expected = Arrays.asList(8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19);
        List<Integer> actual = NumericalRange.getNumericalRange(12, 50.2);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldGetNumericalRange3() {
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = NumericalRange.getNumericalRange(0, 21);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldGetNumericalRange4() {
        List<Integer> expected = Arrays.asList(1, 2, 3);
        List<Integer> actual = NumericalRange.getNumericalRange(3, -12.1);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldGetNumericalRange5() {
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = NumericalRange.getNumericalRange(-3, -12.1);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldGetNumericalRange6() {
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = NumericalRange.getNumericalRange(0, 0);
        assertEquals(expected, actual);
    }

}