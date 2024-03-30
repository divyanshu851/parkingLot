package parkingLot.service.strategy.billCalculationStrategy;

import parkingLot.enums.BillStatus;
import parkingLot.models.Bill;
import parkingLot.models.Ticket;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class SimpleBillCalculationStrategy implements BillCalculationStrategy {
    @Override
    public Bill generateBill(Ticket ticket) {
        LocalDateTime entryTime = ticket.getEntryTime();
        LocalDateTime exitTime = LocalDateTime.now();
        long numberOfSecond = ChronoUnit.SECONDS.between(exitTime, entryTime);
        Bill bill = new Bill();
        bill.setAmount(numberOfSecond);
        bill.setExitTime(exitTime);
        bill.setTicket(ticket);
        bill.setId(exitTime.hashCode());
        bill.setStatus(BillStatus.UNPAID);
        return bill;
    }
}
