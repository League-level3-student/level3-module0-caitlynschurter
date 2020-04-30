package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	// 1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String strings[] = { "red", "orange", "yellow", "green", "blue", "purple" };
		stepTwo(strings);
		stepThree(strings);
		stepFour(strings);
		stepFive(strings);
	}

	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.
	static void stepTwo(String strings[]) {

		for (int i = 0; i < strings.length; i++) {
			System.out.print(strings[i] + ", ");
		}
		System.out.println();
	}

	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.
	static void stepThree(String strings[]) {
		for (int i = strings.length - 1; i >= 0; i--) {
			System.out.print(strings[i] + ", ");
		}
		System.out.println();
	}
	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.

	static void stepFour(String strings[]) {
		for (int i = 0; i < strings.length; i += 2) {
			System.out.print(strings[i] + ", ");
		}
		System.out.println();
	}

	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in a completely random order. Almost every run of the program should result
	// in a different order.
	static void stepFive(String strings[]) {
		Random rand = new Random();
		for (int i = 0; i < strings.length; i++) {
			int j = rand.nextInt(strings.length);
			String temp = strings[i];
			strings[i] = strings[j];
			strings[j] = temp;
			//System.out.println(strings[i]);
		}
		stepTwo(strings);

	}
}
