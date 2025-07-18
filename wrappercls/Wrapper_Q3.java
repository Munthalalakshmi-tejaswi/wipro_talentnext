package wrappercls;
import java.util.*;
public class Wrapper_Q3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		String bi=Integer.toBinaryString(num);
		if(num>=0&&num<=255) {
			System.out.println(String.format("%8s", bi).replace(' ', '0'));
		}
	}

}
