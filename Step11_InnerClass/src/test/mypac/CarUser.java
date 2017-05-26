package test.mypac;
/*
 * 익명의 클래스를 이용해서 특정 메소드를 간단히 재정의 하기
 */
public class CarUser {
	//멤버 필드
	public Car car = new Car(){
		@Override
		public void drive() {
			System.out.println("내 마음대로 달려요");
		}
	};
	//멤버 메소드 
	public void useCar(){
		Car car = new Car(){ //익명의 local innerClass
			@Override
			public void drive() {
				System.out.println("달릴까? 말까?");
			}
		};
		car.drive();
	}
	//멤버 메소드
	public void useCar2(){
		new Car(){
			@Override
			public void drive() {
				System.out.println("천천히 달리자");
			}
		}.drive();
	}
	
}
