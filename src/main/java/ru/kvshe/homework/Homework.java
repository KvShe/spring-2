package ru.kvshe.homework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.kvshe.homework.models.Scoreboard;
import ru.kvshe.homework.models.Ticket;

@SpringBootApplication
public class Homework {
    public static void main(String[] args) {
        var context = SpringApplication.run(Homework.class, args);

        Scoreboard scoreboard = context.getBean(Scoreboard.class);

        Ticket[] tickets = new Ticket[3];
        for (int i = 0; i < tickets.length; i++) {
            tickets[i] = scoreboard.newTicket();
            System.out.println(tickets[i]);
        }

        context.close();
    }
}
