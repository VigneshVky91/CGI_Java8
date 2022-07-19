package builtin_functional_interfaces;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MainClass {

	public static void main(String[] args) {

//	Predicate example

		Predicate<Integer> predicate = age -> age >= 18;

		Integer[] agesArray = { 51, 8, 17, 95, 26, 35, 78 };

		for (int i = 0; i < agesArray.length; i++)
			if (predicate.test(agesArray[i]))
				System.out.println("You can vote");
			else
				System.out.println("NE");

// Function example

		Function<String, Integer> function = name -> name.length();

		String name = "Vignesh";

		System.out.println(function.apply(name));
//	Function can be converted into other functional interfaces
//		Function<Integer, Boolean> functionPredicate = (age)-> age>=18;

//	Supplier example
//
//		Supplier<Integer> supplier = () -> (int) (Math.random() * 1000);
//
//		for (int i = 0; i < 1000; i++)
//			System.out.println(supplier.get());

// Consumer example
//		Consumer<Integer> consumer = (num) -> {
//			num++;
//			System.out.println("Number received : " + num);
//		};
//
//		consumer.accept(100);

		Supplier<Integer> supplier = () -> {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			int numProduced = (int) (Math.random() * 1000);
			System.out.println("Number supplied: " + numProduced);
			return numProduced;
		};

		Consumer<Integer> consumer = num -> {
			System.out.println("Number received: " + num);
		};
		while (true)
			consumer.accept(supplier.get());
	}
}
