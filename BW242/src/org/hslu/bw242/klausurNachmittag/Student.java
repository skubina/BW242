package org.hslu.bw242.klausurNachmittag;

import java.util.HashSet;

public class Student extends Person{
	
	HashSet<Fach> fächer;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
		this.fächer = new HashSet<Fach>();
	}




	int matrNR;

	public int getMatrNR() {
		return matrNR;
	}

	public void setMatrNR(int matrNR) {
		this.matrNR = matrNR;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String buffer = this.getClass().getSimpleName() + " " + this.anschrift + " " + this.name + " " + this.matrNR;
		
		System.out.println(buffer);
		
		return buffer;
	}

	public HashSet<Fach> getFächer() {
		return fächer;
	}

	public void setFächer(HashSet<Fach> fächer) {
		this.fächer = fächer;
	}
	
	

}
