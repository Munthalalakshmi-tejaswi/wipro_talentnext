package collections;

import java.util.*;
import java.util.function.*;
public class FunctionalInterface_Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<Integer> li=new ArrayList(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
      
       Consumer<List<Integer>> cc=list->{
    	   for(int n:list) {
    		   if(n%2==0) {
    			   System.out.println(n+" Even");
    		   }else {
    			   System.out.println(n+" Odd");
    		   }
    	   }
         };
       cc.accept(li);
      
	}

}
