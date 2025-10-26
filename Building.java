package smartcity.buildings;

public class Building {
    protected String address;
    private int unitCount;

    public Building(String address, int unitCount) {
        this.address = address;
        this.unitCount = unitCount;
    }

    public int getUnitCount() {
        return unitCount;
    }

    public String getAddress() {
        return address;
    }

    public void reportStatus() {
        System.out.println("Building at " + address + " with " + unitCount + " units.");
    }
}
