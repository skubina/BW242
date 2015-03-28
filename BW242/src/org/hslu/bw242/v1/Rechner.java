package org.hslu.bw242.v1;

public class Rechner {

	double zahl1;
	double zahl2;
	
	

	public double addieren() {
		return this.zahl1 + this.zahl2;
	}

	public double subtrahieren() {
		return this.zahl1 - this.zahl2;
	}

	public double multiplizieren() {
		return this.zahl1 * this.zahl2;
	}

	public double dividieren() {
		return this.zahl1 / this.zahl2;
	}
	
	
	
	
	
	
	

	public double getZahl1() {
		return zahl1;
	}

	public void setZahl1(double zahl1) {
		this.zahl1 = zahl1;
	}

	public double getZahl2() {
		return zahl2;
	}

	public void setZahl2(double zahl2) {
		this.zahl2 = zahl2;
	}

}
