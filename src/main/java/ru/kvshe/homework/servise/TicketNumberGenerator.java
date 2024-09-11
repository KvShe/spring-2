package ru.kvshe.homework.servise;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class TicketNumberGenerator {
    public String createNewNumber() {
        String uuid = UUID.randomUUID().toString();
        return "Ticket #" + uuid;
    }
}
