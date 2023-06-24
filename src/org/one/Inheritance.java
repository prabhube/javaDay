package org.one;

public class Inheritance 
{
	int a=21;
	public void parentClass() {
		int a=112;
		System.out.println("Public");
	}
	private void methodOne() {
		System.out.println("private");
	}
	protected void methodTwo() {
		System.out.println("protected");
	}
	 void methodThree() {
		System.out.println("default");
	}
	public static void main(String[] args) {
		Inheritance s=new Inheritance();
		s.parentClass();
		s.methodOne();
		s.methodTwo();
		s.methodThree();
		System.out.println(s.a);
	}
}
