package collections;
import java.util.*;
import java.util.stream.*;
import java.util.function.*;
class Employeesss{
	int id;
	String name;
	String location;
	int salary;
	Employeesss(int id,String name,String location,int salary){
		this.id=id;
		this.name=name;
		this.location=location;
		this.salary=salary;
	}
}
public class FunctionalInterface_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    List<Employeesss> li=new ArrayList<>();
    li.add(new Employeesss(1,"Tejaswi","Hyderabad",100000));
    li.add(new Employeesss(2,"Keerthana","Tirupati",25000));
    li.add(new Employeesss(3,"swati","Indhupur",30000));
    li.add(new Employeesss(4,"Mokshi","Hyderabad",40000));
    li.add(new Employeesss(5,"sahithi","Tirupati",25000));
    Function<Employeesss,String> getlocation=emp->emp.location;
    ArrayList<String> locations=li.stream().map(getlocation).collect(Collectors.toCollection(ArrayList::new));
    locations.forEach(System.out::println);
	}

}
