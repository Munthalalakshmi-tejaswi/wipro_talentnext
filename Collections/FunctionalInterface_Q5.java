package collections;
import java.util.*;
import java.util.function.*;
public class FunctionalInterface_Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<Integer> li=new ArrayList(Arrays.asList(1,2,3,4,5,9,16,25,27,64));
     Predicate<Integer> p=n->{
    	 int sqrt=(int)Math.sqrt(n);
    	 return sqrt*sqrt==n;
     };
    li.stream().filter(p).forEach(System.out::println);
	}

}
