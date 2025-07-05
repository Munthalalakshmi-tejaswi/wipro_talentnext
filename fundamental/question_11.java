package fundamental;
import java.util.*;
public class question_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character");
		char code=sc.next().charAt(0);
		switch(Character.toUpperCase(code)) {
		case 'R':
			System.out.println(code+"->Red");
			break;
		case 'B':
			System.out.println(code+"->Blue");
			break;
		case 'G':
			System.out.println(code+"->Green");
			break;
		case 'O':
			System.out.println(code+"->Orange");
			break;
		case 'Y':
			System.out.println(code+"->Yellow");
			break;
		case 'W':
			System.out.println(code+"->White");
			break;
		default:
			System.out.println("Invalid Code");
		}

	}

}
