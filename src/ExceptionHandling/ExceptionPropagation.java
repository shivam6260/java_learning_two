package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionPropagation {
	public static void main(String[] args) {
		/*
		 * An exception is first thrown from the top of the stack and if it is not
		 * caught, it drops down the call stack to the previous method. If not caught
		 * there, the exception again drops down to the previous method, and so on until
		 * they are caught or until they reach the very bottom of the call stack. This
		 * is called exception propagation.
		 * 
		 * Note: By default Unchecked Exceptions are forwarded in calling chain
		 * (propagated).
		 */
	}

}
//Exception Propagation Example

class TestExceptionPropagation1 {
	void m() {
		int data = 50 / 0;
	}

	void n() {

		try {
			m();
		} catch (NullPointerException e) {
			System.out.println("exception handled");
		}
		// Final block will be called only
		finally {
			System.out.println("Final block calling");
		}
	}

	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("exception handled");
		}
	}

	public static void main(String args[]) {
		TestExceptionPropagation1 obj = new TestExceptionPropagation1();
		obj.p();
		System.out.println("normal flow...");
	}
}

//Note: By default, Checked Exceptions are not forwarded in calling chain (propagated).
// With the help of Throws keyword , checked exception are also propagated

class TestExceptionPropagation2 {
	void m() throws IOException {
		throw new java.io.IOException("device error");// checked exception
	}

	void n() throws IOException {
		m();
	}

	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("exception handeled");
		}
	}

	public static void main(String args[]) {
		TestExceptionPropagation2 obj = new TestExceptionPropagation2();
		obj.p();
		System.out.println("normal flow");
	}
}

