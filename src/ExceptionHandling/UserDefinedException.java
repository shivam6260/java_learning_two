 package ExceptionHandling;

import java.io.IOException;

public class UserDefinedException {
	public static void main(String[] args) {
		/*
		 * 
		 */
	}
}

//A Class that represents use-defined exception

class MyException1 extends Exception {
//	public MyException1(String s)
//	{
//		// Call constructor of parent Exception
//		super(s);
//	}
}

//A Class that uses above MyException
class Main {
	// Driver Program
	public static void main(String args[])
	{
		try {
			// Throw an object of user defined exception
//			throw new MyException1("GeeksGeeks");
			throw new MyException1();
		}
		catch (MyException1 ex) {
			System.out.println("Caught");

			// Print the message from MyException object
			System.out.println(ex.getMessage());
		}
		
		System.out.println("Rest of the code");
	}
}

// My random practice for Custom Exception

//O/P
//Hello
//Catching
//Rest of the code

class Voting18 extends Exception {
	
}

class Test4 {
	public static void print(int age) throws Voting18
	{
		try {
			throw new Voting18();
		} catch (Exception e) {
			System.out.println("Catching");
		}
	}
	public static void main(String[] args) {
		System.out.println("Hello");
		//print(18);
		
		try {
			print(18);
		} catch (Voting18 e) {
			System.out.println("We already catched that");
		}
		System.out.println("Rest of the code");
		
	}
}
















