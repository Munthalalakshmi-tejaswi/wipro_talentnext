package oops_java;
import java.util.*;
public class Oops_question20 {
 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] names=new String[5];
		for(int i=0;i<names.length;i++) {
			names[i]=sc.nextLine();
		}
		Optional<String> n=Optional.ofNullable(names[0]);
		if(n.isPresent()) {
			System.out.println(n.get().length());
		}else {
			System.out.println("null");
		}
	}

}
