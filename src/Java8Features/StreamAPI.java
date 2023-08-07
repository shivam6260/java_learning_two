package Java8Features;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
	public static void main(String[] args) {
		/*
		 * 1 - Stream does not store elements. It simply conveys elements from a source
		 * such as a data structure, an array, or an I/O channel, through a pipeline of
		 * computational operations.
		 * 
		 * 2 - Stream is functional in nature. Operations performed on a stream does not
		 * modify it's source. For example, filtering a Stream obtained from a
		 * collection produces a new Stream with the filtered elements, rather than
		 * removing elements from the source collection.
		 * 
		 * 
		 * 
		 * Intermediate Operations:
		 * 
		 * 1 - map: The map method is used to returns a stream consisting of the results
		 * of applying the given function to the elements of this stream.
		 * 
		 * List number = Arrays.asList(2,3,4,5);
		 * 
		 * List square = number.stream().map(x->x*x).collect(Collectors.toList());
		 * 
		 * 2 - filter: The filter method is used to select elements as per the Predicate
		 * passed as argument.
		 * 
		 * List names = Arrays.asList("Reflection","Collection","Stream");
		 * 
		 * List result =
		 * names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
		 * 
		 * 
		 * 3 - sorted: The sorted method is used to sort the stream.
		 * 
		 * List names = Arrays.asList("Reflection","Collection","Stream");
		 * 
		 * List result = names.stream().sorted().collect(Collectors.toList());
		 * 
		 * 
		 * 
		 * 
		 * 
		 * Terminal Operations:
		 * 
		 * 1 - collect: The collect method is used to return the result of the
		 * intermediate operations performed on the stream.
		 * 
		 * List number = Arrays.asList(2,3,4,5,3); Set square =
		 * number.stream().map(x->x*x).collect(Collectors.toSet());
		 * 
		 * 2 - forEach: The forEach method is used to iterate through every element of
		 * the stream.
		 * 
		 * List number = Arrays.asList(2,3,4,5);
		 * 
		 * number.stream().map(x->x*x).forEach(y->System.out.println(y));
		 * 
		 * 3 - reduce: The reduce method is used to reduce the elements of a stream to a
		 * single value. The reduce method takes a BinaryOperator as a parameter.
		 * 
		 * List number = Arrays.asList(2,3,4,5);
		 * 
		 * int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
		 * 
		 * Here ans variable is assigned 0 as the initial value and i is added to it .
		 */

		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++)
			list.add(i);
		System.out.println(list);

		List<Integer> list2 = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		List<Integer> list3 = list.stream().filter(i -> i > 8).collect(Collectors.toList());
		List<Integer> list4 = list.stream().filter(i -> i < 4).collect(Collectors.toList());

		System.out.println(list2);
		System.out.println(list3);
		System.out.println(list4);
	}

}

class Product {
	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

class JavaStreamExample {
	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));

		// This is more compact approach for filtering data
		productsList.stream().filter(product -> product.price > 50000)
				.forEach(product -> System.out.println(product.name));

		productsList.stream().filter(product -> product.id % 2 == 0)
				.forEach(product -> System.out.println(product.name));

		List<String> res = productsList.stream().filter(product -> product.id % 2 == 0).map(p -> p.name)
				.collect(Collectors.toList());

		System.out.println(res);

		// Converting product List into Set
		Set<Float> productPriceList = productsList.stream().filter(product -> product.price < 30000)
				.map(product -> product.price).collect(Collectors.toSet());

		// Converting Product List into a Map
		Map<Integer, String> productPriceMap = productsList.stream().collect(Collectors.toMap(p -> p.id, p -> p.name));
	}
}

// Java Stream Iterating Example

class JavaStreamExample1 {
	public static void main(String[] args) {
		Stream.iterate(1, element -> element + 1).filter(element -> element % 5 == 0).limit(5)
				.forEach(System.out::println);

		List<Integer> number = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++)
			number.add(i);
		Long res = number.stream().filter(i -> i > 2).count();
		Integer sum = number.stream().collect(Collectors.summingInt(x -> x));
		System.out.println(res + " " + sum);
	}
}
