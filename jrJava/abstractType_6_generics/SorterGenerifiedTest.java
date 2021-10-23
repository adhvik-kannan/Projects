package jrJava.abstractType_6_generics;

public class SorterGenerifiedTest {

	public static void main(String[] args) {

		SorterGenerified<Employee> sorter = new SorterGenerified<Employee>();

		sorter.add(new Employee("Emma Watson 12 Programmer2 2013 99500 1994 4 12 F 173 138"));
		sorter.add(new Employee("Mila Kunis 91 Reception 2013 89600 1985 3 29 F 158 119"));
		sorter.add(new Employee("Gal Gadot 67 Manager 2013 108000 1995 11 7 F 173 108"));
		// sorter.add(new Ball("100, 200, 80"));
		sorter.sort();

		sorter.print();
	}

}
