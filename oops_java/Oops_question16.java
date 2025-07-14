package oops_java;

public class Oops_question16 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String a="Hello";
		String b="World";
		int i=0,j=0;
		StringBuilder str=new StringBuilder();
		while(i<a.length()&&j<b.length()) {
			str.append(a.charAt(i++));
			str.append(b.charAt(j++));
		}
	   System.out.println(str);
	}

}
