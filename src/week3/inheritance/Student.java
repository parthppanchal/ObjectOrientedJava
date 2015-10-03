package week3.inheritance;

public class Student extends Person{
	public Student() {
		this("Student");
		System.out.print("#2 ");
	}
	public Student(String n) {
		super(n);
		System.out.print("#3 ");
	}
	
	public static void main(String[] arg) {
		Student s = new Student();
	}
}
