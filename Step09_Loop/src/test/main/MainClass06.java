package test.main;
/*
 * - 반복문 while
 * 
 * while(조건){
 * 	
 * }
 * 
 * 조건이 true 인 동안에 계속 반복 수행된다.
 */
public class MainClass06 {
	public static void main(String[] args) {
		int i=0;
		while(i<5){
			System.out.println(i);
			i++;
		}
		System.out.println("-------------");
		int j=0;
		while(true){
			System.out.println(j);
			j++;
			if(j==5){
				//인접한 반복문 블럭 탈출하기
				break;
			}
		}
	}
}
