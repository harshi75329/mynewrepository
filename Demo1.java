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
	
	public void operators() {
		
		int a = 15, b = 10;
		//Arithmatic operators
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));
        
        // Relational Operators
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        // Bitwise Operators
        System.out.println("a & b: " + (a & b));
        System.out.println("a | b: " + (a | b));
        System.out.println("a ^ b: " + (a ^ b));

        // Assignment Operators
        int c = 10;
        c += 5; // Same as c = c + 5
        System.out.println("c += 5: " + c);

        // Unary Operators
        System.out.println("++a: " + (++a)); // Pre-increment
        System.out.println("b--: " + (b--)); // Post-decrement

        // Ternary Operator
        int min = (a < b) ? a : b;
        System.out.println("Smaller number: " + min);
	}
	
	public void cfstatements() {
		
		int num = 10;

        // If-Else Statement
        if (num > 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Negative number");
        }

        // Switch Case Statement
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Other day");
        }

        // For Loop
        System.out.println("For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // While Loop
        System.out.println("While Loop:");
        int count = 1;
        while (count <= 5) {
            System.out.print(count + " ");
            count++;
        }
        System.out.println();

        // Do-While Loop
        System.out.println("Do-While Loop:");
        int x = 1;
        do {
            System.out.print(x + " ");
            x++;
        } while (x <= 5);
        System.out.println();

        // Break and Continue
        System.out.println("Break and Continue:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Break at " + i);
                break; // Exits the loop when i == 3
            }
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Continue at " + i);
                continue; // Skips the current iteration when i == 3
            }
            System.out.print(i + " ");
        }
	}
	public static void main(String args[]) {
		
		Demo1 obj1 = new Demo1();
		obj1.strbuilder();
		obj1.arraysmethod();
		obj1.strmethod();
		obj1.operators();
		obj1.cfstatements();
		
	}

}
