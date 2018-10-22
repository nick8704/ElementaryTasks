package com.anikonets.task6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketsPackTest {

    TicketsPack ticketsPack;

    @Test
    void shouldGetQuantityBySimpleCounting1() {
        int expected = 2;
        ticketsPack = new TicketsPack(158420, 158440);
        int actual = ticketsPack.getQuantityBySimpleCounting();
        assertEquals(expected, actual);
    }

    @Test
    void shouldGetQuantityBySimpleCounting2() {
        int expected = 2;
        ticketsPack = new TicketsPack(148200, 148180);
        int actual = ticketsPack.getQuantityBySimpleCounting();
        assertEquals(expected, actual);
    }

    @Test
    void shouldGetQuantityBySimpleCounting3() {
        int expected = 2;
        ticketsPack = new TicketsPack(8400, 8420);
        int actual = ticketsPack.getQuantityBySimpleCounting();
        assertEquals(expected, actual);
    }

    @Test
    void shouldGetQuantityBySimpleCounting4() {
        int expected = 1;
        ticketsPack = new TicketsPack(111111, 111111);
        int actual = ticketsPack.getQuantityBySimpleCounting();
        assertEquals(expected, actual);
    }

    @Test
    void shouldGetQuantityByComplicatedCounting1() {
        int expected = 1;
        ticketsPack = new TicketsPack(158420, 158440);
        int actual = ticketsPack.getQuantityByComplicatedCounting();
        assertEquals(expected, actual);
    }

    @Test
    void shouldGetQuantityByComplicatedCounting2() {
        int expected = 1;
        ticketsPack = new TicketsPack(148200, 148180);
        int actual = ticketsPack.getQuantityByComplicatedCounting();
        assertEquals(expected, actual);
    }

    @Test
    void shouldGetQuantityByComplicatedCounting3() {
        int expected = 0;
        ticketsPack = new TicketsPack(8400, 8420);
        int actual = ticketsPack.getQuantityByComplicatedCounting();
        assertEquals(expected, actual);
    }

    @Test
    void shouldGetQuantityByComplicatedCounting4() {
        int expected = 0;
        ticketsPack = new TicketsPack(111111, 111111);
        int actual = ticketsPack.getQuantityByComplicatedCounting();
        assertEquals(expected, actual);
    }

}