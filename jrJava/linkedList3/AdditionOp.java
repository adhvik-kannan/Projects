package jrJava.linkedList3;

import java.util.Iterator;

public class AdditionOp {

	private MyIterator iter;
	
	public AdditionOp(MyIterator iter) {
		this.iter = iter;
	}
	
	public void process() {
		if(iter.hasNext()) {
			Link each = (Link) iter.next();
		}
	}
}
