package fundamental;

public class question_18 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		int row=1;
		while(row<=n) {
			for(int i=1;i<=row;i++) {
				System.out.print("*");
			}
			System.out.println();
			row++;
		}
	}
}
