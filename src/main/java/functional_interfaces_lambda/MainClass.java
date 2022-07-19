package functional_interfaces_lambda;

public class MainClass {

	public static void main(String[] args) {
		MyFunctionalInterface myFunctionalInterface = (num1, num2) -> {
			return num1 + num2;
		};

		System.out.println(myFunctionalInterface.add(10, 5));
	}
}
