package jrJava.linkedList3;

import java.util.Iterator;

import jrJava.type_advanced.E;

public class RemovalOp {

	private MyIterator iter;
	private int removeId;

	public RemovalOp(MyIterator iter, int removeId) {
		this.iter = iter;
		this.removeId = removeId;
	}

	public void process() {
		if (iter.hasNext()) {
			Link each = (Link) iter.next();
			if (each.id == removeId)
				iter.remove();
		}
	}
}
