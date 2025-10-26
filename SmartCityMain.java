package smartcity;

import smartcity.buildings.*;
import smartcity.exceptions.OverloadException;
import smartcity.i.o.ReportWriter;
import smartcity.threads.LoadBalancer;

public class SmartCityMain {
    public static void main(String[] args) {
        String[] r1 = {"Alice", "Bob"};
        String[] r2 = {"Cathy", "Dan", "Eve"};

        SmartUnit unit1 = new SmartUnit("Block A", 2, r1, 50.0);
        SmartUnit unit2 = new SmartUnit("Block B", 3, r2, 80.0);

        unit1.logUsage(0, 10.5);
        unit1.logUsage(1, 12.3);
        unit2.logUsage(0, 20.0);
        unit2.logUsage(1, 25.0);
        unit2.logUsage(2, 40.0);

        unit1.connectToGrid();
        unit2.connectToGrid();

        unit1.transmitUsage();
        unit2.transmitUsage();

        try {
            unit1.checkOverload();
            unit2.checkOverload();
        } catch (OverloadException e) {
            System.out.println("ALERT: " + e.getMessage());
        } finally {
            System.out.println("Checked all units.");
        }

        String content = "Energy Report\n";
        content += unit1.getAddress() + ": " + unit1.totalUsage() + "\n";
        content += unit2.getAddress() + ": " + unit2.totalUsage() + "\n";
        ReportWriter.writeReport("report.txt", content);

        LoadBalancer lb1 = new LoadBalancer(unit1.totalUsage());
        LoadBalancer lb2 = new LoadBalancer(unit2.totalUsage());
        lb1.start();
        lb2.start();

        try {
            lb1.join();
            lb2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        unit1.disconnectFromGrid();
        unit2.disconnectFromGrid();
        System.out.println("Simulation complete.");
    }
}
