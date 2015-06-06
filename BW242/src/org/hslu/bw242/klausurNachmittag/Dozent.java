package org.hslu.bw242.klausurNachmittag;

public class Dozent extends Personal implements Lehrkraft {

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String buffer = this.getClass().getSimpleName() + " " + this.anschrift + " " + this.name +  " " + this.persNR;
		
		System.out.println(buffer);
		
		return buffer;
	}

	@Override
	public void vorlesungHalten(Fach fach) {
		// TODO Auto-generated method stub
		System.out.println(fach.getName());
	}
	

}
