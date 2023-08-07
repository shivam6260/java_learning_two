package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

public class TryCatchFinallyFlow {
	public static void main(String[] args) {
		/*
		 * Checked Exception mai Exception ko handle karna hi padega, bhale exception
		 * occur ho ya nahi ho nahi toh, compilation error ayega.
		 * 
		 * 2 - try without catch block is only applicable for unchecked exception not
		 * for checked and User defined Checked Exception.
		 */
	}
}

/*
 * 1. Exception occurs in try block and handled in catch block:
 * 
 * If a statement in try block raised an exception, then the rest of the try
 * block doesn’t execute and control passes to the corresponding catch block.
 * After executing the catch block, the control will be transferred to finally
 * block(if present) and then the rest program will be executed.
 */
class GFG1 {
	public static void main(String[] args) {
		int[] arr = new int[4];
		try {
			int i = arr[4];
			System.out.println("Inside try block");
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Exception caught in Catch block");
		}
		System.out.println("Outside try-catch clause");
	}
}

// Try - catch Finally
class GFG2 {
	public static void main(String[] args) {
		int[] arr = new int[4];
		try {
			int i = arr[4];
			System.out.println("Inside try block");
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Exception caught in catch block");
		} finally {
			System.out.println("finally block executed");
		}
		System.out.println("Outside try-catch-finally clause");
	}
}

/*
 * 2. Exception occurred in try-block is not handled in catch block:
 * 
 * In this case, default handling mechanism is followed. If finally block is
 * present, it will be executed followed by default handling mechanism.
 */
// Un-Checked Exception.
class GFG3 {
	public static void main(String[] args) {
		int[] arr = new int[4];
		try {
			int i = arr[4];
			System.out.println("Inside try block");
		}
		// not a appropriate handler
		catch (NullPointerException ex) {
			System.out.println("Exception has been caught");
		}
		System.out.println("Outside try-catch clause");
	}
}

// Checked Exception
// Compilation Error. 
// For check exception you have to handle the exception otherwise compilation error occur
class GFG4 {
	public static void main(String[] args) {
//		try {
//			FileReader fr = new FileReader("C:Home");
//		} catch (SQLException e) {
//			System.out.println(e);
//		}
//		System.out.println("Outside tyr-catch GFG4");
	}
}

// TRY - CATCH - FINALLY
//Java program to demonstrate
//control flow of try-catch-finally clause
//when exception occur in try block
//but not handled in catch block
// Unchecked Eception
// FInally block Execute hoga or phir terminate ho jayega
class GFG5 {
	public static void main(String[] args) {
		int[] arr = new int[4];
		try {
			int i = arr[4];
			System.out.println("Inside try block");
		}
		// not a appropriate handler
		catch (NullPointerException ex) {
			System.out.println("Exception has been caught");
		} finally {
			System.out.println("finally block executed");
		}
		// rest program will not execute
		System.out.println("Outside try-catch-finally clause");
	}
}

//TRY - CATCH - FINALLY
//Java program to demonstrate
//control flow of try-catch-finally clause
//when exception occur in try block
//but not handled in catch block for
//Checked Eception

// Yaha Pai compilation Error aa gaya 
// toh finally block execute nahi hoga kyuki program run hi nai hua
class GFG6 {
	public static void main(String[] args) {
//		try {
//			FileReader fr = new FileReader("Home");
//			System.out.println("Inside try block");
//		}
//		// not a appropriate handler
//		catch (SQLException ex) {
//			System.out.println("Exception has been caught");
//		} finally {
//			System.out.println("finally block executed");
//		}
		// rest program will not execute
		System.out.println("Outside try-catch-finally clause");
	}
}

/*
 * 3. Exception doesn’t occur in try-block:
 * 
 * In this case catch block never runs as they are only meant to be run when an
 * exception occurs. finally block(if present) will be executed followed by rest
 * of the program.
 * 
 * For Checked Exception, whether exception occur or not in try block, you have
 * to provide proper catch block to avoid compilation error
 * 
 */

//Java program to demonstrate try-catch
//when an exception doesn't occurred in try block
// Unchecked Exception
class GFG7 {
	public static void main(String[] args) {
		try {
			String str = "123";
			int num = Integer.parseInt(str);
			// this statement will execute
			// as no any exception is raised by above statement
			System.out.println("Inside try block");
		}
		// Not a proper Exception Handler
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("catch block executed...");
		}
		System.out.println("Outside try-catch clause");
	}
}

//Java program to demonstrate try-catch-finally
//when exception doesn't occurred in try block
class GFG8 {
	public static void main(String[] args) {
		try {
			String str = "123";
			int num = Integer.parseInt(str);
			System.out.println("try block fully executed");
		} catch (NumberFormatException ex) {
			System.out.println("catch block executed...");
		} finally {
			System.out.println("finally block executed");
		}
		System.out.println("Outside try-catch-finally clause");
	}
}

/*
 * Control flow in try-finally
 * 
 * In this case, no matter whether an exception occur in try-block or not,
 * finally will always be executed. But control flow will depend on whether
 * exception has occurred in try block or not.
 * 
 * It is only for Unchecked Exception. For Checked exception, program will not
 * run, compilation error occur.
 */

/*
 * 1. Exception raised:
 * 
 * If an exception has occurred in try block then control flow will be finally
 * block followed by default exception handling mechanism.
 */

//Java program to demonstrate
//control flow of try-finally clause
//when exception occur in try block
class GFG9 {
	public static void main(String[] args) {
		int[] arr = new int[4];
		try {
			int i = arr[4];
			System.out.println("Inside try block");
		} finally {
			System.out.println("finally block executed");
		}
		// rest program will not execute
		System.out.println("Outside try-finally clause");
	}
}

// For Checked Exception
// Compilation Error ayega, Finally block Execute nahi hoga
class GFG10 {
	public static void main(String[] args) {
//		try
//		{
//			FileReader fr = new FileReader("Home//Shivam");
//			System.out.println("Inside try block");
//		}
//		finally
//		{
//			System.out.println("finally block executed");
//		}
		// rest program will not execute
		System.out.println("Outside try-finally clause");
	}
}

/*
 * 2. Exception not raised:
 * 
 * If an exception does not occur in try block then control flow will be finally
 * block followed by rest of the program
 */

//Java program to demonstrate
//control flow of try-finally clause
//when exception doesn't occur in try block
class GFG11 {
	public static void main(String[] args) {

		try {
			String str = "123";

			int num = Integer.parseInt(str);

			// this statement will execute
			// as no any exception is raised by above statement
			System.out.println("Inside try block");
		}

		finally {
			System.out.println("finally block executed");
		}

		// rest program will be executed
		System.out.println("Outside try-finally clause");
	}
}
