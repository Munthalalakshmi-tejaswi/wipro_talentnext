package oops_java;
class Calculator{
	private int num1;
	private int num2;
	private double nu1;
	private double nu2;
    void powerInt(int num1,int num2) {
		this.num1=num1;
		this.num2=num2;
	}
   int Calculatepower() {
	   return (int)Math.pow(num2,num1);
   }
    void powerDouble(double nu1,double nu2) {
    	this.nu1=nu1;
    	this.nu2=nu2;
    }
    double CalculatepowerDouble() {
    	return Math.pow(nu2,nu1);
    }
    
}
public class Oops_question_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator obj=new Calculator();
	      obj.powerInt(2, 2);
	      System.out.println(obj.Calculatepower());
	}

}
