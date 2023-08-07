package ExceptionHandling;

import java.io.FileNotFoundException;

public class Throw {
	public static void main(String[] args) {
		/*
		 * The Java throw keyword is used to throw an exception explicitly.
		 * 
		 * We can throw either checked or unchecked exceptions in Java by throw keyword.
		 * It is mainly used to throw a custom exception.
		 * 
		 * throw is used within the method.
		 * 
		 * We are allowed to throw only one exception at a time i.e. we cannot throw
		 * multiple exceptions.
		 */

	}
}

// Unchecked Exception
// Unchecked exception can be propagated using throw only.
class Throw1 {
	public static void main(String[] args) {
		ArithmeticException ae1 = new ArithmeticException("Hello From Arithmetic Exception");
		throw ae1;
//		try {
//			ArithmeticException ae = new ArithmeticException("Hello From Arithmetic Exception");
//			throw ae;
//		} catch (Exception e) {
//			System.out.println(e);
//		}
	}
}

// Checked Exception
// Checked Exception cannot be propagated using throw only
class Throw2 {
	public static void main(String[] args) {
//		FileNotFoundException fnf = new FileNotFoundException("File nahi mila");
//		throw fnf ;

		try {
			FileNotFoundException fnf = new FileNotFoundException("File nahi mila");
			throw fnf;
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

// User Defined Checked Exception
class MyException extends Exception {
	public MyException() {
		super("Mera banaya hua exception");
	}
}

class Throw3 {
	public static void main(String[] args) {
		try {
			MyException me = new MyException();
			throw me;
		} catch (MyException e) {
			System.out.println(e);
		}

	}

}


// User Defined UnChecked Exception
// It can be propagated using throw only
class myException22 extends RuntimeException {
	public myException22() {
		super("mera banaya hua unchecked exception");
	}
}

class Throw4 {
	public static void main(String[] args) {
		myException22 obj = new myException22();
		throw obj ;
	}
}



