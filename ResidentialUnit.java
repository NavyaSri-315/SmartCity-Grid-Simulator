package smartcity.buildings;

public class ResidentialUnit extends Building {
    private String[] residents;
    public double[] energyUsage;

    public ResidentialUnit(String address, int unitCount, String[] residents) {
        super(address, unitCount);
        this.residents = residents;
        this.energyUsage = new double[residents.length];
    }

    public void logUsage(int index, double kWh) {
        if (index >= 0 && index < energyUsage.length)
            energyUsage[index] += kWh;
    }

    public void printUsage() {
        for (int i = 0; i < residents.length; i++) {
            System.out.println(residents[i] + ": " + energyUsage[i] + " kWh");
        }
    }

    public double totalUsage() {
        double tot = 0;
        for (double usage : energyUsage) tot += usage;
        return tot;
    }
}
