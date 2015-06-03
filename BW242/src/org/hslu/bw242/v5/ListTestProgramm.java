package org.hslu.bw242.v5;

import java.util.LinkedList;

public class ListTestProgramm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ListNode linkedList = new ListNode("Test");
		
		linkedList.addNode("Eins");
		linkedList.addNode("Zwei");
		linkedList.addNode("Drei");
		linkedList.addNode("Vier");
		linkedList.addNode("Fünf");
		linkedList.addNode("Sechs");
		linkedList.addNode("Sieben");
		linkedList.addNode("Acht");
		
		System.out.println(
				linkedList.getCargoAtIndex(2).toString()
				);

	}

}
