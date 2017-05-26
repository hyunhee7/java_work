package test.main;

import test.mypac.Person;

public class MainClass05 {
	public static void main(String[] args) {
		Person p1= new Person(15, 33, "kim");
		Person p2= new Person(22, 49, "han");
		Person p3= new Person(39, 67, "lanfh");
		
		p1.showInfo();
		p2.showInfo();
		p3.showInfo();
	}
}

