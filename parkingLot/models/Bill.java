package parkingLot.models;

import parkingLot.enums.BillStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Bill extends BaseModel{
    private LocalDateTime exitTime;
    private double amount;
    private Ticket ticket;
    private Gate exitGate;
    private BillStatus status;

    public Bill(){

    }
    public Bill(LocalDateTime exitTime, double amount, Ticket ticket, Gate exitGate, BillStatus status) {
        this.exitTime = exitTime;
        this.amount = amount;
        this.ticket = ticket;
        this.exitGate = exitGate;
        this.status = status;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Gate getExitGate() {
        return exitGate;
    }

    public void setExitGate(Gate exitGate) {
        this.exitGate = exitGate;
    }

    public BillStatus getStatus() {
        return status;
    }

    public void setStatus(BillStatus status) {
        this.status = status;
    }
}
