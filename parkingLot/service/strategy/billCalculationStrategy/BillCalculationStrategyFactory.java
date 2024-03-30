package parkingLot.service.strategy.billCalculationStrategy;

public class BillCalculationStrategyFactory {
    public static BillCalculationStrategy getBillCalculationStrategy(){
        return new SimpleBillCalculationStrategy();
    }
}
