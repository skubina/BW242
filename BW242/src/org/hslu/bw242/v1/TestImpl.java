package org.hslu.bw242.v1;

public class TestImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("-- statische Methoden --");
		
		double zahl1 = 10.0;
		double zahl2 = 5.0;

		System.out.println(StaticRechner.addieren(zahl1, zahl2));
		System.out.println(StaticRechner.subtrahieren(zahl1, zahl2));
		System.out.println(StaticRechner.multiplizieren(zahl1, zahl2));
		System.out.println(StaticRechner.dividieren(zahl1, zahl2));
		

		System.out.println("\n-- Methoden --");

		//Rechner myRechner2 = new Rechner();
		
		Rechner myRechner = new Rechner();
		myRechner.setZahl1(10.0);
		myRechner.setZahl2(5.0);
		
		System.out.println(myRechner.addieren());
		System.out.println(myRechner.subtrahieren());
		System.out.println(myRechner.multiplizieren());
		System.out.println(myRechner.dividieren());
		
		
		System.out.println("\n -- CalcPreis --");
		CalcPreis preis = new CalcPreis();
		
		preis.setNettopreis(200);
		preis.setSteuer(19);
		preis.setRabatt(5.5);
		preis.setWaehrung("EUR");
		preis.printCalcPreis();
		
		
		System.out.println("\n -- CalcPreis 2 --");
		CalcPreis preis2 = new CalcPreis();
		
		preis2.setNettopreis(230);
		preis2.setSteuer(22);
		preis2.setRabatt(1);
		preis2.setWaehrung("EUR");
		preis2.printCalcPreis();

	}

}
