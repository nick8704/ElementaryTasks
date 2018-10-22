package com.anikonets.task6;

import java.util.ArrayList;
import java.util.List;

public class TicketsPack {

    private List<Ticket> ticketsPack = new ArrayList<>();

    private TicketsPack() {
    }

    public TicketsPack(List<Ticket> ticketsPack) {
        this.ticketsPack = ticketsPack;
    }

    public TicketsPack(int min, int max) {
        this.ticketsPack = makeTicketsPack(min, max);
    }

    public List<Ticket> getTicketsPack() {
        return ticketsPack;
    }

    public void setTicketsPack(List<Ticket> ticketsPack) {
        this.ticketsPack = ticketsPack;
    }

    public int getQuantityBySimpleCounting() {
        int count = 0;
        for (int i = 0; i <= ticketsPack.size() - 1; i++) {
           if(ticketsPack.get(i).isLuckyBySimpleCounting()) {
               count++;
           }
        }
        return count;
    }

    public int getQuantityByComplicatedCounting() {
        int count = 0;
        for (int i = 0; i <= ticketsPack.size() - 1; i++) {
            if(ticketsPack.get(i).isLuckyByComplicatedCounting()) {
                count++;
            }
        }
        return count;
    }

    private List<Ticket> makeTicketsPack(int min, int max) {
        if(max < min) {
            int tmp = min;
            min = max;
            max = tmp;
        }
        List<Ticket> result = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            result.add(new Ticket(i));
        }
        return result;
    }

}