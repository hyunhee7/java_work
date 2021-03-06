package test.main;

import java.io.File;

public class MainClass03 {
	public static void main(String[] args) {
		String path="c:/";
		File file=new File(path);
		
		// c:/ 에 어떤 폴더와 어떤 파일이 존재하는지 목록을
		// 콘솔창에 출력해 보세요.

		String[] list= file.list();
		for(String tmp:list){
			System.out.println("파일명:"+tmp);
		}
		System.out.println("-----------------------------------");
		//File 객체 목록을 얻어온다.
		File[] files=file.listFiles();
		//반복문 돌면서 File 객체의 참조값을 하나씩 빼내서
		for(File tmp:files){
			//파일 혹은 디렉토리의 이름을 읽어온다.
			String name=tmp.getName();
			if(tmp.isDirectory()){
				System.out.println("[d] "+name);
			}else{
				System.out.println("[f] "+name);
			}
		}
	}
}
