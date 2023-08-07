package ExceptionHandling;

public class WhatIsException {
	public static void main(String[] args) {
		/*
		 * Exception Compile time pai nahi hota. Agar koi checked exception hai jo
		 * handle nahi hua hai toh java program compile hi nahi hoga. Program aise hi
		 * run kar die toh exception aa jayega , wo exception ya toh checked hoga ya
		 * unchecked hoga jo code mai phele aai. Lekin Exception run time pai hi throw
		 * hota hai. Toh jo exception handling hai wo Runtime error ko handle karta hai.
		 * Ab wo runtime error kissi bhi type ka exception(checked ya unchecked) kai
		 * karan ho.
		 * 
		 * 
		 * 
		 * What is an Exception?
		 * 
		 * An exception is an unwanted or unexpected event, which occurs during the
		 * execution of a program i.e at run time, that disrupts the normal flow of the
		 * program’s instructions.
		 * 
		 * Exceptions can be caught and handled by the program. When an exception occurs
		 * within a method, it creates an object. This object is called the exception
		 * object. It contains information about the exception such as the name and
		 * description of the exception and the state of the program when the exception
		 * occurred.
		 * 
		 * Exception Handling is a mechanism to handle runtime errors such as
		 * ClassNotFoundException, IOException, SQLException, RemoteException, etc.
		 * 
		 * Advantage of Exception Handling The core advantage of exception handling is
		 * to maintain the normal flow of the application. An exception normally
		 * disrupts the normal flow of the application; that is why we need to handle
		 * exceptions.
		 * 
		 * Hierarchy of Java Exception classes Link =
		 * https://www.javatpoint.com/exception-handling-in-java
		 * 
		 * Difference between Checked and Unchecked Exceptions
		 * 
		 * 1) Checked Exception The classes that directly inherit the Throwable class
		 * except RuntimeException and Error are known as checked exceptions. For
		 * example, IOException, SQLException, etc. Checked exceptions are checked at
		 * compile-time.
		 * 
		 * 2) Unchecked Exception The classes that inherit the RuntimeException are
		 * known as unchecked exceptions. For example, ArithmeticException,
		 * NullPointerException, ArrayIndexOutOfBoundsException, etc. Unchecked
		 * exceptions are not checked at compile-time, but they are checked at runtime.
		 * 
		 * 3) Error Error is irrecoverable. Some example of errors are OutOfMemoryError,
		 * VirtualMachineError, Stackoverflow etc.
		 * 
		 * 
		 */
	}

}

/*
 * How does JVM handle an Exception? Link =
 * https://www.geeksforgeeks.org/exceptions-in-java/
 * 
 * Default Exception Handling: Whenever inside a method, if an exception has
 * occurred, the method creates an Object known as Exception Object and hands it
 * off to the run-time system(JVM). The exception object contains the name and
 * description of the exception and the current state of the program where the
 * exception has occurred.
 * 
 * There might be a list of the methods that had been called to get to the
 * method where an exception occurred. This ordered list of the methods is
 * called Call Stack.
 * 
 * The run-time system starts searching from the method in which the exception
 * occurred, proceeds through the call stack in the reverse order in which
 * methods were called.
 * 
 * The run-time system searches the call stack to find the method that contains
 * a block of code that can handle the occurred exception. The block of the code
 * is called an Exception handler.
 * 
 * If it finds an appropriate handler then it passes the occurred exception to
 * it. Appropriate handler means the type of the exception object thrown matches
 * the type of the exception object it can handle.
 * 
 * If the run-time system searches all the methods on the call stack and
 * couldn’t have found the appropriate handler then the run-time system handover
 * the Exception Object to the default exception handler, which is part of the
 * run-time system. This handler prints the exception information in the
 * following format and terminates the program abnormally.
 * 
 * 
 */

//Java program to demonstrate exception is thrown
//how the runTime system searches the call stack
//to find appropriate exception handler.

class ExceptionThrown {
	static void print() {
		System.out.println("Print after exception");
	}

	// It throws the Exception(ArithmeticException).
	// Appropriate Exception handler is not found within this method.
	static int divideByZero(int a, int b) {
		int i = a / b;
		print();
		return i;
	}

	static int computeDivision(int a, int b) {
		int res = 0;

		try {
			res = divideByZero(a, b);
		}
		// doesn't matches with ArithmeticException
		catch (NumberFormatException ex) {
			System.out.println("NumberFormatException is occurred");
		}
		return res;
	}

	public static void main(String args[]) {
		int a = 1;
		int b = 0;

		try {
			int i = computeDivision(a, b);
		} catch (ArithmeticException ex) {
			// getMessage will print description of exception(here / by zero)
			System.out.println(ex.getMessage());
		} finally {
			System.out.println("main fnaly");
		}
		print();
	}
}

/*
 * 
 */
class Practice {
	public static void print() {
		System.out.println("Practice");
	}

	public void divide() {
		try {
			System.out.println(1);
			print();
			int res = 5 / 0;
			System.out.println(2);
			print();
		} catch (ArithmeticException e) {
			System.out.println("Catching Arithmetic Exception");
		}
		System.out.println(3);
		print();
	}

	public static void main(String[] args) {
		Practice obj = new Practice();
		obj.divide();
	}
}
