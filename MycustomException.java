package hello_java;
import java.util.Scanner;

class MyCustomException extends Exception {
	MyCustomException(String a) {
		super(a);
	}
}
public class CustomException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = 0;
		while (true) {
			try {
				System.out.print("Enter your age: ");
				age = sc.nextInt();
				if (age < 18) {
					throw new MyCustomException("You can't vote, age should be above 18,"+"/n"+" Next person");
				} else {
					System.out.println("You can vote!");
					break;  
				}
			} catch (MyCustomException e) {
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println("An error occurred: " + e);
				break;
			}
		}
		sc.close();
		System.out.println("Program ended");
	}
}
