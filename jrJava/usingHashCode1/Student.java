package jrJava.usingHashCode1;

public class Student {

	private int id;
	private String allOtherDescriptions;

	public Student(int id, String allOtherDescriptions) {
		super();
		this.id = id;
		this.allOtherDescriptions = allOtherDescriptions;
	}

	public String toString() {
		return id + ": " + allOtherDescriptions;
	}

	public int hashCode() {
		return id - 101;
	}

}
