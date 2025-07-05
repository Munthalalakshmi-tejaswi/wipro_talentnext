package arrays_java;
import java.util.*;
public class arrays_question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter arr");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
       int sum=0,avg=0;
       for(int i=0;i<n;i++) {
    	   sum+=arr[i];
       }
       avg=sum/n;
       System.out.println(sum);
       System.out.println(avg);
	}

}
