package test.main;

import java.util.HashSet;
import java.util.Iterator;

/*
 *  HashSet
 *  
 *  - 순서가 없다
 *  - 키값도 없다
 *  - 중복을 허용하지 않는다.
 */
public class MainClass11 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		//set interface가 있다.
		set.add("김구라");
		set.add("해골");
		set.add("원숭이");
		set.add("주뎅이");
		set.add("덩어리");
		set.add("김구라");
		set.add("해골");
		System.out.println("set.size() : " +set.size());
		
		//.iterator() 메소드를 이용해서 Iterator(반복자) 객체를 얻어온다
		Iterator<String> it=set.iterator();
		//cursor 다음에 데이터가 있는지 확인해서 있는동안에만
		//반복문 수행한다
		while(it.hasNext()){
			//커서를 한칸 내리고 해당 커서가 위치한 곳의 data를 얻어온다.
			String tmp=it.next();
			System.out.println(tmp);
		}
		
	}
}
