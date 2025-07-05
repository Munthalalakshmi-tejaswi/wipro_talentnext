package fundamental;

public class question_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	      if(args.length==0) {
	    	  System.out.println("No values");
	      }
	      else {
	    	  for(int i=0;i<args.length;i++) {
	    		  if(i!=args.length-1) {
	    			  System.out.print(args[i]+",");
	    		  }else {
	    		  System.out.print(args[i]);
	    		  }
	    	  }
	      }
	}

}
