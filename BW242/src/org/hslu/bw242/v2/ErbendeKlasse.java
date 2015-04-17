package org.hslu.bw242.v2;

public class ErbendeKlasse extends VererbendeKlasse{
	
	String attribute2;
	
	public boolean checkType(Object obj){
		if(obj instanceof ErbendeKlasse){
			return true;
		}else{
			return false;
		}
	}
	
}
