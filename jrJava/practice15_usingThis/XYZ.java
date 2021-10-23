package jrJava.practice15_usingThis;

public class XYZ {

	public int aaa;
	public boolean bbbb;

	public void mmA(int aaa, boolean bbbb) {
		this.aaa = aaa;
		this.bbbb = bbbb;
	}

	public double mmB(int aaa) {
		return 0.5 * (this.aaa + aaa);
	}

}
