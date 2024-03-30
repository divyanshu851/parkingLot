package parkingLot.repository;

import parkingLot.exceptions.TicketNotFoundException;
import parkingLot.models.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketRepository {
    private Map<Integer, Ticket> ticketMap;
    private static int idCounter = 0;

    public TicketRepository(){
        this.ticketMap = new HashMap<>();
    }

    public Ticket getTicket(int ticketId){
        Ticket ticket = ticketMap.get(ticketId);
        if(ticket==null){
            throw new TicketNotFoundException("Ticket not found with id : " + ticketId);
        }
        return ticket;
    }

    public Ticket putTicket(Ticket ticket){
        ticket.setId(++idCounter);
        ticketMap.put(ticket.getId(), ticket);
        System.out.println("Ticket has been added successfully");
        return ticketMap.get(idCounter);
    }
}
