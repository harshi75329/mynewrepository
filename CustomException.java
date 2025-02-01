package Harshipack;

import java.util.*;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String message) {
		super(message);
	}
}
class CustomException{
	
	public void Validation() throws InvalidAgeException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Age entha ?");
		int age=sc.nextInt();
		if(age>=18) {
			System.out.print("go for vote");
		}
		else {
			throw new InvalidAgeException("Pilla bacha pakkakellu");
		}
	}
	public static void main(String args[]) {
		CustomException obj = new CustomException();
		try {
			obj.Validation();
			
		}
		catch(InvalidAgeException ie) {
			System.out.println(ie.getMessage());
		}
	}
}
