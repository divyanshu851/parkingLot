package parkingLot.service;

import parkingLot.models.Bill;
import parkingLot.models.Ticket;
import parkingLot.repository.TicketRepository;
import parkingLot.service.strategy.billCalculationStrategy.BillCalculationStrategy;
import parkingLot.service.strategy.billCalculationStrategy.BillCalculationStrategyFactory;

public class BillService {
    public Bill generateBill(int ticketId, int exitGateId, TicketRepository ticketRepository){
        BillCalculationStrategy billCalculationStrategy = BillCalculationStrategyFactory.getBillCalculationStrategy();
        Ticket ticket = ticketRepository.getTicket(ticketId);
        Bill bill = billCalculationStrategy.generateBill(ticket);
        Bill bill1 = new Bill();
        return bill1;
    }
}
