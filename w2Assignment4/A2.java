package w2Assignment4;
class EvenNum extends Thread{

	@Override
	public void run() {
		for(int i=2; i<=20;i+=2) {
			System.out.print(i+" ");
		}
	}
}
class OddNum extends Thread{

	@Override
	public void run() {
		for(int i=1; i<=20;i+=2) {
			System.out.print(i+" ");
		}
	}
}
public class A2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		EvenNum t1=new EvenNum();
		t1.start();
		t1.join();
		OddNum t2=new OddNum();
		t2.start();
		
	}

}
