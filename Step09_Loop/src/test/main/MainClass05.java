package test.main;

import test.mypac.Beer;

public class MainClass05 {
	public static void main(String[] args) {
		String[] names={"김구라","해골","원숭이","주뎅이","덩어리"};
		
		//names 배열을 이용해서 확장 for 문을 구성해 보세요
		for(String tmp:names){
			String test=tmp;
			System.out.println(test);
		}
		
		//방 5개 짜리 Beer[] 객체를 생성해서
		//5개의 방에 Beer 객체의 참조값을 넣고
		//확장 for문을 이용해서 객체의 .drink() 메소드를 호출해보세요
		Beer[] beers=new Beer[5];
		
		for(int i=0;i<beers.length;i++){
			beers[i]=new Beer("시원한 ");
		}
		
		for(Beer tmp:beers){
			tmp.drink();
		}
		
	}
}
