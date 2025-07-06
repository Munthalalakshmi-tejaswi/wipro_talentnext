package arrays_java;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_question10 {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++) {
    	arr[i]=sc.nextInt();
    }
    System.out.println(Arrays.toString(withoutTen(arr)));
	}

	public static int[] withoutTen(int[] arr) {
		int[] res=new int[arr.length];
		int idx=0;
		for(int a:arr) {
			if(a!=10) {
				res[idx++]=a;
			}
		}
		while(idx<arr.length) {
			res[idx++]=0;
		}
		return res;
	}
	
}
