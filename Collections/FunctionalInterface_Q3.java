package collections;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
public class FunctionalInterface_Q3 {

	public static void main(String[] args) {
	ArrayList<String> li=new ArrayList(Arrays.asList("Teju","madam","ujju","kissik","liril","swati"));
	Predicate<String> p=word->word.equalsIgnoreCase(new StringBuilder(word).reverse().toString());
	List<String> palin=li.stream().filter(p).collect(Collectors.toList());
	palin.forEach(System.out::println);
   
	}

	

}
