package test.main;

import test.mypac.Bakery;

public class MainClass02 {
	public static void main(String[] args) {
		new Bakery("파리크라상").getBread().eat();
		new Bakery("빵").eatCola();
	}
}
