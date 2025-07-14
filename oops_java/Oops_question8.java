package oops_java;

public class Oops_question8 {

	public static void main(String[] args) {
		StringBuilder str=new StringBuilder();
		String name="liril";
		String rev="";
        
        for(int i=0;i<name.length();i++) {
        	char ch=name.charAt(i);
        	rev=ch+rev;
        	
        }
        if(name.equals(rev)) {
        	System.out.println("is palindrome");
        }
        else {
        	System.out.println("not a palindrome");
        }
	}

    
}
