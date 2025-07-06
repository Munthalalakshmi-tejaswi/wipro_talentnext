package arrays_java;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int[] arr=new int[n];
     for(int i=0;i<n;i++) {
    	 arr[i]=sc.nextInt();
     }
    System.out.println(Correct(arr));
	}
	public static boolean Correct(int[] arr) {
		for(int a:arr) {
			if(a==1||a==4) {
				return true;
			}
		}
		return false;
	}

}
