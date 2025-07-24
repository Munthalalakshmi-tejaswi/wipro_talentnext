package collections;
import java.time.*;
public class DateTime_Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     LocalTime lt=LocalTime.now();
     System.out.println(lt);
     System.out.println(lt.minusHours(5).minusMinutes(30));
	}

}
