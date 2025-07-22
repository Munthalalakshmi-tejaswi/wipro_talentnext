package collections;
interface mRef{
	void Prime(int n);
}
public class Method_refQ3 {
 Method_refQ3(int n){
	 if(n<2) {
		 System.out.println("Not prime");
	 }
	 else {
		 for(int i=2;i<Math.sqrt(n);i++) {
			 if(n%i==0) {
				 System.out.println("Not Prime");
			 }
		 }
		 System.out.println("Prime");
	 }
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   mRef rf=Method_refQ3::new;
   rf.Prime(5);
	}

}
