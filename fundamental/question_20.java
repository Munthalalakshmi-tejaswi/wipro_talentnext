package fundamental;

public class question_20 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1221;
		int original=num;
		int rev=0;
		while(num!=0) {
			int dig=num%10;
			rev=rev*10+dig;
			num=num/10;
		}
		if(original==rev) {
			System.out.println(original+" is Palindrome number");
		}
		else {
			System.out.println(original+" is not a Palindrome number");
		}

	}
}
