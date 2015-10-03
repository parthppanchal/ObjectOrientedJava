package week3.polymorphism;

public class Student extends Person{
	public Student(String name) {
		super(name);
	}
	
	public boolean isAsleep(int hr) {	// override
		return 2 < hr && 8 > hr;
	}
	
	public static void main(String[] args) {
		Person p;
		p = new Student("Sally");
		p.status(1);
	}
	
	public void method1() {
		System.out.print("Student 1 ");
		super.method1();
		method2();
	}
	
	public void method2() {
		System.out.print("Student 2 ");
	}
}
