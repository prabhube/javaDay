package org.one;

public class ChildClass extends Inheritance {
	public void parentClass() {
		System.out.println("parent class");
	}
	public static void main(String[] args) {
		ChildClass d=new ChildClass();
				d.methodTwo();
				d.methodThree();
				d.parentClass();
				System.out.println(d.a);
	}
}
