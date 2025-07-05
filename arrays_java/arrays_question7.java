package arrays_java;

public class arrays_question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length!=9) {
	    	System.out.println("Enter exactly 9");
	    	return;
	    }
	    int[][] arr=new int[3][3];
	    int idx=0;
	    try{
	    for(int i=0;i<3;i++) {
	    	for(int j=0;j<3;j++) {
	    		arr[i][j]=Integer.parseInt(args[idx++]);
	    	}
	    }
	   }catch(Exception e) {
		   System.out.println("Invalid");
	   }
	    for(int i=0;i<3;i++) {
	    	for(int j=0;j<3;j++) {
	    		System.out.print(arr[i][j]+" ");
	    	}
	    	System.out.println();
	    }
	    int biggest=arr[0][0];
	    for(int i=0;i<3;i++) {
	    	for(int j=0;j<3;j++) {
	    		if(arr[i][j]>biggest) {
	    			biggest=arr[i][j];
	    		}
	    	}
	     }
	    System.out.println("BIggest number"+biggest);
	}

}
