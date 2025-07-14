package oops_java;

import java.util.Optional;

public class Oops_question22 {
	String Employee;
	public static void main(String[] args) {
		Oops_question22 obj=new Oops_question22();
		Optional<String> n=Optional.ofNullable(obj.Employee);
		System.out.println(n.orElseThrow(InvalidEmployeeException::new));
	}

}
