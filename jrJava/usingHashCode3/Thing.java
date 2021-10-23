package jrJava.usingHashCode3;

public class Thing {

	private int s1;
	private int s2;
	private int s3;
	
	// others.
	
	public int hashCode() {
		// retrun s1;
		//return s1*1000 + s2*1;
		return s1*1000000 + s2*1000 + s3*1;
		
	}
}
