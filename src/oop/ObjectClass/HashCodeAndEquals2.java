package oop.ObjectClass;

import java.util.Objects;

// If two objects are equal ( a1.equals(b1) == true ) there hashcode will be same
// but if two object hashcode are same, it is not gurantee that both object are equal

class Human {
	int id;
	String name;
	public Human(int id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Human other = (Human) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
}

public class HashCodeAndEquals2 {
	public static void main(String[] args) {
//		Human obj1 = new Human(5,"Shivam");
//		Human obj2 = new Human(5,"Shivam");
//		System.out.println(obj1.hashCode());
//		System.out.println(obj2.hashCode());
//		System.out.println(obj1.equals(obj2));
//		System.out.println(obj2.equals(obj1));
		
		String s1 = new String("Shivam");
		String s2 = new String("Shivam");
		
		// They will give same hashcode because all wrapper class, String class
		// have hashcode and equals method over-written
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		if(s1 == s2)
			System.out.println("s1 == s2");
		else if(s1.equals(s2))
			System.out.println("s1.equals(s2)");
	}

}
