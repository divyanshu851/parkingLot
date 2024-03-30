package parkingLot.models;

import parkingLot.enums.GateStatus;
import parkingLot.enums.GateType;

public class Gate extends BaseModel{
        private GateType gateType;
        private int gateNumber;

        private GateStatus gateStatus;

        private String operatorName;

        public Gate(){

        }
        public Gate(GateType gateType, int gateNumber, GateStatus gateStatus, String operatorName) {
                this.gateType = gateType;
                this.gateNumber = gateNumber;
                this.gateStatus = gateStatus;
                this.operatorName = operatorName;
        }

        public Gate(GateType gateType, int gateNumber) {
                this.gateType = gateType;
                this.gateNumber = gateNumber;
        }

        public GateType getGateType() {
                return gateType;
        }

        public void setGateType(GateType gateType) {
                this.gateType = gateType;
        }

        public int getGateNumber() {
                return gateNumber;
        }

        public void setGateNumber(int gateNumber) {
                this.gateNumber = gateNumber;
        }

        public GateStatus getGateStatus() {
                return gateStatus;
        }

        public void setGateStatus(GateStatus gateStatus) {
                this.gateStatus = gateStatus;
        }

        public String getOperatorName() {
                return operatorName;
        }

        public void setOperatorName(String operatorName) {
                this.operatorName = operatorName;
        }
}
