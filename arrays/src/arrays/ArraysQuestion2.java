package arrays;

import java.util.Scanner;

public class ArraysQuestion2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n values");
		int n=sc.nextInt();
        System.out.println("Enter arr values");
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
        	arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<n;i++) {
        	if(arr[i]>max) {
        		max=arr[i];
        	}
        	if(arr[i]<min) {
        		min=arr[i];
        	}
        }
        System.out.println(max);
        System.out.println(min);
	}

}
