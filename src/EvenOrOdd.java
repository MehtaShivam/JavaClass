import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		//int input = Integer.parseInt(keyboard.nextLine());
		int input = keyboard.nextInt();
		
		String s = (input % 2 == 0) ? "Even" : "Odd";
		System.out.println(s);
	}

}
