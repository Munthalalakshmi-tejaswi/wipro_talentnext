package test;
class Compartment{
	double height;
	double width;
	double breadth;
	public void setCompartment(double height,double width,double breadth){
		this.height=height;
		this.width=width;
		this.breadth=breadth;
	}
	public double getHeight() {
		return height;
	}
	public double getWidth() {
		return width;
	}
	public double getBreadth() {
		return breadth;
	}
	public double getVolume() {
		return height*width*breadth;
	}
	public void getAlldetails() {
		System.out.println("Height : "+getHeight());
		System.out.println("Width : "+getWidth());
		System.out.println("Breadth : "+getBreadth());
		System.out.println("Volume : "+getVolume());
	}
}
public class Package_Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Compartment obj=new Compartment();
     obj.setCompartment(10.0, 20.0, 30.0);
     obj.getAlldetails();
	}

}
