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
        String dayName;
        switch (dayOfWeek) {
            case MONDAY:
                dayName = "Monday";
                break;
            case TUESDAY:
                dayName = "Tuesday";
                break;
            case WEDNESDAY:
                dayName = "Wednesday";
                break;
            case THURSDAY:
                dayName = "Thursday";
                break;
            case FRIDAY:
                dayName = "Friday";
                break;
            case SATURDAY:
                dayName = "Saturday";
                break;
            case SUNDAY:
                dayName = "Sunday";
                break;
            default:
                dayName = "Unknown";
                break;
        }

        return dayName;
//        return dayOfWeek.toString();
    }
}
