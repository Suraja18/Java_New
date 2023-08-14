package RMItofindoutTodayDay;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface DayCalculator extends Remote {
    String getCurrentDay() throws RemoteException;
}
