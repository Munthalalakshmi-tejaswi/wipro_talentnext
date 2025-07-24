package collections;
import java.util.*;
import java.util.function.*;
public class FunctionalInterface_Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<String> li=new ArrayList(Arrays.asList("ab","cd","ef","gh","ij","kl","mn","op","qrs","tu"));
    Consumer<List<String>> reversn=list->{
    	for(int i=0;i<list.size();i++) {
    		String word=list.get(i);
    		String reversed=new StringBuilder(word).reverse().toString();
    		list.set(i, reversed);
    	}
    };
    reversn.accept(li);
    li.forEach(System.out::println);
   	}

}
