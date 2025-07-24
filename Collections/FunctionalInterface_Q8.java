package collections;
import java.util.*;
import java.util.function.*;
public class FunctionalInterface_Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Supplier<ArrayList<Integer>> s=()->{
        	int num=2;
        	ArrayList<Integer> prime=new ArrayList<>();
        	while(prime.size()<10) {
        		if(isPrime(num)) {
        			prime.add(num);
        		}
        		num++;
        	}
        	return prime;
        };
        ArrayList<Integer> primeno=s.get();
        System.out.println(primeno);
		}

	private static boolean isPrime(int num) {
		// TODO Auto-generated method stub
		if(num<2) return false;
		for(int i=2;i<Math.sqrt(num);i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	}


