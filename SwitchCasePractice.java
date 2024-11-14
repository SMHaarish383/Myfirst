package hello_java;
import java.util.Scanner;
class CustomException extends Exception{
	CustomException(String name){
		super(name);
	}
}
//this is the SwitchCase program in my idea I used try catch block here
public class SwitchCasePractice {
	//@SuppressWarnings("resource")
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the day number : ");
		try {
			int Day=sc.nextInt();
			if (Day>7) {
				throw new CustomException("A week has only 7 days, Enter the valid day number");
			}
		switch(Day) {
			case 1:
				System.out.println("Sunday");
				break;
			case 2:
				System.out.println("Monday");
				break;
			case 3:
				System.out.println("Tuesday");
				break;
			case 4:
				System.out.println("Wednesday");
				break;
			case 5:
				System.out.println("Thursday");
				break;
			case 6:
				System.out.println("Friday");
				break;
			case 7:
				System.out.println("Saturday");
		}
		sc.close();
	}catch(CustomException e) {
		System.out.println(e.getMessage());
	}
		
	}

}
