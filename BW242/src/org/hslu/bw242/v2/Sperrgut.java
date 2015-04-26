package org.hslu.bw242.v2;

public class Sperrgut extends Versandgut {
	
	double volumen;
	double gewicht;
	Adresse absender;
	
	
	Status[] statusArray;

	public void tracing() {

		int laenge = statusArray.length;
		int counter = 0;

		while (counter < laenge && this.statusArray[counter] != null) {
			System.out.println(this.statusArray[counter].getInformation());
			System.out.println(this.statusArray[counter].getZeitpunkt());
			counter++;
		}

	}
	
	@Override
	public double berechnePorto(){
		double porto=0.0;
		porto = 8.55;
		
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
		System.out.println("Volumen: " +
				this.volumen
				);
		System.out.println("Absender: " +
				this.absender.vorname
				);
		System.out.println("Gewicht: " +
				this.gewicht
				);
		this.tracing();
	}
	
	

}
