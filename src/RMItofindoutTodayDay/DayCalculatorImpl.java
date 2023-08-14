package RMItofindoutTodayDay;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class DayCalculatorImpl extends UnicastRemoteObject implements DayCalculator {
    protected DayCalculatorImpl() throws RemoteException {
        super();
    }

    @Override
    public String getCurrentDay() throws RemoteException {
        LocalDate today = LocalDate.now();
        DayOfWeek dayOfWeek = today.getDayOfWeek();
        return dayOfWeek.toString();
    }
}
