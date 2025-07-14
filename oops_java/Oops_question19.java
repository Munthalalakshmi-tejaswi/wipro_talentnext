package oops_java;
import java.util.*;
public class Oops_question19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     StringJoiner s1=new StringJoiner("-");
    StringJoiner s2=new StringJoiner("-");
    s1.add("Hyderabad");
    s1.add("Chennai");
    s1.add("Banglore");
    s2.add("City");
    s2.add("Cities");
    StringJoiner me1=new StringJoiner("-");
    me1.merge(s1);
    me1.merge(s2);
    
    System.out.println(me1);
    StringJoiner me2=new StringJoiner("-");
    me2.merge(s2);
    me2.merge(s1);
    
    System.out.println(me2);
	}

}
