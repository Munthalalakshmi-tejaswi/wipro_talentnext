package oops_java;
class Person{
	int member;
}
class Employee extends Person{
	double annual;
	int nationaliss;
	public void setEmploee(double annual,int nationaliss) {
		this.annual=annual;
		this.nationaliss=nationaliss;
	}
	public int getmember() {
		return member;
	}
	public double getAnnual() {
		return annual;
	}
	public int getnationaliss() {
		return nationaliss;
	}
}
public class Oops_question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.setEmploee(1000,101);
		e.member=1;
		System.out.println(e.getnationaliss());
        System.out.println(e.getmember());
	}

}
