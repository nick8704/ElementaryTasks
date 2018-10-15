package com.anikonets.task2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class EnvelopeBuilderTest {

    @Test
    void shouldMakeEnvelope1() {
        Envelope expected = new Envelope(5, 8.3);
        Envelope actual = EnvelopeBuilder.makeEnvelope(new double[]{5, 8.3});
        assertEquals(expected, actual);
    }

    @Test
    void shouldMakeEnvelope2() {
        Envelope expected = new Envelope(0.01, 0.02);
        Envelope actual = EnvelopeBuilder.makeEnvelope(new double[]{0.01, 0.02});
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @ValueSource(strings = {"  -12", "  -1  ", " -8.3  ", "-0.001", "   -3.0"})
    void isNotPositiveDigit1(String line) {
        boolean expected = true;
        boolean actual = EnvelopeBuilder.isNotPositiveDigit(line);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @ValueSource(strings = {"12", "  1  ", " 0.0001  ", "0", "   4.6 "})
    void isNotPositiveDigit2(String line) {
        boolean expected = false;
        boolean actual = EnvelopeBuilder.isNotPositiveDigit(line);
        assertEquals(expected, actual);
    }

}