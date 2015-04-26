package org.hslu.bw242.v2;

public class Postkarte extends Versandgut{

	Double laenge;
	Double hoehe;
	
	public void zeigeInformationen() {
		System.out.println("Typ: "+ 
				this.getClass().getSimpleName()
				);
		System.out.println("Adressat: " +
				this.adressat.vorname
				);
		System.out.println("Porto: " +
				this.berechnePorto()
				);
		System.out.println("Länge: " +
				this.laenge
				);
		System.out.println("hoehe: " +
				this.hoehe
				);
	}
	
}
