package arrays_java;
import java.util.*;
public class arrays_question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	     System.out.println("Enter arr size");
	     int n=sc.nextInt();
	     System.out.println("Enter arr values");
	     int[] arr=new int[n];
	     for(int i=0;i<n;i++) {
	    	 arr[i]=sc.nextInt();
	     }
	     for(int i=0;i<n;i++) {
	    	 boolean isDuplicate=false;
	    	 for(int j=0;j<i;j++) {
	    		 
	    		 if(arr[i]==arr[j]) {
	    			isDuplicate=true;
	    			break;
	    		 }
	    	 }
	    	if(!isDuplicate) {
	    		System.out.print(arr[i]+" ");
	    	}
	     }
	}

}
