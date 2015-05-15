package org.hslu.bw242.v4u;

public class Throws {

	public static void main(String[] args) {
		try {
			new Throws().doSomething();
		} catch (Exception e) {
		}
	}
	
	public void doSomething() throws Exception{
		int i = 1;
		while(i != 0){
			System.out.println(10 / i);
			i = (int) (Math.random()*10);
		}
	}

}
