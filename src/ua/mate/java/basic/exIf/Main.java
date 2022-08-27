package ua.mate.java.basic.exIf;


public class Main {

	public static void main(String[] args) {
		System.out.println(getResult(2,-5));
	}

	public static double getResult(double a, double b) {
		//Write code below this line
		double sum = a + b;
		double subtr = a - b;
		double mult = a * b;
		double divide = a / b;
		if (sum >= subtr && sum >= mult && sum >= divide) {
			return sum;
		} else if (subtr >= mult && subtr >= divide && subtr >= sum) {
			return subtr;
		} else if (mult >= divide && mult >= sum && mult >= subtr) {
			return mult;
		}
		return divide;
		//Write code above this line
	}
}
