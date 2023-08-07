package ExceptionHandling;

import java.io.FileNotFoundException;
import java.sql.SQLClientInfoException;
import java.io.IOException;

public class Throws {
	public static void main(String[] args) {
		/*
		 * The Java throws keyword is used to declare an exception. It gives an
		 * information to the programmer that there may occur an exception. So, it is
		 * better for the programmer to provide the exception handling code so that the
		 * normal flow of the program can be maintained.
		 * 
		 * throws keyword is required only to convince compiler and usage of throws
		 * keyword does not prevent abnormal termination of program.
		 * 
		 * By the help of throws keyword we can provide information to the caller of the
		 * method about the exception.
		 * 
		 * Which exception should be declared? Ans: Checked exception only, because:
		 * 
		 * unchecked exception: under our control so we can correct our code. error:
		 * beyond our control. For example, we are unable to do anything if there occurs
		 * VirtualMachineError or StackOverflowError.
		 * 
		 * We can declare multiple exceptions using throws keyword that can be thrown by
		 * the method. For example, main() throws IOException, SQLException.
		 */

	}

}

class Throws1 {
	public static void method() throws ArithmeticException {
		int res = 5 / 0;
	}

	public static void main(String[] args) {
		try {
			method();
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("After try - catch");
	}
}

class Throws2 {
	public static void method() throws FileNotFoundException {
		FileNotFoundException fnf = new FileNotFoundException("File nahi mila");
		throw fnf;

//		try {
//			FileNotFoundException fnf1 = new FileNotFoundException("File nahi mila");
//			throw fnf1;
//		} catch (FileNotFoundException e) {
//			System.out.println(e);
//		}
	}

	public static void main(String[] args) {
		try {
			method();
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		System.out.println("After try - catch");
	}
}

/*
 * Advantage of Java throws keyword Now Checked Exception can be propagated
 * (forwarded in call stack).
 */

class Testthrows1 {
	void m() throws IOException {
		throw new IOException("device error");// checked exception
		// throw kie niche code error aa jata
		// Error - unreachable code
		//System.out.println("In m method");
	}

	void n() throws IOException {
		m();
		System.out.println("In n method");
	}

	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("exception handled");
		}
	}

	public static void main(String args[]) {
		Testthrows1 obj = new Testthrows1();
		obj.p();
		System.out.println("normal flow...");
	}
}