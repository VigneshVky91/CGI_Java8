package methodreferencing;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MainClass {
	public static void main(String[] args) {
//		Predicate<String> predicate = (name) -> name.length() > 4;
		Predicate<String> predicate = UtilityClass::validateName;
		System.out.println(predicate.test("Vignesh"));

//		Consumer<String> consumer = (name) -> System.out.println("Welcome : " + name);
		Consumer<String> consumer = new UtilityClass()::printDetails;
		consumer.accept("Sathya");

//		Supplier<UtilityClass> supplier = () -> new UtilityClass();
		Supplier<UtilityClass> supplier = UtilityClass::new;
		supplier.get();

	}
}
