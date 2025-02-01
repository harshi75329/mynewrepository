package Harshipack;

import java.util.*;

class HeavyWorkException extends Exception{
	public HeavyWorkException(String message) {
		super(message);
	}
}
class CustomException{
	int task=0;
	public void Dowork() throws HeavyWorkException {
		task++;
		System.out.println("Task "+task+" Completed");
		if(task>=3) {
			throw new HeavyWorkException("Too Much Work!!!");
		}
	}
	public static void main(String args[]) {
		CustomException person = new CustomException();
		try {
			person.Dowork();
			person.Dowork();
			person.Dowork();
			person.Dowork();
			person.Dowork();
			
		}
		catch(HeavyWorkException he) {
			System.out.println(he.getMessage());
		}
	}
}
