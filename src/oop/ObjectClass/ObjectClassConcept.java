package oop.ObjectClass;

import java.lang.Object;

public class ObjectClassConcept {
	public static void main(String[] args) {
		/*
		 * Object class is present in java.lang package. Every class in Java is directly
		 * or indirectly derived from the Object class. If a class does not extend any
		 * other class then it is a direct child class of Object and if extends another
		 * class then it is indirectly derived. Therefore the Object class methods are
		 * available to all Java classes. Hence Object class acts as a root of
		 * inheritance hierarchy in any Java Program.
		 * 
		 * toString():
		 * 
		 * The toString() provides a String representation of an object and is used to
		 * convert an object to String. The default toString() method for class Object
		 * returns a string consisting of the name of the class of which the object is
		 * an instance, the at-sign character `@’, and the unsigned hexadecimal
		 * representation of the hash code of the object.
		 * 
		 * hashCode():
		 * 
		 * For every object, JVM generates a unique number which is hashcode. It returns
		 * distinct integers for distinct objects. A common misconception about this
		 * method is that the hashCode() method returns the address of the object, which
		 * is not correct. It converts the internal address of the object to an integer
		 * by using an algorithm. The hashCode() method is native because in Java it is
		 * impossible to find the address of an object, so it uses native languages like
		 * C/C++ to find the address of the object. Use of hashCode() method: It returns
		 * a hash value that is used to search objects in a collection.
		 * 
		 * equals(Object obj):
		 * 
		 * It compares the given object to “this” object (the object on which the method
		 * is called). It gives a generic way to compare objects for equality.
		 * 
		 * 
		 * finalize() method:
		 * 
		 * This method is called just before an object is garbage collected. It is
		 * called the Garbage Collector on an object when the garbage collector
		 * determines that there are no more references to the object. We should
		 * override finalize() method to dispose of system resources, perform clean-up
		 * activities and minimize memory leaks
		 * 
		 * Note: The finalize method is called just once on an object even though that
		 * object is eligible for garbage collection multiple times.
		 */

	}

}
