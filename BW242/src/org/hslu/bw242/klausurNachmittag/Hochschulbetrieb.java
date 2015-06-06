package org.hslu.bw242.klausurNachmittag;

import java.util.Iterator;

public class Hochschulbetrieb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dozent d1 = new Dozent();
		Hausmeister h1 = new Hausmeister();
		Professor p1 = new Professor();
		Student s1 = new Student();
		
		d1.setAnschrift("Meine Anschrift");
		d1.setName("Dozent Name");
		d1.setPersNR(123);
		
		h1.setAnschrift("");
		h1.setName("");
		h1.setPersNR(234);
		h1.setSchichtdienst(true);
		
		p1.setAnschrift("");
		p1.setName("Prof");
		p1.setPersNR(345);
		p1.setVerbeamtet(true);
		
		s1.setAnschrift("AnschriftStudent");
		s1.setName("Student");
		s1.setMatrNR(617666);
		
		s1.toString();
		p1.toString();
		h1.toString();
		d1.toString();
		
		
		Fach f1 = new Fach("BWL", d1);
		Fach f2 = new Fach("BWL2", d1);
		Fach f3 = new Fach("BWL3", d1);
		
		Fach f4 = new Fach("Programmieren", d1);
		Fach f5 = new Fach("Programmieren2", p1);
		Fach f6 = new Fach("Programmieren3", p1);
		
		s1.getFächer().add(f1);
		s1.getFächer().add(f2);
		s1.getFächer().add(f3);
		s1.getFächer().add(f4);
		s1.getFächer().add(f5);
		s1.getFächer().add(f6);
		
		System.out.println();
		
		Iterator<Fach> iter1 = s1.getFächer().iterator();
		Iterator<Fach> iter2 = s1.getFächer().iterator();
		
		while(iter1.hasNext()){
			
			Fach temp = iter1.next();
			
			if(temp.getLehrkraft() instanceof Dozent){
				System.out.println(temp.getName());
			}
			
			
		}
		System.out.println();
		while(iter2.hasNext()){
			
			Fach temp = iter2.next();
			
			if(temp.getLehrkraft() instanceof Professor){
				System.out.println(temp.getName());
			}	
		}
	}

}
