package org.hslu.bw242.klausurNachmittag;

public class Hausmeister extends Personal {
	
	
	
	public Hausmeister() {
		super();
		// TODO Auto-generated constructor stub
	}

	boolean schichtdienst;

	public boolean isSchichtdienst() {
		return schichtdienst;
	}

	public void setSchichtdienst(boolean schichtdienst) {
		this.schichtdienst = schichtdienst;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String buffer = this.getClass().getSimpleName() + " " + this.anschrift + " " + this.name + " " + this.schichtdienst + " " + this.persNR;
		
		System.out.println(buffer);
		
		return buffer;
	}
	

}
