package fundamental;

public class question_15 {

	public static boolean isPrime(int num) {
    	if(num<=1) {
    		return false;
    	}
    	else {
    		for(int i=2;i<=Math.sqrt(num);i++) {
    			if(num%i==0) {
    				return false;
    			}
    		}
    	
    	return true;
    	}

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=12;
		if(isPrime(num)) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not a Prime");
		}

	}
}
