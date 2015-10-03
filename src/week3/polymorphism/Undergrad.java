package week3.polymorphism;

public class Undergrad extends Student {
	public Undergrad(String name) {
		super(name);
	}
	
	public void method2() {
		System.out.print("Undergrad 2 ");
	}
	
	public static void main(String[] args) {
		Person u = new Undergrad("Sally");
		u.method1();
	}
}
