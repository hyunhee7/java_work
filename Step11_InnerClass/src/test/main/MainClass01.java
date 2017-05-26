package test.main;

import test.mypac.Bakery;
import test.mypac.Bakery.Bread;

public class MainClass01 {
	public static void main(String[] args) {
		new Bakery("종로지점").getBread().eat();
		
		//위의 작업을 세줄로 표현하면
		Bakery bakery = new Bakery("을지로지점");
		Bread bread=bakery.getBread();
		bread.eat();
		
		new Bakery("시청지점").eatCola();
	}
}
