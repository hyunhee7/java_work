package test.mypac;

public class Car {
	public int carnum;
	public String name;
	public Car(){
		
	}	
	public Car(int carnum){
		this.carnum=carnum;
	}
	public Car(int carnum, String name){
		this.carnum=carnum;
		this.name=name;
	}
	//일반 멤버 메소드
	public void drive(){
		System.out.println("조낸 달려요!");
		System.out.println("차번호:"+carnum);
	}
}

