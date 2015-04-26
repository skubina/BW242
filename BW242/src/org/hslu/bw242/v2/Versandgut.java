package org.hslu.bw242.v2;

public class Versandgut {

	org.hslu.bw242.v2.Adresse adressat;
	
	

	public double berechnePorto(){
		double porto=0.0;
		
		if(this instanceof Postkarte){
			porto = 0.55;
		} else if (this instanceof Brief){
			porto = 0.65;
		} else if (this instanceof Paeckchen){
			porto = 4.55;
		} else if (this instanceof Paket){
			porto = 5.55;
		} else if (this instanceof Sperrgut){
			porto = 8.55;
		}
		
		return porto;
	}

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
	}

}
