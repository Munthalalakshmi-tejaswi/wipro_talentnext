package collections;
import java.time.*;
import java.time.temporal.*;
public class DateTime_Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    LocalDate dt=LocalDate.now();
    LocalDate firDaym=dt.plusMonths(1).withDayOfMonth(1);
    LocalDate firSun=firDaym;
    while(firSun.getDayOfWeek()!=DayOfWeek.SUNDAY) {
    	firSun=firSun.plusDays(1);
    }
    LocalDate SecSat=firSun.plusDays(7);
    System.out.println(SecSat);
	}

}
