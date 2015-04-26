package org.hslu.bw242.v2;

public class Paeckchen extends Brief {

	double tiefe;
	
	@Override
	public double berechnePorto(){
		double porto=0.0;
		porto = 4.55;
		
		porto = porto + (int) (gewicht / 1000 * 1);
		
		return porto;
	}
	
	
	@Override
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
		System.out.println("Absender: " +
				this.absender.vorname
				);
		System.out.println("Gewicht: " +
				this.gewicht
				);
		System.out.println("Tefe: " +
				this.tiefe
				);
	}
	
}
