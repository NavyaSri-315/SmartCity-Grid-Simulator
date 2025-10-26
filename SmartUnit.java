package smartcity.buildings;

import smartcity.grid.GridOperable;
import smartcity.exceptions.OverloadException;

public class SmartUnit extends ResidentialUnit implements GridOperable {
    private double maxLimit;

    public SmartUnit(String address, int unitCount, String[] residents, double maxLimit) {
        super(address, unitCount, residents);
        this.maxLimit = maxLimit;
    }

    public void connectToGrid() {
        System.out.println(getAddress() + " connected to grid.");
    }

    public void transmitUsage() {
        System.out.println("Transmitting usage: " + totalUsage() + " kWh from " + getAddress());
    }

    public void disconnectFromGrid() {
        System.out.println(getAddress() + " disconnected from grid.");
    }

    public void checkOverload() throws OverloadException {
        if (totalUsage() > maxLimit)
            throw new OverloadException("Energy overload in " + getAddress());
    }
}
