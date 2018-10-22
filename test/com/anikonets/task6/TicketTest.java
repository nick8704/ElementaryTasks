package com.anikonets.task6;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class TicketTest {

    Ticket ticket;

    @ParameterizedTest
    @ValueSource(ints = {111111, 222222, 333333, 444444, 555555, 666666, 777777, 888888, -999999, -123321})
    void isLuckyBySimpleCounting1(int number) {
        ticket = new Ticket(number);
        boolean actual = ticket.isLuckyBySimpleCounting();
        assertTrue(actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {111112, 222223, 333334, 444445, 555556, 666667, 777778, 888889, -999990, -123322})
    void isLuckyBySimpleCounting2(int number) {
        ticket = new Ticket(number);
        boolean actual = ticket.isLuckyBySimpleCounting();
        assertFalse(actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {564072, 920238, 34067, 494829 , 122052, 722140, 454906, 230452, -780472, -805300})
    void isLuckyByComplicatedCounting1(int number) {
        ticket = new Ticket(number);
        boolean actual = ticket.isLuckyByComplicatedCounting();
        assertTrue(actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {111112, 222223, 333334, 444445, 555556, 666667, 777778, 888889, -999990, -572609})
    void isLuckyByComplicatedCounting2(int number) {
        ticket = new Ticket(number);
        boolean actual = ticket.isLuckyByComplicatedCounting();
        assertFalse(actual);
    }

}