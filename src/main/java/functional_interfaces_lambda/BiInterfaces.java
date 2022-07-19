package functional_interfaces_lambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class BiInterfaces {
	public static void main(String[] args) {
		BiConsumer<Integer, Integer> biConsumer = (num1, num2) -> System.out.println("Sum = " + (num1 + num2));
		biConsumer.accept(500, 300);

		BiFunction<String, String, String> biFunction = (fname, lname) -> fname + lname;

		System.out.println(biFunction.apply("Vignesh", "Manoharan"));
	}
}
