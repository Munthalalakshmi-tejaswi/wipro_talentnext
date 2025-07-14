package oops_java;

public class Oops_question9 {

	public static void main(String[] args) {
		
	String str1="Mark";
	String str2="kate";
	String str=str1+str2;
	if(str1.charAt(str1.length()-1)==str2.charAt(0)) {
		str2=str2.substring(1);
	}
	String res=str1+str2;
	System.out.println(res.toLowerCase());
	}

}
