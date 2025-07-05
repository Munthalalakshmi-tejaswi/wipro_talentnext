package fundamental;
import java.util.*;
public class question_4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter integer:");
		int n=sc.nextInt();
        if(n==0) {
        	System.out.println("Zero");
        }
        else if(n>0) {
        	System.out.println("Positive");
        }
        else {
        	System.out.println("Negative");
        }
	}

}
