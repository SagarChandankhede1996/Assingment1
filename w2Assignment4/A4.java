package w2Assignment4;
class MyRunnable implements Runnable{
	private String str;
	public MyRunnable(String s){
		this.str=s;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(this.str);
	}

}
public class A4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] course = {"Java", "J2EE", "Spring"};
		for(String obj : course) {
			MyRunnable r1=new MyRunnable("Thread 1 : "+obj);
			Thread t1=new Thread(r1);
			t1.start();
			MyRunnable r2=new MyRunnable("Thread 2 : "+obj);
			Thread t2=new Thread(r2);
			t2.start();
			MyRunnable r3=new MyRunnable("Thread 3 : "+obj);
			Thread t3=new Thread(r3);
			t3.start();
		}

	}

}
