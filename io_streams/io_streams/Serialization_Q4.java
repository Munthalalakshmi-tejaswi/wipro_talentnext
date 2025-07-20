package io_streams;
import java.io.*;
import java.util.*;
class Employee implements Serializable{
	private String name;
	private Date dateOfBirth;
	private String department;
	private String designation;
	double Salary;
	public Employee() {
		
	}
	public Employee(String name,Date dateOfBirth,String department,double Salary) {
		this.name=name;
		this.dateOfBirth=dateOfBirth;
		this.department=department;
		this.Salary=Salary;
	}
	public String getName(String name) {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public Date getDate(Date dateOfBirth) {
		return dateOfBirth;
	}
	public void setDate(Date dateOfBirth) {
		this.dateOfBirth=dateOfBirth;
	}
	public String getdepartment(String department) {
		return department;
	}
	public void setDepartment(String department) {
		this.department=department;
	}
	
	public double getSalary(double Salary) {
		return Salary;
	}
	public void setSalary(double Salary) {
		this.Salary=Salary;
	}
	public String toString() {
		return "Employee [name="+name+",dateOfBirth="+dateOfBirth+",department="+department+",Salary="+Salary+"]";
	}
}
public class Serialization_Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Employee emp=new Employee("Tej",new Date(),"Software Engineer",90000.0);
      try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("data"))){
    	  oos.writeObject(emp);
    	  System.out.println("Employee object has Serializable data");
      }catch(IOException e) {
    	  e.printStackTrace();
      }try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("data"))){
    	  Employee deserializedEmp=(Employee) ois.readObject();
    	  System.out.println("Deserialized Employee object:");
    	  System.out.println(deserializedEmp);
      }catch(IOException|ClassNotFoundException e) {
    	  e.printStackTrace();
      }
      
	}

}
