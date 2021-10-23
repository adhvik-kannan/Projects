package jrJava.usingHashCode1;

public class Test {

	public static void main(String[] args) {
		Student s1 = new Student(104, "Swimming, Basketball");
		Student s2 = new Student(102, "Soccer, Martial Arts");
		Student s3 = new Student(101, "Volley Ball");
		Student s4 = new Student(105, "Baseball, Swimming");
		Student s5 = new Student(103, "Hockey, Football");

		Student[] students = new Student[5];
		students[s1.hashCode()] = s1;
		students[s2.hashCode()] = s2;
		students[s3.hashCode()] = s3;
		students[s4.hashCode()] = s4;
		students[s5.hashCode()] = s5;
		
		int id = 102;
		int hashCode = id - 101;
		Student found1 = students[hashCode];
		System.out.println(found1);
		
		Student probe = new Student(102, "");
		Student found2 = students[probe.hashCode()];
		System.out.println(found2);
	}

}
