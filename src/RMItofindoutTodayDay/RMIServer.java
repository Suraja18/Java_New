package RMItofindoutTodayDay;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIServer {
    public static void main(String[] args) {
        try {
            DayCalculatorImpl calculator = new DayCalculatorImpl();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("DayCalculator", calculator);
            System.out.println("The Server is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

