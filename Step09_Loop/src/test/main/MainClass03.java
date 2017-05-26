package test.main;

import test.mypac.Beer;

public class MainClass03 {
	public static void main(String[] args) {
		//1. Beer type 데이터를 담을 수 있는 방 3개짜리 배열객체를 생성해서
		//배열 객체의 참조값을 beers 라는 이름의 지역변수에 담아 보세요
		Beer[] beers=new Beer[3];
		
		//2. Beer 배열의 3개의 방에 Beer 객체의 참조값을 각각 담아 보세요
		beers[0]=new Beer("맛있는 ");
		beers[1]=new Beer("ALE ");
		beers[2]=new Beer("시원한 ");
		
		//3. for 문을 이용해서 배열에 저장된 참조값을 tmp라는 변수에
		//순서대로 담아보는 코드를 작성해 보세요
		for(int i=0;i<3;i++){
			Beer tmp=beers[i];
			//Beer 객체의 메소드 호출하기
			tmp.drink();
		}
	}
}
