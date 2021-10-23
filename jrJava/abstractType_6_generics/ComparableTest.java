package jrJava.abstractType_6_generics;

public class ComparableTest {

	public static void main(String[] args) {

		Employee e = new Employee("Emma Watson 12  Programmer2 2013 99500  1994   4  12  F      173  138");
		Ball b = new Ball("100, 200, 80");

		// int result = e.compareTo(b);

		Employee e2 = new Employee("Emma Watson 12  Programmer2 2013 99500  1994   4  12  F      173  138");
		int result = e.compareTo(e2);

	}

}
