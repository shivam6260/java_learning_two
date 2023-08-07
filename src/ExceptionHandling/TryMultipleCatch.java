package ExceptionHandling;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryMultipleCatch {
	public static void main(String[] args) {
		/*
		 * Points to remember
		 * 
		 * At a time only one exception occurs and at a time only one catch block is
		 * executed.
		 * 
		 * All catch blocks must be ordered from most specific to most general, i.e.
		 * catch for ArithmeticException must come before catch for Exception.( Sabse
		 * uper child phir parent).
		 * 
		 * Rule: For each try block there can be zero or more catch blocks, but only one
		 * finally block.
		 * 
		 * Note: The finally block will not be executed if the program exits (either by
		 * calling System.exit() or by causing a fatal error that causes the process to
		 * abort).
		 * 
		 * 
		 */

	}

}

class Practice1 {
	public static void main(String[] args) {
		try {
			int[] arr = new int[4];
			arr[10] = 10 / 0;
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}
}

/*
 * In this example, we generate NullPointerException, but didn't provide the
 * corresponding exception type. In such case, the catch block containing the
 * parent exception class Exception will invoked.
 */

class Practice3 {

	public static void main(String[] args) {

		try {
			String s = null;
			System.out.println(s.length());
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
		} catch (Exception e) {
			System.out.println("Parent Exception occurs");
		}
		System.out.println("rest of the code");
	}
}

/*
 * In this example, we are giving Exception from Parent to Child It gives
 * compile time error
 */

class MultipleCatchBlock5 {
	public static void main(String args[]) {
		try {
			int a[] = new int[5];
			a[5] = 30 / 0;
		} catch (Exception e) {
			System.out.println("common task completed");
		}

//		catch (ArithmeticException e) {
//			System.out.println("task1 is completed");
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("task 2 completed");
//		}
		System.out.println("rest of the code...");
	}
}

//A Java program to demonstrate
//multicatch feature

class Test {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		try {
			int n = Integer.parseInt(scn.nextLine());
			if (99 % n == 0)
				System.out.println(n + " is a factor of 99");
		} catch (NumberFormatException | ArithmeticException ex) {
			System.out.println("Exception encountered " + ex);
		}
	}
}
