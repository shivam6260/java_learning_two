package ExceptionHandling;

import java.io.FileNotFoundException;

public class MethodOveridingWithExceptionHandling {
	public static void main(String[] args) {
		/*
		 * 1 - If the superclass method does not declare an exception, subclass
		 * overridden method cannot declare the checked exception but it can declare
		 * unchecked exception.
		 * 
		 * 2 - If the superclass method declares an exception, subclass overridden
		 * method can declare same, subclass exception or no exception but cannot
		 * declare parent exception.
		 * 
		 * 
		 * Conclusions:
		 * 
		 * 1 - If SuperClass does not declare an exception, then the SubClass can only
		 * declare unchecked exceptions, but not the checked exceptions.
		 * 
		 * 2 - If SuperClass declares an exception, then the SubClass can only declare
		 * the same or child exceptions of the exception declared by the SuperClass and
		 * any new Runtime Exceptions, just not any new checked exceptions at the same
		 * level or higher.
		 * 
		 * 3 - If SuperClass declares an exception, then the SubClass can declare
		 * without exception.
		 */

	}

}

class Parent1 {
	public void print() throws ArithmeticException {
		System.out.println(" Hello Parent");
	}
}

class Child1 extends Parent1 {
	public void print() throws IndexOutOfBoundsException {

		System.out.println(" Hello Child");
	}
}