package oops_java;
class Fruit{
	String name;
	String taste;
    String size;
	Fruit(String name,String taste,String size){
		this.name=name;
		this.taste=taste;
		this.size=size;
	}
	public void eat() {
		System.out.println("Pineapple");
		System.out.println("sweet..");
	}
}
class Apple extends Fruit{
	public Apple(String name,String taste,String size) {
		super(name,taste,size);
	}
	public void eat() {
		System.out.println("apple taste");
	}
}
class Orange extends Fruit{

	public Orange(String name,String taste,String size) {
		super(name,taste,size);
	}
	public void eat() {
		System.out.println("Orange taste");
	}
}
public class Oops_question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit obj=new Fruit("Friut","swet","medium");
		Apple obj2=new Apple("Apple","apple taste","large");
		Orange obj3=new Orange("Orange","Orangetaste","large");
		obj.eat();
		obj2.eat();
		obj3.eat();
	

	}

}
