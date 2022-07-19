package methodreferencing;

public class UtilityClass {

	public UtilityClass() {
		System.out.println("I am a default constructor and I can be reused as well!");
	}

	public static Boolean validateName(String name) {
		return name.length() > 4;
	}

	public void printDetails(String name) {
		System.out.println("Welome : " + name);
	}
}
