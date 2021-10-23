package jrJava.HashingBasedDS;

public class Thing {

	private int id;
	private int b;
	private int c;
	public Thing(int id, int b, int c) {
		super();
		this.id = id;
		this.b = b;
		this.c = c;
	}
	public Thing(int id) {
		this.id = id;
	}
	
	public boolean equals(Object o) {
		if(!(o instanceof Thing)) return false;
		Thing thing = (Thing) o;
		return id==thing.id;
	}
	
	public int hashCode() {
		return id;
	}
	
	public String toString() {
		return "[" + id + ", " + b + ", " + c+ "]";
	}
}
