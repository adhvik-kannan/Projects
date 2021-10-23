package jrJava.using2DArray_objects;

public class HandlingTwoDimenObjectArray {

	public static void main(String[] args) {

		Employee[] employees = Utility.loadEmployeesFromFile("jrJava/using2DArray_objects/employee.txt");
		// Utility.print(employees);
		Employee[][] emps = new Employee[5][];
		employees[0] = null;
		emps[0] = new Employee[4];
		emps[1] = new Employee[5];
		emps[2] = new Employee[6];
		emps[3] = new Employee[7];
		emps[4] = new Employee[9];

		transferData(employees, emps);
		print(emps);
		printMaxMin(emps);
	}

	public static void printMaxMin(Comparable[][] comps) {
		Comparable max = comps[0][0];
		Comparable min = comps[0][0];
		int i, j;
		for (i = 0; i < comps.length; i++) {
			for (j = 0; j < comps[i].length; j++) {
				if (max == null) {
					max = comps[i][j];
					continue;
				}
				if (min == null) {
					min = comps[i][j];
					continue;
				}
				if (comps[i][j] == null)
					continue;
				if (comps[i][j].compareTo(max) > 0)
					max = comps[i][j];
				if (comps[i][j].compareTo(min) < 0)
					min = comps[i][j];
			}
		}

		System.out.println("max: " + max + ", min:" + min);
	}

	public static void transferData(Object[] objects, Object[][] objs) {
		int count = 0;
		int i, j;
		for (i = 0; i < objs.length; i++) {
			for (j = 0; j < objs[i].length; j++) {
				if (count >= objects.length)
					objs[i][j] = null;
				else
					objs[i][j] = objects[count++];
			}

		}

	}

	public static void print(Object[][] emps) {
		if (emps == null)
			return;
		int j, i;
		for (i = 0; i < emps.length; i++) {
			if (emps[i] == null) {
				System.out.println("null");
				continue;
			}
			for (j = 0; j < emps[i].length; j++) {
				System.out.print(emps[i][j] + " ");
			}
			System.out.println();
		}
	}
}
