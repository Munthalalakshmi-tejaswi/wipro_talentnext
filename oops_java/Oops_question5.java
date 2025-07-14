package oops_java;
class Animal{
	public void eat() {
		System.out.println("Animals eating..");
	}	
	public void sleep() {
		System.out.println("Animal Sleeping");
	}
}
class Bird extends Animal{
	public void fly() {
		System.out.println("Birds fly..");
	}
	public void eat() {
		System.out.println("Bird eating..");
	}	
	public void sleep() {
		System.out.println("Bird Sleeping");
	}
}
public class Oops_question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Animal obj=new Animal();
        obj.eat();
        obj.sleep();
        Bird obj2=new Bird();
        obj2.eat();
        obj2.sleep();
        obj2.fly();
	}

}
