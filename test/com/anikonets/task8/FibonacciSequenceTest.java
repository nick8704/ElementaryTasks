package com.anikonets.task8;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FibonacciSequenceTest {

    @Test
    void shouldGetFibonacciSequence1() {
        List<Long> expected = Arrays.asList(1597L, 2584L, 4181L, 6765L);
        List<Long> actual = FibonacciSequence.getFibonacciSequence(4);
        assertEquals(expected, actual);
    }

    @Test
    void shouldGetFibonacciSequence2() {
        List<Long> expected = Arrays.asList(1L, 1L, 2L, 3L, 5L, 8L);
        List<Long> actual = FibonacciSequence.getFibonacciSequence(1);
        assertEquals(expected, actual);
    }

    @Test
    void shouldGetFibonacciSequence3() {
        List<Long> expected = new ArrayList<>();
        List<Long> actual = FibonacciSequence.getFibonacciSequence(0);
        assertEquals(expected, actual);
    }

    @Test
    void shouldGetFibonacciSequence4() {
        List<Long> expected = new ArrayList<>();
        List<Long> actual = FibonacciSequence.getFibonacciSequence(-1);
        assertEquals(expected, actual);
    }

    @Test
    void shouldGetFibonacciSequence5() {
        List<Long> expected = Arrays.asList(1L, 1L, 2L, 3L, 5L, 8L, 13L, 21L, 34L, 55L, 89L, 144L, 233L, 377L, 610L, 987L);
        List<Long> actual = FibonacciSequence.getFibonacciSequence(0L, 1_000L);
        assertEquals(expected, actual);
    }

    @Test
    void shouldGetFibonacciSequence6() {
        List<Long> expected = Arrays.asList(10946L, 17711L, 28657L, 46368L, 75025L, 121393L, 196418L, 317811L);
        List<Long> actual = FibonacciSequence.getFibonacciSequence(10_000L, 500_000L);
        assertEquals(expected, actual);
    }

    @Test
    void shouldGetFibonacciSequence7() {
        List<Long> expected = Arrays.asList(1L, 1L, 2L, 3L, 5L, 8L, 13L, 21L, 34L, 55L, 89L);
        List<Long> actual = FibonacciSequence.getFibonacciSequence(-10_000L, 100L);
        assertEquals(expected, actual);
    }

    @Test
    void shouldGetFibonacciSequence8() {
        List<Long> expected = new ArrayList<>();
        List<Long> actual = FibonacciSequence.getFibonacciSequence(10_000L, -1_000L);
        assertEquals(expected, actual);
    }

    @Test
    void shouldGetFibonacciSequence9() {
        List<Long> expected = new ArrayList<>();
        List<Long> actual = FibonacciSequence.getFibonacciSequence(-1_000L, -100L);
        assertEquals(expected, actual);
    }

    @Test
    void shouldGetFibonacciSequence10() {
        List<Long> expected =  Arrays.asList(1L, 1L);
        List<Long> actual = FibonacciSequence.getFibonacciSequence(1L, 1L);
        assertEquals(expected, actual);
    }

}