package collections;
interface myRef{
	int fac(int n);
}
public class Methodref_Q1 {
   public  int factorial(int n) {
	if(n==0||n==1) {
		return n;
	}
	else {
		return n*factorial(n-1);
	}
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Methodref_Q1 m=new Methodref_Q1();
    myRef ref=m::factorial;
    System.out.println(ref.fac(5));
	}

}
