package oops_java;

public class Oops_question13 {
    public static String StrS(String a,String b) {
    	if(a.length()==0||b.length()==0) {
    		return "0";
    	}else {
    		return a.concat(b).concat(a);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="hi";
		String b="hello";
		System.out.println(StrS(a,b));
  
	}

}
