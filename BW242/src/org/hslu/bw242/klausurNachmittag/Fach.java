package org.hslu.bw242.klausurNachmittag;

public class Fach {
	
	String name;
	Lehrkraft lehrkraft;
	
	

	public Fach(String name, Lehrkraft lehrkraft) {
		super();
		this.name = name;
		this.lehrkraft = lehrkraft;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Lehrkraft getLehrkraft() {
		return lehrkraft;
	}

	public void setLehrkraft(Lehrkraft lehrkraft) {
		this.lehrkraft = lehrkraft;
	}
	
	

}
