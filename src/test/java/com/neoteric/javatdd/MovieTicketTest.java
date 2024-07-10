package com.neoteric.javatdd;

import com.neoteric.javatdd.Service2.TicketService;
import com.neoteric.javatdd.model2.MainTicket;
import com.neoteric.javatdd.model2.MovieTicket;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieTicketTest {
    @Test
    public void MovieTicketTest(){
        MovieTicket ticket=new MovieTicket();
        ticket.movieTittle="kalki";
        ticket.noOfTickets=2;
        ticket.seatNo=2;
        ticket.amount=250;
        ticket.screen="s2";
        ticket.date="6-7-2024";
        ticket.time="11am";
        TicketService service=new TicketService();
        MainTicket m= service.getTicket(ticket);
        Assertions.assertNotNull(m.movieTittle);
//        System.out.println(ticket.movieTittle);
//        System.out.println( ticket.noOfTickets);
//        System.out.println(ticket.seatNo);
//        System.out.println( ticket.amount);
//        System.out.println(ticket.screen);
//        System.out.println(ticket.date);
//        System.out.println(ticket.time);

    }

}
