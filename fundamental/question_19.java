package fundamental;

public class question_19 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1234;
		int rev=0;
		while(num!=0) {
			int dig=num%10;
			rev=rev*10+dig;
		    num=num/10;
		}
     System.out.print(rev);
	}

}
