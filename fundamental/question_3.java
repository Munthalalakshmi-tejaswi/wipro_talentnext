package fundamental;

public class question_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length!=2) {
			System.out.println("Enter 2 integers exactly");
			return;
		}
		try {
      int num1=Integer.parseInt(args[0]);
      int num2=Integer.parseInt(args[1]);
      System.out.println("The sum of "+num1+" and "+num2+" is "+(num1+num2));
		}catch(Exception e) {
			System.out.println("Enter integers");
		}
	}

}
