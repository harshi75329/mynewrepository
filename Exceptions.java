package Harshipack;
public class Exceptions {
	
	public void Example1() {
		
		int arr[]= {1,2,3,4,5,6,7,8};
		try {
			
			System.out.println("Index at 9 "+ arr[9]);
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println(ae.getMessage());
			
		}
		finally {
			
			System.out.println("Remaining code...");
		}
	}
	
	public void Example2() {
		
		String s = null;
		
		try {
			
			System.out.println("String Length is "+ s.length());
			
		}
		catch(NullPointerException ne) {
			System.out.println("NullPointer Exception in String"+ne.getMessage());
		}
		String arr[] = null;
		try {
			System.out.println("Length is "+arr.length);
			
		}
		catch(NullPointerException ne){
			System.out.println("NullPointer Exception in array"+ne.getMessage());
		}
		finally {
			System.out.println("Remaining code...");
		}
	}

	public static void main(String args[]) {
		
		Exceptions obj = new Exceptions();
		obj.Example1();
		obj.Example2();
	}
}
