package org.hslu.bw242.v4u;

public class Absturz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try{			
			int i = 1;
			while(i != 0){
				System.out.println(10 / i);
				i = (int) (Math.random()*10);
			}
		}catch (Exception e){
			//e.printStackTrace();
			System.out.println("Ein Fehler ist aufgetreten!");
		}
		//System.out.println("Aber läuft noch!");
		
	}

}
