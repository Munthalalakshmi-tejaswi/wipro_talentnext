package arrays_java;

import java.util.Scanner;

public class arrays_question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++) {
    	arr[i]=sc.nextInt();
    }
    for(int i=0;i<n-1;i++) {
    	for(int j=0;j<n-1-i;j++) {
    		if(arr[j]>arr[j+1]) {
    			int temp=arr[j];
    			arr[j]=arr[j+1];
    			arr[j+1]=temp;
    		}
    	}
    }
    for(int a:arr) {
    	System.out.print(a+" ");
    }
	}

}
