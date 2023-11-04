package w2Assignment4;
class MyRunnable implements Runnable{
	private String str;
	private String[] c;

	public MyRunnable(String s,String[] course){
		
		this.str=s;
		this.c=course;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(String obj : this.c) {
			System.out.println(this.str+obj);
		}
		
	}

}
public class A4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] course = {"Java", "J2EE", "Spring"};

		MyRunnable r1=new MyRunnable("Thread 1 : ", course);
		Thread t1=new Thread(r1);
		MyRunnable r2=new MyRunnable("Thread 2 : ", course);
		Thread t2=new Thread(r2);
		MyRunnable r3=new MyRunnable("Thread 3 : ", course);
		Thread t3=new Thread(r3);
		t1.start();
		t2.start();
		t3.start();
	}

}
