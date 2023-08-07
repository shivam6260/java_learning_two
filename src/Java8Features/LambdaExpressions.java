package Java8Features;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressions {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++)
			list.add(i);

		list.forEach(n -> System.out.println(n));

		list.forEach((n) -> {
			if (n % 2 == 0)
				System.out.println(n);
		});
	}

}

//Example of both Normal Implementation and Lambda Epressions in Functional Interface

interface f1 {
	int cube(int x);
}

interface f2 {
	void isSquare(String msg);
}

class Check implements f2, f1 {
	public void isSquare(String msg) {
		System.out.println(msg);
	}

	public int cube(int x) {
		return x + x;
	}

	public static void main(String[] args) {
		f1 fone = (int x) -> x * x;
		f2 ftwo = (String msg) -> {
			System.out.println("Hello");
		};

		int res = fone.cube(5);
		ftwo.isSquare("Hello");

		Check obj = new Check();
		obj.cube(10);
		obj.isSquare("Hello");
	}
}
