package test.main;

import test.mypac.Weapon;

public class MainClass03 {
	public static void main(String[] args) {
		//익명의 local innerClass 를 이용해서 Weapon type 객체의
		//참조값을 얻어내서 변수에 담는다.
		Weapon w1=new Weapon(){
			@Override
			public void attack() {
				System.out.println("김구라를 공격합니다.");
			}
		};
		//메소드 호출
		w1.prepare();
		w1.attack(); 
		
		Weapon w2=new Weapon() {
			
			@Override
			public void attack() {
				System.out.println("옆반 쌤을 공격해요");
			}
		};
		w2.prepare();
		w2.attack();
	}
}
