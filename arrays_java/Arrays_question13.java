package arrays_java;
import java.util.*;
public class Arrays_question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   if(args.length!=4) {
	   System.out.println("Please enter 4 numbers");
	   return;
   }
   int[][] arr=new int[2][2];
   try {
	   arr[0][0]=Integer.parseInt(args[0]);
	   arr[0][1]=Integer.parseInt(args[1]);
	   arr[1][0]=Integer.parseInt(args[2]);
	   arr[1][1]=Integer.parseInt(args[3]);
   }
   catch(Exception e) {
	   System.out.println("Invalid");
   }
   System.out.println(arr[0][0]+" "+arr[0][1]);
   System.out.println(arr[1][0]+" "+arr[1][1]);
   System.out.println("After swapping");
   int temp=arr[0][0];
   arr[0][0]=arr[1][1];
   arr[1][1]=temp;
   temp=arr[0][1];
   arr[0][1]=arr[1][0];
   arr[1][0]=temp;
   System.out.println(arr[0][0]+" "+arr[0][1]);
   System.out.println(arr[1][0]+" "+arr[1][1]);
	}

}
