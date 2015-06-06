package org.hslu.bw242.klausurNachmittag;

public abstract class Person{
	
	abstract public String toString();
	
	String name;
	String anschrift;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAnschrift() {
		return anschrift;
	}
	public void setAnschrift(String anschrift) {
		this.anschrift = anschrift;
	}

	
}
