package oop.ObjectClass;

import java.util.*;

class Student {
	int id;
	int roll;
	
	public Student(int id,int roll)
	{
		this.id = id;
		this.roll = roll;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, roll);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id && roll == other.roll;
	}
}

public class HashCodeAndEquals {
	public static void main(String[] args) {
		Map<Student,String> map = new HashMap<Student,String>();
		Student s1 = new Student(1,54);
		Student s2 = new Student(1,54);
		map.put(s1, "Shivam");
		System.out.println(map.get(s2));
		
		
	}

}
