package oops_java;
abstract class Shape{
	abstract void draw();
	abstract void erase();
	
}
class Circle extends Shape{
	 void draw() {
		System.out.println("Circle Drawing");
	}
	 void erase() {
		 System.out.println("Circle erasing..");
	 }
}
class Triangle extends Shape{
	void draw() {
		System.out.println("Rectangle Drawing..");
	}
	void erase() {
		System.out.println("Rectangle erasing..");
	}
}
class Square extends Shape{
	 void draw() {
		System.out.println("Square Drawing");
	}
	 void erase() {
		 System.out.println("Square erasing..");
	 }
}

public class Oops_question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Shape c=new Circle();
     Shape t=new Triangle();
     Shape s=new Square();
     c.draw();
     c.erase();
     t.draw();
     t.erase();
     s.draw();
     t.erase();
     
     
	}

}
