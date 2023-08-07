package oop.MemoryAllocation;

public class GarbageCollector {
	public static void main(String[] args) {
		/*
		 * In Java, garbage collection is the process of managing memory, automatically.
		 * It finds the unused objects (that are no longer used by the program) and
		 * delete or remove them to free up the memory. The garbage collection mechanism
		 * uses several GC algorithms. The most popular algorithm that is used is Mark
		 * and Sweep.
		 * 
		 * 
		 * When a program executes in Java , it uses memory in different ways. The heap
		 * is a part of memory where objects live. It's the only part of memory that
		 * involved in the garbage collection process. It is also known as garbage
		 * collectible heap. All the garbage collection makes sure that the heap has as
		 * much free space as possible. The function of the garbage collector is to find
		 * and delete the objects that cannot be reached.
		 * 
		 * 
		 * Important Points About Garbage Collector It is controlled by a thread known
		 * as Garbage Collector.
		 * 
		 * Java provides two methods System.gc() and Runtime.gc() that sends request to
		 * the JVM for garbage collection. Remember, it is not necessary that garbage
		 * collection will happen.
		 * 
		 * Java programmer are free from memory management. We cannot force the garbage
		 * collector to collect the garbage, it depends on the JVM.
		 * 
		 * If the Heap Memory is full, the JVM will not allow to create a new object and
		 * shows an error java.lang.OutOfMemoryError.
		 * 
		 * 
		 * When garbage collector removes object from the memory, first, the garbage
		 * collector thread calls the finalize() method of that object and then remove.
		 * 
		 * 
		 * When an Object becomes eligible for Garbage Collection?
		 * 
		 * An object become eligible if it is not used by any program or thread or any
		 * static references or its references is null.
		 * 
		 * 
		 * What does Java Garbage Collector?
		 * 
		 * Java garbage collection is an automatic process. Automatic garbage collection
		 * is the process of looking at heap memory, identifying which objects are in
		 * use and which are not, and deleting the unused objects. An in-use object, or
		 * a referenced object, means that some part of your program still maintains a
		 * pointer to that object. An unused or unreferenced object is no longer
		 * referenced by any part of your program. So the memory used by an unreferenced
		 * object can be reclaimed.
		 * 
		 * JVM controls the garbage collector. JVM decides when to perform the garbage
		 * collection. You can also request to the JVM to run the garbage collector. But
		 * there is no guarantee under any conditions that the JVM will comply. JVM runs
		 * the garbage collector if it senses that memory is running low.
		 * 
		 * Mark and Sweep Algorithm
		 * 
		 * JVM uses the mark and sweep algorithm for performing the garbage collection.
		 * It contains two phases, the mark phase, and the sweep phase.
		 * 
		 * 
		 */
	}

}
