package org.hslu.bw242.klausurVormittag;

public class Piek  implements PiekIntf{

	
	
	public Piek() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Piek(String wert) {
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

	String wert;

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
}
