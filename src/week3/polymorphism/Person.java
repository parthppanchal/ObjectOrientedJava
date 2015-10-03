package week3.polymorphism;

public class Person {
	private String name;
	
	public Person(String n) {
		super();
		this.name = n;
	}
	
	public boolean isAsleep(int hr) {
		return 22 < hr || 7 > hr;
	}
	
	public String toString() {
		return name;
	}
	
	public void status(int hr) {
		if(this.isAsleep(hr)) {
			System.out.println("Now offline: " + this);
		} else {
			System.out.println("Now online: " + this);
		}
	}
	
	public void method1() {
		System.out.print("Person 1 ");
	}
	
	public void method2() {
		System.out.print("Person 2 ");
	}
}
