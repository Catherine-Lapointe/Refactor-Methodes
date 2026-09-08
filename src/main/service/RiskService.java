package main.service;

import main.domain.Cargo;
import main.domain.ShipmentInfo;
import main.domain.Shipment;

public class RiskService {
    public String evaluate(ShipmentInfo shipmentInfo, Shipment shipment) {
        if ((shipmentInfo.getDestination().getSecurityLevel() >= 4
                && !shipmentInfo.getOrigin().getSector().equals(shipmentInfo.getDestination().getSector()))
                || (shipment.getCargo().stream().anyMatch(Cargo::isHazardous)
                && shipment.getCargo().stream().mapToDouble(Cargo::getDeclaredValue).sum() > 50000)) {
            return "CRITICAL";
        }
        return "NORMAL";
    }
}
