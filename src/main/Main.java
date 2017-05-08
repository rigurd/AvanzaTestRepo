package main;

import java.util.ArrayList;
import java.util.Random;
import classes.Dubletter;
import classes.FizzBuzz;

public class Main {

	public static void main(String[] args) {
		
		// 1a + 1b
		FizzBuzz.fizzBuzz();
		System.out.println("_______________\n");
		
		// 2
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		for (int i = 0; i<10; i++){
			Random random = new Random();
			int randomGeneratedNumber = random.nextInt(10);
			numbers.add(randomGeneratedNumber);
		}
		System.out.println("Numbers going in to method: " + numbers);
		System.out.println("Duplicated numbers found in list after method: " + Dubletter.multiples(numbers));
		
	}

}
