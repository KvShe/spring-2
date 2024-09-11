package ru.kvshe.homework.models;

import lombok.AllArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
public class Ticket {
    private String number;
    private LocalDateTime createdAt;

    @Override
    public String toString() {
        return number + ", createdAt: " + createdAt;
    }
}
