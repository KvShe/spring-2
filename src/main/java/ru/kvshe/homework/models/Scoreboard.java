package ru.kvshe.homework.models;

import org.springframework.stereotype.Component;
import ru.kvshe.homework.servise.TicketNumberGenerator;

import java.time.LocalDateTime;

@Component
public class Scoreboard {
    TicketNumberGenerator ticketNumberGenerator = new TicketNumberGenerator();

    public Ticket newTicket() {
        return new Ticket(
                ticketNumberGenerator.createNewNumber(),
                LocalDateTime.now());
    }
}
