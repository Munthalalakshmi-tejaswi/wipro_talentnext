interface Test{
	int myFunction(int a,int b,int c);
}
public class Interface_2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Test t1=(a,b,c)->a+b+c;
     Test t2=(a,b,c)->a*b*c;
     int res1=t1.myFunction(1, 2,3);
     int res2=t2.myFunction(2, 1, 4);
     System.out.println(res1);
     System.out.println(res2);
	}

}
