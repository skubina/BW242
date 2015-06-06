package org.hslu.bw242.klausurVormittag;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;


public class KartenApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashSet<Spielkarte> stapel = new HashSet<Spielkarte>();
		
		
		
		stapel.add(new Piek("2"));
		stapel.add(new Piek("3"));
		stapel.add(new Piek("4"));
		stapel.add(new Piek("5"));
		stapel.add(new Piek("6"));
		stapel.add(new Piek("7"));
		stapel.add(new Piek("8"));
		stapel.add(new Piek("9"));
		stapel.add(new Piek("10"));
		stapel.add(new Piek("König"));
		stapel.add(new Piek("Bube"));
		stapel.add(new Piek("Dame"));
		stapel.add(new Piek("Ass"));
		
		stapel.add(new Kreuz("2"));
		stapel.add(new Kreuz("3"));
		stapel.add(new Kreuz("4"));
		stapel.add(new Kreuz("5"));
		stapel.add(new Kreuz("6"));
		stapel.add(new Kreuz("7"));
		stapel.add(new Kreuz("8"));
		stapel.add(new Kreuz("9"));
		stapel.add(new Kreuz("10"));
		stapel.add(new Kreuz("König"));
		stapel.add(new Kreuz("Bube"));
		stapel.add(new Kreuz("Dame"));
		stapel.add(new Kreuz("Ass"));
		
		stapel.add(new Karo("2"));
		stapel.add(new Karo("3"));
		stapel.add(new Karo("4"));
		stapel.add(new Karo("5"));
		stapel.add(new Karo("6"));
		stapel.add(new Karo("7"));
		stapel.add(new Karo("8"));
		stapel.add(new Karo("9"));
		stapel.add(new Karo("10"));
		stapel.add(new Karo("König"));
		stapel.add(new Karo("Bube"));
		stapel.add(new Karo("Dame"));
		stapel.add(new Karo("Ass"));
		
		stapel.add(new Herz("2"));
		stapel.add(new Herz("3"));
		stapel.add(new Herz("4"));
		stapel.add(new Herz("5"));
		stapel.add(new Herz("6"));
		stapel.add(new Herz("7"));
		stapel.add(new Herz("8"));
		stapel.add(new Herz("9"));
		stapel.add(new Herz("10"));
		stapel.add(new Herz("König"));
		stapel.add(new Herz("Bube"));
		stapel.add(new Herz("Dame"));
		stapel.add(new Herz("Ass"));
		
		stapel.add(new Joker());
		stapel.add(new Joker());
		stapel.add(new Joker());
		stapel.add(new Joker());
		
		Iterator<Spielkarte> iter = stapel.iterator();
		
		LinkedList<Spielkarte> hand1 = new LinkedList<Spielkarte>();
		LinkedList<Spielkarte> hand2 = new LinkedList<Spielkarte>();
		
		for (int i = 0; i < 7; i++) {
			hand1.add(iter.next());
		}
		for (int i = 0; i < 7; i++) {
			hand2.add(iter.next());
		}
		
		Iterator<Spielkarte> hand1iter = hand1.iterator();
		Iterator<Spielkarte> hand2iter = hand2.iterator();
		
		int piek1 = 0;
		int piek2 = 0;
		
		int herz1 = 0;
		int herz2 = 0;
		
		int karo1 = 0;
		int karo2 = 0;
		
		int kreuz1 = 0;
		int kreuz2 = 0;
		
		while(hand1iter.hasNext()){
			Spielkarte temp = hand1iter.next();
			
			if(temp instanceof Piek){
				piek1 = piek1 + temp.getZahlenWert();
			} else if(temp instanceof Kreuz){
				kreuz1 = kreuz1 + temp.getZahlenWert();
			} else if(temp instanceof Herz){
				herz1 = herz1 + temp.getZahlenWert();
			} else if(temp instanceof Karo){
				karo1 = karo1 + temp.getZahlenWert();
			} else if(temp instanceof Joker){
				karo1 = karo1 + temp.getZahlenWert();
				herz1 = herz1 + temp.getZahlenWert();
				kreuz1 = kreuz1 + temp.getZahlenWert();
				piek1 = piek1 + temp.getZahlenWert();
			} 
		}
		
		while(hand2iter.hasNext()){
			Spielkarte temp = hand2iter.next();
			
			if(temp instanceof Piek){
				piek2 = piek2 + temp.getZahlenWert();
			} else if(temp instanceof Kreuz){
				kreuz2 = kreuz2 + temp.getZahlenWert();
			} else if(temp instanceof Herz){
				herz2 = herz2 + temp.getZahlenWert();
			} else if(temp instanceof Karo){
				karo2 = karo2 + temp.getZahlenWert();
			} 
		}
		
		int max1 = 0;
		int max2 = 0;
		
		
		
		max1 = piek1;
		max1 = Math.max(max1, kreuz1);
		max1 = Math.max(max1, karo1);
		max1 = Math.max(max1, herz1);
		
		max2 = piek2;
		max2 = Math.max(max2, kreuz2);
		max2 = Math.max(max2, karo2);
		max2 = Math.max(max2, herz2);
		
		System.out.println(max1);
		System.out.println(max2);
		
		if(max1 > max2){
			System.out.println("Spieler 1 gewinnt");
		} else if (max2 > max1){
			System.out.println("Spieler 2 gewinnt");
		} else {
			System.out.println("Unentschieden");
		}
		
		
	}

}
