package org.hslu.bw242.v2u;

public class ErbendeKlasse extends VererbendeKlasse{
	
	String attribute2;
	
	public boolean checkType(Object obj){
		if(obj instanceof ErbendeKlasse){			
			return true;
		}else{
			
			System.out.println(
					obj.getClass().getName()
					);
			
			return false;
		}
	}
	
	@Override
	public String toString(){
		return attribute1 + " " + attribute2;
	}
	
}
