package arrays_java;

public class Arrays_Question9 {
    public static int Printsum(int[] arr) {
    	int sum=0;
    	boolean ignore=false;
    	for(int i=0;i<arr.length;i++) {
    		if(arr[i]==6) {
    			ignore=true;
    			continue;
    		}
    		else if(arr[i]==7&&ignore) {
    			ignore=false;
    			continue;
    		}
    		else if(!ignore) {
    			sum+=arr[i];
    		}
    	}
    	return sum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,3,6,1,2,7,9};
    System.out.println(Printsum(arr));
	}

}
