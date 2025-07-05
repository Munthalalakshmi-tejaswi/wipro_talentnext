package fundamental;

public class question_16 {

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
     for(int num=10;num<=99;num++) {
    	 if(isPrime(num)) {
    	 System.out.println(num);
     }
     }
	}

}
