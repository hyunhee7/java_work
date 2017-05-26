package test.main;

import test.mypac.AttackUnit;

public class MainClass02 {
	public static void main(String[] args) {
		//AttackUnit 객체를 생성해서 attack() 메소드를 호출해 보세요.
		new AttackUnit().attack();
		new AttackUnit(10).attack();
		
		AttackUnit unit = new AttackUnit();
		AttackUnit unit1 = new AttackUnit(20);
		unit.attack();
		unit.attack();
		unit1.attack();
		unit1.attack();
	}
}

