package fundamental;

public class question_4B {
	public static boolean lastDigit(int n1,int n2) {
    	if(n1%10==n2%10) {
    		return true;
    	}else {
    		return false;
    	}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=27;
	      int n2=57;
	      System.out.println(lastDigit(n1,n2));
	}

}
