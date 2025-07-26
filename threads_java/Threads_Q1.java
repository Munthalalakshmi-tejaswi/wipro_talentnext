package threads_java;
class Demo implements Runnable{
	String threadName;
	Demo(String name){
		threadName=name;
	}
	public void run() {
		
		try {
			System.out.println(threadName);
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
}
public class Threads_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Demo d=new Demo("Scooby");
	Demo d2=new Demo("Shaggy");
	Thread t1=new Thread(d);
	Thread t2=new Thread(d2);
    t1.start();
    t2.start();
	}

}
