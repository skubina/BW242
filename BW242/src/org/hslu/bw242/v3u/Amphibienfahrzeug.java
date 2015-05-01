package org.hslu.bw242.v3u;

public class Amphibienfahrzeug implements PKW, Boot {
	Motor motor;
	Fahrgastzelle fahrgastzelle;

	@Override
	public void fahren() {
		System.out.println("Das Fahrzeug fährt auf der Straße oder auf dem Wasser");
	}

}
