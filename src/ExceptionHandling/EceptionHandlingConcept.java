package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EceptionHandlingConcept {
	public static void main(String[] args) {
		/*
		 * Points to remember:
		 * 
		 * In a method, there can be more than one statement that might throw an
		 * exception, So put all these statements within their own try block and provide
		 * a separate exception handler within their own catch block for each of them.
		 * 
		 * 
		 * If an exception occurs within the try block, that exception is handled by the
		 * exception handler associated with it. To associate exception handler, we must
		 * put a catch block after it. There can be more than one exception handlers.
		 * Each catch block is a exception handler that handles the exception of the
		 * type indicated by its argument. The argument, ExceptionType declares the type
		 * of exception that it can handle and must be the name of the class that
		 * inherits from the Throwable class.
		 * 
		 * For each try block there can be zero or more catch blocks, but only one final
		 * block.
		 * 
		 * The finally block is optional.It always gets executed whether an exception
		 * occurred in try block or not. If an exception occurs, then it will be
		 * executed after try and catch blocks. And if an exception does not occur then
		 * it will be executed after the try block. The finally block in java is used to
		 * put important codes such as clean up code e.g. closing the file or closing
		 * the connection.
		 * 
		 * Checked Exception cannot be propagated using throw only. You have to use try
		 * catch block to handle this. But Unchecked exception can be propagated using
		 * throw only.
		 * 
		 * Finally Block gets executed even when there is a Return statement in try or
		 * catch block. 
		 */
	}

}

/*
 * Custom Exception
 */

class Vote extends Exception {
	public Vote(String str) {
		super(str);
	}
}

class Custom {
	public void vote(int x) {
		if (x > 18) {
			System.out.println("You are eligible to vote");
		} else {
			try {
				Vote obj = new Vote("Age should be more than 18");
				throw obj;
			} catch (Exception e) {
				System.out.println(e);
			}

		}
	}

	public static void main(String[] args) {
		Custom obj = new Custom();
		obj.vote(5);
		obj.vote(30);
	}

}

/*
 * Summary = Finally block will execute if UNCHECKED exception is not handled by
 * catch block and the code terminates.
 * 
 * But in case of checked exception, You have to handle the checked exception,
 * otherwise it will give compilation error. To run hoga hi nahi toh finally
 * block bhi execute nai hoga
 */

class GFG {
	public static void main(String[] args) {
		int[] arr = new int[4];
		try {
			int i = arr[4];

			// this statement will never execute
			// as exception is raised by above statement
			System.out.println("Inside try block");
		}

		// not a appropriate handler
		catch (NullPointerException ex) {
			System.out.println("Exception has been caught");
		}

		finally {
			System.out.println("finally block executed");
		}

		// rest program will not execute
		System.out.println("Outside try-catch-finally clause");
	}
}

//class Practice1 {
//	public static void main(String[] args) {
//		try {
//			FileWriter fr = new FileWriter("Home");
//		} 
//		catch (ClassNotFoundException ex) {
//			System.out.println("Exception has been caught");
//		}
//		finally {
//			System.out.println("Finally");
//		}
//		
//		
//	}
//}

class Practice2 {
	public static void main(String[] args) {

//		int a = 5/0;
//		ArithmeticException aa = new ArithmeticException("Hello");
//		throw aa;

//		FileWriter fr = new FileWriter("Home");
//		IOException io = new IOException("Hello");
//		throw io;

	}

}
