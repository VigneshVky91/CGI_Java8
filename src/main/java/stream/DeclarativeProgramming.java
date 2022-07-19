package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DeclarativeProgramming {

	public static void main(String[] args) {
		List<String> originalList = Arrays.asList("Vijay", "Arun", "Karan", "Ashish Kumar", "John", "John", "Karan");
//		Predicate<String> predicate = name -> name.length() > 4;
//		Consumer<String> consumer = name -> System.out.println(name);

		originalList.stream().filter(name -> name.length() > 4).forEach(System.out::println);
		Set<String> set = originalList.stream().filter(name -> name.length() > 4).collect(Collectors.toSet());

		System.out.println(set);

		List<Student> studentList = Arrays.asList(new Student(12, "Shakthi", 100), new Student(14, "Vikram", 98),
				new Student(17, "Abel", 78), new Student(13, "Adam", 38), new Student(11, "Rajesh", 75),
				new Student(18, "Rajesh Kumar", 85));

		// Printing the student details who have got more than or equal to 80
		studentList.stream().filter(s -> s.getMarks() >= 80).forEach(System.out::println);
		List<Student> newList = studentList.stream().filter(s -> s.getMarks() >= 80).collect(Collectors.toList());

		System.out.println("New List after condition:");
		System.out.println(newList);

		Set<Student> newSet = studentList.stream().filter(e -> e.getMarks() < 80).collect(Collectors.toSet());

		System.out.println("New set after condition:");
		System.out.println(newSet);

		List<Student> updatedStudentList = studentList.stream().filter(s -> s.getMarks() < 80).map(s -> {
			s.setMarks(s.getMarks() + 5);
			return s;
		}).collect(Collectors.toList());

		System.out.println("Student details after grace marks: ");
		System.out.println(updatedStudentList);

		System.out.println("No of people who have got more than 80");
		System.out.println(studentList.stream().filter(e -> e.getMarks() < 80).count());

		List<Student> naturalSortedList = studentList.stream().sorted().collect(Collectors.toList());

		System.out.println("Sorted as per natural ordering:");
		naturalSortedList.forEach(System.out::println);

		System.out.println("\nSorted as per natural ordering:");
		List<Student> listSortedBasedOnMarks = studentList.stream().sorted((o1, o2) -> o2.getMarks() - o1.getMarks())
				.collect(Collectors.toList());

		listSortedBasedOnMarks.forEach(System.out::println);

		System.out.println("\nSorted based on name length: ");
		studentList.stream().sorted((o1, o2) -> o1.getStudentName().length() - o2.getStudentName().length())
				.forEach(System.out::println);

		System.out.println("\nDetails of student who have got least score: ");
		Student studWithLeastScore = studentList.stream().sorted((s1, s2) -> s1.getMarks() - s2.getMarks())
				.collect(Collectors.toList()).get(0);

		System.out.println(studWithLeastScore);

		System.out.println("\nDetails of student who have got max score: ");
		Student studWithMaxScore = studentList.stream().sorted((s1, s2) -> s2.getMarks() - s1.getMarks())
				.collect(Collectors.toList()).get(0);

		System.out.println(studWithMaxScore);

		Student minStudent = studentList.stream().min((o1, o2) -> o1.getMarks() - o2.getMarks()).get();
		Student maxStudent = studentList.stream().max((o1, o2) -> o1.getMarks() - o2.getMarks()).get();

		Set<Student> studentSet = studentList.stream().collect(Collectors.toSet());
		Student[] studentArray = studentList.stream().toArray(Student[]::new);

		System.out.println("***" + studentArray[0]);

		Integer[] numsArr = { 51, 78, 95, 79, 26, 24, 38 };
		List<Integer> numsList = Stream.of(numsArr).collect(Collectors.toList());
	}
}
