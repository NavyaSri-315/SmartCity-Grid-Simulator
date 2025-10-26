package smartcity.threads;

public class LoadBalancer extends Thread {
    private double loadValue;

    public LoadBalancer(double loadValue) {
        this.loadValue = loadValue;
    }

    public void run() {
        System.out.println("Balancing load: " + loadValue + " kWh");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Balancer interrupted.");
        }
        System.out.println("Load balanced: " + loadValue + " kWh");
    }
}
