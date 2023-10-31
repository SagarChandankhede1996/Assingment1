package w2Assingment2;
class Staff {
	private int codeName;
	public Staff(int cn) {
		this.codeName=cn;
	}
	public int getCodeName() {
		return codeName;
	}
	public void setCodeName(int codeName) {
		this.codeName = codeName;
	}
	public String toString() {
		return String.format("Code name:-%d", this.codeName);
		}
	
}

class Teacher extends Staff {
	private String subject;
	public Teacher (int cn, String sub) {
		super(cn);
		this.subject=sub;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String toString() {
		return String.format("Code name:-%d & Speed:-%s", this.getCodeName(), this.subject);
	}
}

class Officer extends Staff {
	private String grade;
	public Officer(int cn, String grd) {
		super(cn);
		this.grade=grd;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String toString() {
		return String.format("Code name:-%d & Speed:-%s", this.getCodeName(), this.grade);
	}
}

class Typist extends Staff {
	private int speed;
	public Typist(int cn, int spd) {
		super(cn);
		this.speed=spd;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String toString() {
		return String.format("Code name:-%d & Speed:-%d", this.getCodeName(), this.speed);
	}
}

class Regular extends Typist {
	private int salary;
	public Regular (int cn, int spd, int sal) { 
		super(cn, spd);
		this.salary=sal;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String toString() {
		return String.format("Code name:-%d & Speed:-%d & salary:-%d ", this.getCodeName(), this.getSpeed(), this.salary);
	}
}

class Casual extends Typist {
	private int dailyWages;
	public Casual (int cn, int spd, int dw) {
		super(cn, spd);
		this.dailyWages=dw;
	}
	public int getDailyWages() {
		return dailyWages;
	}
	public void setDailyWages(int dailyWages) {
		this.dailyWages = dailyWages;
	}
	public String toString() {
		return String.format("Code name:-%d & Speed:-%d & dailywages:-%d ", this.getCodeName(), this.getSpeed(), this.dailyWages);
	}
}
public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Casual c1=new Casual(10, 200, 300);
		
		System.out.println(c1.getCodeName());
		
		Teacher t1=new Teacher(1231, "Maths");
	
		System.out.println(t1.getCodeName()+", "+t1.getSubject());
		
		Regular r=new Regular(15, 30, 40000);
		System.out.println(r);
		System.out.println(t1);
		System.out.println(c1);
		Officer o=new Officer(13, "A+");
		System.out.println(o);
		
	}

}
