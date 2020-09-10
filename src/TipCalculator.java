
public class TipCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double checkAmount = Double.parseDouble(args[0]);
		double tipPercent = Double.parseDouble(args[1]);
		double tip = checkAmount * (tipPercent/100);
		System.out.println("The check amount is $" + checkAmount);
		System.out.println("The tip percentage is " + tipPercent + "%");
		System.out.println("The tip amount is $" + tip);
		System.out.println("The total amount is $" + (tip + checkAmount));
	}

}
