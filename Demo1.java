package Harshipack;

public class Demo1 extends Demo{
	
	public void strbuilder() {
		
		StringBuilder sb = new StringBuilder("Hello");
		
		System.out.println("Initial "+sb);
		sb.append("Java");
		System.out.println("After append "+ sb);
		sb.insert(5, " ");
		System.out.println("After Insert "+sb);
		sb.reverse();
		System.out.println("After reverse "+sb);
	}
	public static void main(String args[]) {
		
		Demo1 obj1 = new Demo1();
		obj1.strbuilder();
		obj1.arraysmethod();
		
	}

}
