package oops_java;
public class Oops_question11 {
 public static String PrintS(String str) {
	 int length=str.length();
	 if(length%2!=0) {
		 return null;
	 }
	 else {
		 return str.substring(0,length/2);
	 }
 }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Tomcat";
		System.out.println(PrintS(str));
	}  

}
