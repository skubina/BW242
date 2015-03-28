package org.hslu.bw242.v1;

public class StaticRechner {

	public static double addieren(double zahl1, double zahl2) {
		return zahl1 + zahl2;
	}

	public static double subtrahieren(double zahl1, double zahl2) {
		return zahl1 - zahl2;
	}

	public static double multiplizieren(double zahl1, double zahl2) {
		return zahl1 * zahl2;
	}

	public static double dividieren(double zahl1, double zahl2) {
		return zahl1 / zahl2;
	}

	public static double zufallszahl() {
		return (Math.random() * 100);
	}
}
