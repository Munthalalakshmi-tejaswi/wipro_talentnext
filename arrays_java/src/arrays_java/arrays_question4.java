package arrays_java;
import java.util.*;
public class arrays_question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n values");
		int n = sc.nextInt();
		System.out.println("Enter arr values");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
       for(int a:arr) {
    	   if(a>=0&&a<127) {
    	   System.out.println((char)a);
    	   }else {
    		   System.out.println("Invalid");
    	   }
       }
	}

}
