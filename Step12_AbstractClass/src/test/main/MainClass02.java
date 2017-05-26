package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;
import test.mypac.YourWeapon;

public class MainClass02 {
	public static void main(String[] args) {
		//MyWeapon 객체를 생성해서 Weapon type으로 받은 다음
		Weapon w1 = new MyWeapon();
		//메소드 호출하기
		w1.prepare();
		w1.attack();
		
		Weapon w2 = new YourWeapon();
		w2.prepare();
		w2.attack();
	}
}
