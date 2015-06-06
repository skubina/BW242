package org.hslu.bw242.klausurNachmittag;

public class Professor extends Personal implements Lehrkraft{

	
	
	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}

	boolean verbeamtet;

	public boolean isVerbeamtet() {
		return verbeamtet;
	}

	public void setVerbeamtet(boolean verbeamtet) {
		this.verbeamtet = verbeamtet;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String buffer = this.getClass().getSimpleName() + " " + this.anschrift + " " + this.name + " " + this.verbeamtet + " " + this.persNR;
		
		System.out.println(buffer);
		
		return buffer;
	}

	@Override
	public void vorlesungHalten(Fach fach) {
		// TODO Auto-generated method stub
		System.out.println(fach.getName());
		System.out.println(fach);
	}
	
	
	
}
