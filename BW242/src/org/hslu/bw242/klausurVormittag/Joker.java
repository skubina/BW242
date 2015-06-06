package org.hslu.bw242.klausurVormittag;

public class Joker implements PiekIntf, KaroIntf, HerzIntf, KreuzIntf{

	String wert;
	
	
	
	public Joker() {
		super();
		wert = "13";
	}



	@Override
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
