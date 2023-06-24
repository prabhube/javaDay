package data.one;

public class ConstructorOne {
	public ConstructorOne() {
		System.out.println("default");
	
	}
	public ConstructorOne(int id) {
		this("prabhu");
		System.out.println(id);
	}
	
	public ConstructorOne(String a) {
		this();
		System.out.println(a);
	}
	public static void main(String[] args) {
		ConstructorOne s=new ConstructorOne(200);
		
	}
}
