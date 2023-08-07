package oop.MemoryAllocation;

public class MemoryConcept1 {
	public static void main(String[] args) {
		/*
		 * Heap -
		 * 
		 * 1 - It is a shared runtime data area and stores the actual object in a
		 * memory. It is instantiated during JVM startup.
		 * 
		 * There exists only one heap for each running JVM process. When heap becomes
		 * full, the garbage is collected.
		 * 
		 * 2 -This memory is allocated for all class instances variables and array. Heap
		 * can be of fixed or dynamic size depending upon the system’s configuration.
		 * 
		 * 3 - JVM provides the user control to initialize or vary the size of heap as
		 * per the requirement.
		 * 
		 * 4 -When a new keyword is used, object is assigned a space in heap, but the
		 * reference of the same exists onto the stack.
		 * 
		 * 5 - There exists one and only one heap for a running JVM process.
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * The above statement creates the object of Scanner class which gets allocated
		 * to heap whereas the reference ‘sc’ gets pushed to the stack.
		 * 
		 * Garbage collection in heap area is mandatory.
		 * 
		 * 
		 * 
		 * Method Area:
		 * 
		 * 1 - It is a logical part of the heap area and is created on JVM startup.
		 * 
		 * 2 -Method Area is a part of the heap memory which is shared among all the
		 * threads. It creates when the JVM starts up. It is used to store class
		 * structure, superclass name, interface name, and constructors.
		 * 
		 * 3 - Note: Though method area is logically a part of heap, it may or may not
		 * be garbage collected even if garbage collection is compulsory in heap area.
		 * 
		 * 4 - The class method area is the memory block that stores the class code,
		 * variable code(static variable, runtime constant), method code, and the
		 * constructor of a Java program. (Here method means the function which is
		 * written inside the class).
		 * 
		 * 
		 * 
		 * Stack Area :
		 * 
		 * 1 -Stack Area generates when a thread creates. It can be of either fixed or
		 * dynamic size.
		 * 
		 * 2 -The stack memory is allocated per thread. It is used to store data and
		 * partial results. It contains references to heap objects.
		 * 
		 * 3 -It also holds the value itself rather than a reference to an object from
		 * the heap.
		 * 
		 * Stack Frame:
		 * 
		 * 1 - Stack frame is a data structure that contains the thread's data.
		 * 
		 * 2 - When a method invokes, a new frame creates. It destroys the frame when
		 * the invocation of the method completes. Each frame contains own Local
		 * Variable Array (LVA), Operand Stack (OS), and Frame Data (FD).
		 * 
		 * 3 - Only one frame (the frame for executing method) is active at any point in
		 * a given thread of control. This frame is called the current frame, and its
		 * method is known as the current method. The class of method is called the
		 * current class.
		 * 
		 * 4 - The frame stops the current method, if its method invokes another method
		 * or if the method completes.
		 * 
		 * 5 - The frame created by a thread is local to that thread and cannot be
		 * referenced by any other thread.
		 * 
		 * 
		 * Native Method Stack -
		 * 
		 * 1 - It is also known as C stack. It is a stack for native code written in a
		 * language other than Java.
		 * 
		 * 2 - Java Native Interface (JNI) calls the native stack. The performance of
		 * the native stack depends on the OS
		 * 
		 * 
		 * Program Counter Register:
		 * 
		 * 1 - Each JVM thread that carries out the task of a specific method has a
		 * program counter register associated with it.
		 * 
		 * 2 - The non-native method has a PC that stores the address of the available
		 * JVM instruction whereas, in a native method, the value of the program counter
		 * is undefined.
		 * 
		 * 3 - PC register is capable of storing the return address or a native pointer
		 * on some specific platform.
		 */
	}

}

/*
 * Stack is a memory place where the methods and the local variables are stored.
 * (variable references either primitive or object references are also stored in
 * the stack). Heap is a memory place where the objects and its instance
 * variable are stored.
 * 
 *  Stack VS Heap
 * 
 * Parameter - 1- Stack Memory 2- Heap Space
 * 
 * Key Points: Stack
 * 
 * It’s a temporary memory allocation scheme where the data members are
 * accessible only if the method( ) that contained them is currently is running.
 * 
 * It allocates or de-allocates the memory automatically as soon as the
 * corresponding method completes its execution.
 * 
 * We receive the corresponding error Java. lang. StackOverFlowError by JVM, If
 * the stack memory is filled completely.
 * 
 * Stack memory allocation is considered safer as compared to heap memory
 * allocation because the data stored can only be access by owner thread.
 * 
 * 
 * Memory allocation and de-allocation is faster as compared to Heap-memory
 * allocation. Stack-memory has less storage space as compared to Heap-memory.
 * 
 * 
 * Key Points: Heap
 * 
 * We receive the corresponding error message if Heap-space is entirely full,
 * java. lang.OutOfMemoryError by JVM.
 * 
 * This memory allocation scheme is different from the Stack-space allocation,
 * here no automatic de-allocation feature is provided.
 * 
 * We need to use a Garbage collector to remove the old unused objects in order
 * to use the memory efficiently.
 * 
 * The processing time(Accessing time) of this memory is quite slow as compared
 * to Stack-memory.
 * 
 * Heap-memory is also not threaded-safe as Stack-memory because data stored in
 * Heap-memory are visible to all threads.
 * 
 * Size of Heap-memory is quite larger as compared to the Stack-memory.
 * Heap-memory is accessible or exists as long as the whole application(or java
 * program) runs.
 * 
 */
