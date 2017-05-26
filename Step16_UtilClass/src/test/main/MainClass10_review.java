package test.main;

import java.util.Random;

/*
 *  실행 했을 때 
 *  
 *  로또 번호 6개를 무작위로 콘솔창에 출력하는 코드를 작성해 보세요
 *  
 *  로또 번호 : 1~45 범위의 숫자중에서 중복되지 않는 6개의 숫자
 */
public class MainClass10_review {
	public static void main(String[] args) {
		int[] arr=new int[6];
		Random ran = new Random();
		for(int i=0;i<arr.length;i++){
			arr[i]=ran.nextInt(45)-1;
			for(int j=0;j<i;j++){
				if(arr[j]==arr[i]){
					i--;
					break;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}

	}
}
