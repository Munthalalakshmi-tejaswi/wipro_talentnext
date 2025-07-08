package oops_java;
class Box{
	double height;
	double width;
	double depth;
	
	void setVolume(double height,double width,double depth) {
		this.height=height;
		this.width=width;
		this.depth=depth;
	}
	double getVolume() {
		return height*width*depth;
	}
}
public class Oops_question_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Box obj=new Box();
	     obj.setVolume(10.0,20.0,30.0);
	     System.out.println(obj.getVolume());
	     
	}

}
