package fundamental;

public class question_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String gender=args[0];
		int age=Integer.parseInt(args[1]);
		if(gender.equalsIgnoreCase("Female")) {
			if(age>=1&&age<=58) 
				System.out.println("the percentage of interest is 8.2%.");
			else if(age>=59&&age<=100) 
				System.out.println("the percentage of interest is 9.2%.");
			
		}else if(gender.equalsIgnoreCase("Female")) {
			if(age>=1&&age<=58)
				System.out.println("the percentage of interest is 8.4%.");
			else if(age>=59&&age<=100)
				System.out.println("the percentage of interest is 10.5%.");
		}
		else {
			System.out.println("Invalid gender and age");
		}
	}

}
