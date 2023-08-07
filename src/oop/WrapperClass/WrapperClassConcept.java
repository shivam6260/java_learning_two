package oop.WrapperClass;

public class WrapperClassConcept {

	public static void main(String[] args) {

		/*
		 * The wrapper class in Java provides the mechanism to convert primitive into
		 * object and object into primitive.
		 * 
		 * Use of Wrapper classes in Java
		 * 
		 * Change the value in Method: Java supports only call by value. So, if we pass
		 * a primitive value, it will not change the original value. But, if we convert
		 * the primitive value in an object, it will change the original value.
		 * 
		 * Collection Framework: Java collection framework works with objects only. All
		 * classes of the collection framework (ArrayList, LinkedList, Vector, HashSet,
		 * LinkedHashSet, TreeSet, PriorityQueue, ArrayDeque, etc.) deal with objects
		 * only.
		 * 
		 * Synchronization: Java synchronization works with objects in Multithreading.
		 * 
		 * java.util package: The java.util package provides the utility classes to deal
		 * with objects.
		 */
	}

}

/*
 * Autoboxing
 * 
 * The automatic conversion of primitive data type into its corresponding
 * wrapper class is known as autoboxing, for example, byte to Byte, char to
 * Character, int to Integer, long to Long, float to Float, boolean to Boolean,
 * double to Double, and short to Short.
 * 
 * Since Java 5, we do not need to use the valueOf() method of wrapper classes
 * to convert the primitive into objects.
 */

class WrapperExample1 {
	public static void main(String args[]) {
		int a = 20;
		Integer i = Integer.valueOf(a);// converting int into Integer explicitly
		Integer j = a;// autoboxing, now compiler will write Integer.valueOf(a) internally

		System.out.println(a + " " + i + " " + j);
	}
}

/*
 * Unboxing
 * 
 * The automatic conversion of wrapper type into its corresponding primitive
 * type is known as unboxing. It is the reverse process of autoboxing. Since
 * Java 5, we do not need to use the intValue() method of wrapper classes to
 * convert the wrapper type into primitives.
 */

class WrapperExample2 {
	public static void main(String args[]) {
		Integer a = new Integer(3);
		int i = a.intValue();// converting Integer to int explicitly
		int j = a;// unboxing, now compiler will write a.intValue() internally

		System.out.println(a + " " + i + " " + j);
	}
}

class WrapperExample3 {
	public static void main(String args[]) {
		byte b = 10;
		short s = 20;
		int i = 30;
		long l = 40;
		float f = 50.0F;
		double d = 60.0D;
		char c = 'a';
		boolean b2 = true;

//		Autoboxing: Converting primitives into objects  
		Byte byteobj = b;
		Short shortobj = s;
		Integer intobj = i;
		Long longobj = l;
		Float floatobj = f;
		Double doubleobj = d;
		Character charobj = c;
		Boolean boolobj = b2;

//		Printing objects  
		System.out.println("---Printing object values---");
		System.out.println("Byte object: " + byteobj);
		System.out.println("Short object: " + shortobj);
		System.out.println("Integer object: " + intobj);
		System.out.println("Long object: " + longobj);
		System.out.println("Float object: " + floatobj);
		System.out.println("Double object: " + doubleobj);
		System.out.println("Character object: " + charobj);
		System.out.println("Boolean object: " + boolobj);

//Unboxing: Converting Objects to Primitives  
		byte bytevalue = byteobj;
		short shortvalue = shortobj;
		int intvalue = intobj;
		long longvalue = longobj;
		float floatvalue = floatobj;
		double doublevalue = doubleobj;
		char charvalue = charobj;
		boolean boolvalue = boolobj;

//Printing primitives  
		System.out.println("---Printing primitive values---");
		System.out.println("byte value: " + bytevalue);
		System.out.println("short value: " + shortvalue);
		System.out.println("int value: " + intvalue);
		System.out.println("long value: " + longvalue);
		System.out.println("float value: " + floatvalue);
		System.out.println("double value: " + doublevalue);
		System.out.println("char value: " + charvalue);
		System.out.println("boolean value: " + boolvalue);
	}
}

/*
 * Stack is a memory place where the methods and the local variables are stored.
 * (variable references either primitive or object references are also stored in
 * the stack). Heap is a memory place where the objects and its instance
 * variable are stored.
 */

// Pass by Value Example
class Operation2 {
	static int data = 50;
	Integer val = 100;
	String str;
	
	public Operation2()
	{
		str = new String("Shivam");
	}

	void change(Operation2 op) {
		op.val = 10000;// changes will be in the instance variable
		op.data = op.data + 100;// changes will be in the instance variable
		op.str = "Simran";// changes will be in the instance variable
	}
	
	public static void main(String args[]) {
		Operation2 op = new Operation2();

		System.out.println("before change " + op.data);
		System.out.println("before change " + op.val);
		op.change(op);// passing object
		System.out.println("after change " + op.data);
		System.out.println("after change " + op.val);
		System.out.println("after change " + op.str);
	}
}


/*
 * Local variable are stored in Stack only so the original value is copied in
 * this case and change is happen in copied part. Original remain same
 * and String and wrapper class are Immutable class
 */


class Operation3{
	public static void change(Integer a) {
		a = 500;
	}

	public static void change(String s) {
		s = "Simran";
	}

	public static void main(String[] args) {
		Integer a = 10;
		change(a);
		System.out.println(a);

		// String s = "Shivam";
		String s = new String("Shivam");
		change(s);
		System.out.println(s);
	}
}


