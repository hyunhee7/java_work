package test.main;

import java.util.Random;

/*
 *  실행 했을 때 
 *  
 *  로또 번호 6개를 무작위로 콘솔창에 출력하는 코드를 작성해 보세요
 *  
 *  로또 번호 : 1~45 범위의 숫자중에서 중복되지 않는 6개의 숫자
 */
public class MainClass10 {
	public static void main(String[] args) {
		int[] num=new int[6];
		Random ran = new Random();
		for(int i=0; i<num.length; i++){
			num[i] = ran.nextInt(45)+1;
				for(int j=0; j<i;j++){
					if(num[i]==num[j]){
						i--;
						break;
					}
				}
		}

		for(int i=0;i<num.length;i++){
			System.out.println(num[i]);
		}

	}
}
