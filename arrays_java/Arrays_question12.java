package arrays_java;
import java.util.*;
import java.util.Arrays.*;
public class Arrays_question12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		
		int[] arr=new int[3];
		for(int i=0;i<3;i++) {
			arr[i]=sc.nextInt();
		}
		int[] arr2=new int[3];
		for(int i=0;i<3;i++) {
			arr2[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(middleway(arr,arr2)));
	}
	public static int[] middleway(int[] arr,int[] arr2) {
		int[] res=new int[2];
		res[0]=arr[1];
		res[1]=arr2[1];
		return res;
	}

}
