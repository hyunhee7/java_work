package test.main;

public class MainClass04 {
	public static void main(String[] args) {
		int[] nums={10, 20, 30, 40, 50};
		
		for(int i=0;i<nums.length;i++){
			int tmp=nums[i];
			int test=tmp;
		}
		//확장 for문
		//for( 배열에 저장된 data type tmp : 배열의 참조값 )
		for(int tmp : nums){
			int test=tmp;
		}
	}
}
