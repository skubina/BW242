package org.hslu.bw242.v3;

public class ZooKeeper {

	Object[] tierArray = new Object[100];
	Object[] aquarium = new Object[100];
	Object[] kaefig = new Object[100];
	Object[] freigehaege = new Object[100];
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ZooKeeper thisKeeper = new ZooKeeper();
		
		thisKeeper.generiereTiere();
		thisKeeper.behauseTiere();
	}
	
	
	public void generiereTiere(){
		double zahl = 0;
		
		int affen = 0;
		int fische = 0;
		int hunde = 0;
		int kuehe = 0;
		int voegel = 0;
		
		for (int i = 0; i < 100; i++) {
			zahl = Math.random();
			
			if (zahl < 0.2){
				tierArray[i] = new Affe();
				affen++;
			} else if(zahl < 0.4){
				tierArray[i] = new Fisch();
				fische++;
			} else if(zahl < 0.6){
				tierArray[i] = new Hund();
				hunde++;
			} else if(zahl < 0.8){
				tierArray[i] = new Kuh();
				kuehe++;
			} else if(zahl < 1){
				tierArray[i] = new Vogel();
				voegel++;
			}
			
		}
		
		System.out.println("Affen: " + affen);
		System.out.println("Fische: " + fische);
		System.out.println("Hunde: " + hunde);
		System.out.println("Kuehe: " + kuehe);
		System.out.println("Vögel: " + voegel);
	}
	
	
	
	
	
	
	
	
	
	
	
	public void behauseTiere(){
		
		int counterKaefig = 0;
		int counterGehaege = 0;
		int counterAquarium = 0;
		
		for (int i = 0; i < tierArray.length; i++) {
			if(tierArray[i] instanceof Fliegen){
				kaefig[counterKaefig] = tierArray[i];
				counterKaefig++;
			}else if(tierArray[i] instanceof Laufen){
				freigehaege[counterGehaege] = tierArray[i];
				counterGehaege++;
			} else if(tierArray[i] instanceof Tauchen){
				aquarium[counterAquarium] = tierArray[i];
				counterAquarium++;
			}
		}
		
		this.druckeBehausung(counterAquarium, aquarium, "Aquarium");
		this.druckeBehausung(counterGehaege, freigehaege, "Freigehäge");
		this.druckeBehausung(counterKaefig, kaefig, "Käfig");
	}

	public void druckeBehausung(int counter, Object[] behausung, String name){
		
		int affen = 0;
		int fische = 0;
		int hunde = 0;
		int kuehe = 0;
		int voegel = 0;
		
		for (int i = 0; i <= counter; i++) {
			
			if(behausung[i] instanceof Affe){
				affen++;
			}else if(behausung[i] instanceof Fisch){
				fische++;
			} else if(behausung[i] instanceof Hund){
				hunde++;
			} else if(behausung[i] instanceof Kuh){
				kuehe++;
			} else if(behausung[i] instanceof Vogel){
				voegel++;
			}
		}
		
		System.out.println("\n"+ name);
		System.out.println("Affen: " + affen);
		System.out.println("Fische: " + fische);
		System.out.println("Hunde: " + hunde);
		System.out.println("Kuehe: " + kuehe);
		System.out.println("Vögel: " + voegel);
	}

}
