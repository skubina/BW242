package org.hslu.bw242.v2;

public abstract class SchwerVersand extends Postkarte{
	double gewicht;
	
	public double berechnePorto(){
		return gewicht;
		
	}
	
	
	
	public abstract void test();
	
	
}
