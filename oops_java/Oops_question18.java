package oops_java;
import java.util.*;
public class Oops_question18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     StringJoiner s1=new StringJoiner(",","{","}");
     ArrayList<String> s2=new ArrayList<String>();
     s2.add("Teju");
     s2.add("keerthana");
     s2.add("wipro");
     s2.forEach(element -> s1.add(element));
     System.out.println(s1);
	}

}
