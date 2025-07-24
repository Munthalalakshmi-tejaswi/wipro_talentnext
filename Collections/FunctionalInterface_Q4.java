package collections;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
class Employeeess{
	int id;
	String name;
	int salary;
	Employeeess(int id,String name,int salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public String toString() {
		return "id "+id+" name "+name+" salary "+salary;
	}
}
public class FunctionalInterface_Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List<Employeeess> li=new ArrayList<>();
      li.add(new Employeeess(1,"Tejaswi",100000));
      li.add(new Employeeess(2,"Keerthana",25000));
      li.add(new Employeeess(3,"swati",30000));
      li.add(new Employeeess(4,"Mokshi",40000));
      li.add(new Employeeess(5,"sahithi",25000));
      Predicate<Employeeess> p=emp->emp.salary>10000;
      
      li.stream().filter(p).forEach(System.out::println);
	}

}
