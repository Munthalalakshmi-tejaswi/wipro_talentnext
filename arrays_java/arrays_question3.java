package arrays_java;
import java.util.*;
public class arrays_question3 {
	public static int Search(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;

			}
		}
		return -1;

	}
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
		int target = sc.nextInt();
		int key=Search(arr, target);
		if ( key== -1) {
			System.out.println("-1");
		} else {
			System.out.println(key);
		}
	}

}
