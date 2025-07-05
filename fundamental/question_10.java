package fundamental;

public class question_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='a';
	      if(Character.isLowerCase(ch)) {
	    	  System.out.println("i/p "+ch);
	    	  System.out.println("o/p->"+Character.toUpperCase(ch));
	      }
	      else {
	    	  System.out.println("i/p "+ch);
	    	  System.out.println("o/p->"+Character.toLowerCase(Character.toLowerCase(ch)));
	      }

	}

}
