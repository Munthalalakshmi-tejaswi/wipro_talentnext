package collections;
import java.util.function.*;
import java.util.*;
public class FunctionalInterface_Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> li=new ArrayList(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		Function<List<Integer>,Integer> cal=list->{
			int sum=0;
			for(int n:li) {
				sum+=n;
			}
			return sum;
		};
		
		System.out.println(cal.apply(li));
	}
}
