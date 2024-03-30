package parkingLot.models;

import parkingLot.enums.ParkingLotStatus;
import parkingLot.enums.VehicleType;
import parkingLot.service.strategy.billCalculationStrategy.BillCalculationStrategy;
import parkingLot.service.strategy.spotAllocationStrategy.SpotAllocationStrategy;

import java.util.List;

public class ParkingLot extends BaseModel{

        private List<ParkingFloor> floors;
        private List<VehicleType> vehicleTypesSupported;
        private ParkingLotStatus parkingLotStatus;
        private String address;
        private String name;
        private int capacity;

        private BillCalculationStrategy billCalculatorStrategy;
        private SpotAllocationStrategy spotAllocationStrategy;

        public ParkingLot(){

        }
        public ParkingLot(List<ParkingFloor> floors, List<VehicleType> vehicleTypesSupported, ParkingLotStatus parkingLotStatus, String address, String name, int capacity, BillCalculationStrategy billCalculatorStrategy, SpotAllocationStrategy slotAllocationStrategy) {
                this.floors = floors;
                this.vehicleTypesSupported = vehicleTypesSupported;
                this.parkingLotStatus = parkingLotStatus;
                this.address = address;
                this.name = name;
                this.capacity = capacity;
                this.billCalculatorStrategy = billCalculatorStrategy;
                this.spotAllocationStrategy = slotAllocationStrategy;
        }

        public List<ParkingFloor> getFloors() {
                return floors;
        }

        public void setFloors(List<ParkingFloor> floors) {
                this.floors = floors;
        }

        public List<VehicleType> getVehicleTypesSupported() {
                return vehicleTypesSupported;
        }

        public void setVehicleTypesSupported(List<VehicleType> vehicleTypesSupported) {
                this.vehicleTypesSupported = vehicleTypesSupported;
        }

        public ParkingLotStatus getParkingLotStatus() {
                return parkingLotStatus;
        }

        public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
                this.parkingLotStatus = parkingLotStatus;
        }

        public String getAddress() {
                return address;
        }

        public void setAddress(String address) {
                this.address = address;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public int getCapacity() {
                return capacity;
        }

        public void setCapacity(int capacity) {
                this.capacity = capacity;
        }

        public BillCalculationStrategy getBillCalculatorStrategy() {
                return billCalculatorStrategy;
        }

        public void setBillCalculatorStrategy(BillCalculationStrategy billCalculatorStrategy) {
                this.billCalculatorStrategy = billCalculatorStrategy;
        }

        public SpotAllocationStrategy getSpotAllocationStrategy() {
                return spotAllocationStrategy;
        }

        public void setSpotAllocationStrategy(SpotAllocationStrategy spotAllocationStrategy) {
                this.spotAllocationStrategy = spotAllocationStrategy;
        }
}
