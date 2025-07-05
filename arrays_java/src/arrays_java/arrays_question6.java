package arrays_java;
import java.util.*;
public class arrays_question6 {
	public static void Printarr(int[] arr) {
    	int evennum=0;
    	int oddnum=arr.length-1;
    	while(evennum<oddnum) {
    		if(arr[evennum]%2==0) {
    			evennum++;
    		}else { 
    			if(arr[oddnum]%2!=0) {
    		
    			oddnum--;
    		}
    		else {
    			int temp=arr[evennum];
    			arr[evennum]=arr[oddnum];
    			arr[oddnum]=temp;
    			evennum++;
    			oddnum--;
    		}
    		}
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of arr");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter arr ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Printarr(arr);
	    for(int ss:arr) {
	    	System.out.print(ss+" ");
	    }
	}

}
