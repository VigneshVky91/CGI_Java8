package stream;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ImperativeProgramming {

	public static void main(String[] args) {
		List<String> originalList = Arrays.asList("Vijay", "Arun", "Karan", "Ashish Kumar", "John");
		List<String> newArray = new LinkedList<String>();
		
		for(String name: originalList) {
			if(name.length()>4) {
				newArray.add(name);
			}
		}
		
		for(String name: newArray) {
			System.out.println(name);
		}
	}
}
