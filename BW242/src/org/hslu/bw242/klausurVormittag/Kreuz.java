package org.hslu.bw242.klausurVormittag;

public class Kreuz  implements KreuzIntf{
	
	String wert;
	int intEins = 1;
	int intZwei = 2;
	
	String stringEins = "ass";
	String stringZwei= stringEins;
	String ass = "ass";
	
	public String getWert() {
		return wert;
		
		
		
		
		
		
	}

	public void setWert(String wert) {
		this.wert = wert;
	}


	
	
	
	public int getZahlenWert(){
		if(this.wert.equals("Dame") || this.wert.equals("Bube") || this.wert.equals("König") ){
			return 12;
		} else if (this.wert.equals("Ass") ){
			return 13;
		} else {
			return Integer.parseInt(this.wert);
		}
	}
	
	public Kreuz() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Kreuz(String wert) {
		this.wert = wert;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getSimpleName());
		System.out.println("Wert: " + this.wert);
		return this.wert;
	}

}
