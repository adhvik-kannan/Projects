package jrJava.accessModifier_4_evolution1;

public class StorageService {

	private int data1;
	private int data2;
	private int data3;
	
	
	public void addData(int index, int aData) {
		if(index==1) data1 = aData;
		else if(index==2) data2 = aData;
		else if(index==3) data3 = aData;
	}
	
	public int getData(int index) {
		if(index==1) return data1;
		if(index==2) return data2;
		if(index==3) return data3;
		return 0;
	}
	
	public int sum() {
		return data1 + data2 + data3;
	}
}
