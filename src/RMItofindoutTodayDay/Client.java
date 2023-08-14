package RMItofindoutTodayDay;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            DayCalculator calculator = (DayCalculator) registry.lookup("DayCalculator");
            String currentDay = calculator.getCurrentDay();
            System.out.println("Today is " + currentDay);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


