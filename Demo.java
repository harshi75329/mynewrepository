package Harshipack;
import java.util.*;

public class Demo {
	
	public void datatypes() {
		
		int a = 5;
		float f = 3.14f;
        double d = 3.141592653589793; 
        char ch = 'A';
        boolean bl = true;
        String s = "Hello Java";
        
        System.out.println("This is Integer "+a);
        System.out.println("This is float "+f);
        System.out.println("This is double "+d);
        System.out.println("This is char "+ch);
        System.out.println("This is boolean "+bl);
        System.out.println("This is string "+s);
        
	}
	
	public void arraysmethod() {
		
		int arr[] = {1,2,3,4,5};
		
		System.out.println("array elements");
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		Demo obj = new Demo();
		obj.datatypes();
		obj.arraysmethod();
	}

}
