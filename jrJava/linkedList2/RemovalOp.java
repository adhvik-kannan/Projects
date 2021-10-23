package jrJava.linkedList2;

import java.util.Iterator;

import jrJava.type_advanced.E;

public class RemovalOp {

	private Iterator<E> iter;
	private int removeId;
	
	public RemovalOp(Iterator iter, int removeId) {
		this.iter = iter;
		this.removeId = removeId;
	}
	
	public void process() {
		if(iter.hasNext()) {
			//Link each = (Link) iter.next();
			//if(each.id==removeId) iter.remove();
		}
	}
}
