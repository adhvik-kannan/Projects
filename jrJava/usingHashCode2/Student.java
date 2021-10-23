package jrJava.usingHashCode2;

public class Student {

	private int classID;
	private int inClassID;
	
	private String allOtherDescriptions;
	
	public Student(int classID, int inClassID, String allOtherDescriptions) {
		super();
		this.classID = classID;
		this.inClassID = inClassID;
		this.allOtherDescriptions = allOtherDescriptions;
	}
	
	public String toString() {
		return classID + ":" + inClassID + " : " + allOtherDescriptions;
	}
	
	public int hashCode() {
		return 4*(classID-'A') + (inClassID-1);
	}
	
	
}
