package test.main;

import test.mypac.Apple;
import test.mypac.AppleBox;
import test.mypac.FruitBox;
import test.mypac.Orange;
import test.mypac.OrangeBox;

public class MainClass01 {
	public static void main(String[] args) {
		//AppleBox 객체를 생성해서
		AppleBox box1=new AppleBox();
		//Apple객체 담기
		box1.push(new Apple());
		
		//OrangeBox 객체 생성해서
		OrangeBox box2=new OrangeBox();
		//Orange객체 담기
		box2.push(new Orange());
		
		FruitBox<Apple> box3=new FruitBox<Apple>();
		box3.push(new Apple());
		Apple app=box3.pull().add();
		FruitBox<Orange> box4=new FruitBox<Orange>();
		box4.push(new Orange());
		
	}
}

