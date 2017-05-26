package test.main;

import test.mypac.Remocon;

public class MainClass02 {
	public static void main(String[] args) {
		Remocon a= new Remocon() {
			
			@Override
			public void up() {
				System.out.println("볼륨을 올려요!");
			}
			
			@Override
			public void down() {
				System.out.println("볼륨을 내려요!");
			}
		};
		//메소드 호출하기
		a.up();
		a.down();
	}
}

