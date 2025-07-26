package threads_java;
class Demoo implements Runnable{
	String threadName;
	String colours[]={"white","blue","black","green","red","yellow"};
	Demoo(String name){
		threadName=name;
	}
	public void run() {
		try {
		for(int i=0;i<colours.length;i++) {
			System.out.println(colours[i]+" "+threadName);
			if(colours[i].equals("red")) {
			
				break;
			}
		
			Thread.sleep(1000);
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
public class Thread_Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Demoo d1=new Demoo("Colors");
	Thread t1=new Thread(d1);
	t1.start();
	}

}
