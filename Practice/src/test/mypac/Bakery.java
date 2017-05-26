package test.mypac;

public class Bakery {
	public String branch;
	public Bakery(String branch){
		this.branch=branch;
	}
	
	public class Bread{
		public void eat(){
			System.out.println(branch+"현희에게 빵을 투척해요!");
		}
	}
	
	public Bread getBread(){
		return new Bread();
	}
	
	public void eatCola(){
		class Cola{
			public void drink(){
				System.out.println("콜라마셔라");
			}
		};
		new Cola().drink();
	}
	
}
