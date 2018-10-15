package com.anikonets.task6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LuckyTicketTest {

    @Test
    void shouldSimpleCounting1() {
        int expected = 2;
        int actual = LuckyTicket.simpleCounting(158420, 158440);
        assertEquals(expected, actual);
    }

    @Test
    void shouldSimpleCounting2() {
        int expected = 0;
        int actual = LuckyTicket.simpleCounting(148200, 100089);
        assertEquals(expected, actual);
    }

    @Test
    void shouldSimpleCounting3() {
        int expected = 2;
        int actual = LuckyTicket.simpleCounting(8400, 8420);
        assertEquals(expected, actual);
    }

    @Test
    void shouldSimpleCounting4() {
        int expected = 1;
        int actual = LuckyTicket.simpleCounting(111111, 111111);
        assertEquals(expected, actual);
    }

    @Test
    void shouldComplicatedCounting1() {
        int expected = 1;
        int actual = LuckyTicket.complicatedCounting(158420, 158440);
        assertEquals(expected, actual);
    }

    @Test
    void shouldComplicatedCounting2() {
        int expected = 0;
        int actual = LuckyTicket.complicatedCounting(148200, 100089);
        assertEquals(expected, actual);
    }

    @Test
    void shouldComplicatedCounting3() {
        int expected = 0;
        int actual = LuckyTicket.complicatedCounting(8400, 8420);
        assertEquals(expected, actual);
    }

    @Test
    void shouldComplicatedCounting4() {
        int expected = 0;
        int actual = LuckyTicket.complicatedCounting(111111, 111111);
        assertEquals(expected, actual);
    }

}