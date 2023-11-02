package w2Assignment4;
class AssignThread extends Thread{
	public AssignThread() {
		this.start();
		
	}
	@Override
	public void run() {
		System.out.println("calling Run command");
	}
	
}
public class A3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		AssignThread t1=new AssignThread();
		System.out.println("t1 : "+t1.isAlive());

		t1.join();
		AssignThread t2=new AssignThread();
		System.out.println("t1 : "+t1.isAlive());
		System.out.println("t2 : "+t2.isAlive());
	}

}
