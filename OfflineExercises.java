package code;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class OfflineExercises {

	// Given a string, return a string where
	// for every char in the original,
	// there are two chars.

	// doubleChar("The") → "TThhee"
	// doubleChar("AAbb") → "AAAAbbbb"
	// doubleChar("Hi-There") → "HHii--TThheerree"

	public String doubleChar(String word) {
		int inLength = word.length();

		String doubleWord = "";

		for (int i = 0; i < inLength; i++) {
			doubleWord = doubleWord + word.charAt(i) + word.charAt(i);
		}

		return doubleWord;
	}

	//
	// A sandwich is two pieces of bread with something in between. Return the
	// string that is between the first and last appearance of "bread" in the
	// given string, or return the empty string "" if there are not two pieces
	// of bread.

	// getSandwich("breadjambread") → "jam"
	// getSandwich("xxbreadjambreadyy") → "jam"
	// getSandwich("xxbreadyy") → ""

	public String getSandwich(String breadSandwhich) {

		breadSandwhich = "a" + breadSandwhich + "a";// This ensures that if there is bread, the split will give more
													// than 1 string.
		String[] splitInput = breadSandwhich.split("bread");
		String sandwhich = "";

		if (splitInput.length == 1 || splitInput.length == 2) {
			sandwhich = "";
		} else {
			sandwhich = splitInput[1];
		}

		return sandwhich;
	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large.

	// evenlySpaced(2, 4, 6) → true
	// evenlySpaced(4, 6, 2) → true
	// evenlySpaced(4, 6, 3) → false

	public boolean evenlySpaced(int a, int b, int c) {

		Integer newA = (Integer) a;
		Integer newB = (Integer) b;
		Integer newC = (Integer) c;

		ArrayList<Integer> numberList = new ArrayList<>();
		numberList.add(newA);
		numberList.add(newB);
		numberList.add(newC);
		Collections.sort(numberList);

		if (numberList.get(1) - numberList.get(0) == numberList.get(2) - numberList.get(1)) {

			System.out.println("sduihuihip");
			return true;
		} else {
			return false;
		}

		//

	}

	// Given a string and an int n, return a string made of the first and last n
	// chars from the string. The string length will be at least n.

	// nTwice("Hello", 2) → "Helo"
	// nTwice("Chocolate", 3) → "Choate"
	// nTwice("Chocolate", 1) → "Ce"

	public String nTwice(String word, int a) {
		// Get first a chars.
		String ans = "";

		for (int i = 0; i < a; i++) {
			ans = ans + word.charAt(i);
		}

		// Get last 2 letters.

		for (int i = word.length() - a; i < word.length(); i++) {
			ans = ans + word.charAt(i);
		}

		return ans;
	}

	// Given a string, return true if it ends in "ly".

	// endsLy("oddly") → true
	// endsLy("y") → false
	// endsLy("oddy") → false

	public boolean endsly(String word) {
		String fakeWord = word;
		String[] fakeSplitWord = fakeWord.split("ly");
		word = word + "a";
		String[] splitWord = word.split("ly");

		int length = splitWord.length;
		int fakeLength = fakeSplitWord.length;

		if (length > fakeLength) {
			System.out.println("jnds");
			return true;
		}

		else {
			return false;
		}

	}

	// Given a string, return recursively a "cleaned" string where adjacent
	// chars that are the same have been reduced to a single char. So "yyzzza"
	// yields "yza".

	// stringClean("yyzzza") → "yza"
	// stringClean("abbbcdd") → "abcd"
	// stringClean("Hello") → "Helo"
	public String stringClean(String input) {

		String ans = "";

		int i = 1;

		ans = ans + input.charAt(0);

		while (i < input.length()) {
			if (input.charAt(i) == input.charAt(i - 1)) {
				i++;
			} else {
				ans = ans + input.charAt(i);
				i++;
			}

		}

		return ans;
	}

	// The fibonacci sequence is a famous bit of mathematics, and it happens to
	// have a recursive definition. The first two values in the sequence are 0
	// and 1 (essentially 2 base cases). Each subsequent value is the sum of the
	// previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13,
	// 21 and so on. Define a recursive fibonacci(n) method that returns the nth
	// fibonacci number, with n=0 representing the start of the sequence.

	// fibonacci(0) → 0
	// fibonacci(1) → 1
	// fibonacci(2) → 1

	public int fibonacci(int input) {

		if (input == 0) {
			return 0;
		}

		else if (input == 1) {
			return 1;
		} else if (input == 2) {
			return 1;
		} else {
			return fibonacci(input - 1) + fibonacci(input - 2);
		}

	}

	// We have a number of bunnies and each bunny has two big floppy ears. We
	// want to compute the total number of ears across all the bunnies
	// recursively (without loops or multiplication).
	//
	// bunnyEars(0) → 0
	// bunnyEars(1) → 2
	// bunnyEars(2) → 4

	public int bunnyEars(int input) {

		if (input == 0) {
			return 0;
		} else if (input == 1) {
			return 2;
		} else {
			return bunnyEars(input - 1) + 2;
		}
	}

}
