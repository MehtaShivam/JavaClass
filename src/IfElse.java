import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your age: ");
		
		int age =  keyboard.nextInt();
		
		if (age < 20) {
			System.out.println("Young");
		}else if (age > 30) {
			System.out.println("Old");
		}else {
			System.out.println("Prime Time");
		}
		
	}		

}
