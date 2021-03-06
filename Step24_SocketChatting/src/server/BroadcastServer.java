package server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
/*
 *  [ 문자열 전송 약속 ]
 *  
 *  0#id				=> 새로운 클라이언트 접속 메세지
 *  1#id#message		=> 대화 메세지
 *  2#id				=> 대화방 탈퇴 메세지
 *  3#id1,id2,id3 ...	=> 대화 참여자 목록 메세지
 *
 */ 
public class BroadcastServer {
	 //멤버필드
	static List<ServerThread> threadList;
	
	public static void main(String[] args) {
		//ArrayList 객체 생성해서 참조값을 static 멤버필드에 저장
		threadList=new ArrayList<>();
		ServerSocket serverSocket=null;
		try{
			serverSocket=new ServerSocket(5000);
			while(true){
				System.out.println("클라이언트의 접속을 대기...");
				Socket socket=serverSocket.accept();
				/*
				 * 생성자의 인자로 클라이언트와 연결된 Socket 객체를
				 * 전달하면서 객체를 생성하고 스레드를 시작 시킨다.
				 */
				ServerThread thread=new ServerThread(socket);
				thread.start();
				//생성한 스레드 객체의 참조값을 List에 누적시킨다.
				threadList.add(thread);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(serverSocket!=null)serverSocket.close();
			}catch(Exception e){}
		}
	}
	//스레드 객체를 생성할 클래스를 inner class 로 정의하기
	public static class ServerThread extends Thread{
		//멤버 필드
		Socket socket;
		//생성자
		public ServerThread(Socket socket){
			this.socket=socket; //생성자의 인자로 socket객체를 받음
		}
		@Override
		public void run() {
			BufferedReader br=null;
			BufferedWriter bw=null;
			try{
				br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
				bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				boolean isRun=true;
				//반복문 돌면서 읽어들인다.
				while(isRun){
					//전송된 문자열이 있으면 한줄 읽어들이기
					String msg=br.readLine();
					if(msg==null){ // null 이면 접속이 끊긴 상태
						isRun=false;
					}else{
						//#으로 구분해서 문자열을 배열로 얻어온다.
						String[] result=msg.split("#"); //정규표현식 들어갈 수 있는 자리
						//String[] 의 0번방 참조
						int msgType=Integer.parseInt(result[0]);
						// 0 or 1 or 2 or 3 이다
						switch(msgType){
						case 0: //새로운 참여자 입장
							System.out.println(result[1]+"님 입장");
							break;
						case 1: //새로운 대화 메세지
							
							break;
						case 2: //참여자 퇴장
							
							break;
						case 3: //참여자 목록
							
							break;
						}
						
					}
				}
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				try{
					if(br!=null)br.close();
					if(bw!=null)bw.close();
					if(socket!=null)socket.close();
				}catch(Exception e){}
			}
		}
	}
}
