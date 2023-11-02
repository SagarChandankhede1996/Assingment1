package w2Assignment4;
class Numbers extends Thread {
	public void run() {
		for(int i=1;i<=10; i++) {
			System.out.print(i+" ");
		}
	}
}
class Alphabates extends Thread{
	public void run() {
		for(char al='a';al<='z'; al++) {
			System.out.print(al+" ");
		}
	}
}
public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numbers t1=new Numbers();
		
		Alphabates t2 = new Alphabates();
		t1.start();
		t2.start();
	}

}
