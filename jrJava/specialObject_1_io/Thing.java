package jrJava.specialObject_1_io;

public class Thing {

	private int id;
	private String name;
	
	
	public Thing(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	
	public String toString() {
		return "id:" + id + "  name:" + name; 
	}
}
