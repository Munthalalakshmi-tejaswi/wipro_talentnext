package oops_java;

public class Oops_question14 {
   public static String NewS(String str) {
	   if(str.length()==0) {
		   return "0";
	   }
	   else {
		   int sta=0;
		   int end=str.length()-1;
		   if(str.charAt(sta)=='x') {
			   sta++;
		   }
		   if(str.length()>0&&end>=0&&str.charAt(end)=='x') {
			   end--;
		   }
		   if(sta>end) {
			   return "";
		   }
		   return str.substring(sta,end+1);
	   }
	   
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str="xHix";
      System.out.println(NewS(str));
	}

}
