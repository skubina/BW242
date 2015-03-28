package org.hslu.bw242.v1;

public class CalcPreis {
	
	double nettopreis;
	double steuer;
	double rabatt;
	String waehrung;
	
	
	
	public double getBruttoPreis(){
		return this.nettopreis * (1 + (this.steuer / 100));
	}
	
	public double getRabattNettopreis(){
		return this.nettopreis * (1 - (this.rabatt / 100));
	}
	
	public double getRabattBruttopreis(){
		return this.getRabattNettopreis() * (1 + (this.steuer / 100));
	}
	
	public void printCalcPreis(){
		System.out.println("Nettopreis: " + this.nettopreis +  " " + this.waehrung);
		System.out.println("Bruttopreis: " + this.getBruttoPreis() +  " " + this.waehrung);
		
		System.out.println("Rabattierter Nettopreis: " + this.getRabattNettopreis() +  " " + this.waehrung);
		System.out.println("Rabattierter Bruttopreis: " + this.getRabattBruttopreis() +  " " + this.waehrung);
		
		System.out.println("Steuer: " + this.steuer +  " %");
		System.out.println("Rabatt: " + this.rabatt +  " %");
	}
	
	
	
	
	
	
	public double getNettopreis() {
		return nettopreis;
	}
	public void setNettopreis(double nettopreis) {
		this.nettopreis = nettopreis;
	}
	public double getSteuer() {
		return steuer;
	}
	public void setSteuer(double steuer) {
		this.steuer = steuer;
	}
	public double getRabatt() {
		return rabatt;
	}
	public void setRabatt(double rabatt) {
		this.rabatt = rabatt;
	}
	public String getWaehrung() {
		return waehrung;
	}
	public void setWaehrung(String waehrung) {
		this.waehrung = waehrung;
	}
	
	
	
	

}
