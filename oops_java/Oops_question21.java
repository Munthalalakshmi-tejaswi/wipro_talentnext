package oops_java;

import java.util.Optional;

public class Oops_question21 {
    String address="India";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Oops_question21 obj=new Oops_question21();
    Optional<String> n=Optional.ofNullable(obj.address);
   System.out.println(n.orElse(obj.address));
	}

}
