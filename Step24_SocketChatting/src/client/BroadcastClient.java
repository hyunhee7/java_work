package client;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class BroadcastClient extends JFrame{
	//접속할 서버의 ip 주소와 클라이언트의 아이디(이름)
	private String ip, id;
	private JTextArea jta; //챗팅의 내용을 출력할 곳
	private JTextField jtf; //전송할 메세지를 작성할 곳
	private JLabel jlb1, jlb2; //레이블
	private JPanel jp1, jp2, jp3; //패널
	private JButton jbtn; //전송버튼
	private JList jlist; //접속자 명단을 출력할 곳
	//문자열을 읽어들이거나 출력할 객체
	private BufferedReader br;
	private BufferedWriter bw;
	
	//생성자
	public BroadcastClient(String ip, String id){
		this.ip=ip;
		this.id=id;
		//메세지를 입력할 TextField
		jtf=new JTextField(30);
		//전송버튼 
		jbtn=new JButton("전송");
		//페널객체 생성
		jp1=new JPanel();
		//페널 내부에서의 레이아웃 설정
		jp1.setLayout(new BorderLayout());
		jp1.add(jtf, BorderLayout.CENTER);
		jp1.add(jbtn, BorderLayout.EAST);
		
		//프레임의 레이아웃 설정 
		setLayout(new BorderLayout());
		add(jp1, BorderLayout.SOUTH);
		
		//접속 정보 출력하기 
		jlb1=new JLabel("사용자 id:"+id);
		jlb2=new JLabel("ip:"+ip);
		jp2=new JPanel();
		jp2.setLayout(new BorderLayout());
		jp2.add(jlb1, BorderLayout.WEST);
		jp2.add(jlb2, BorderLayout.EAST);
		
		add(jp2, BorderLayout.NORTH);
		
		// row : 10, col : 50  사이즈의 TextArea 객체 생성
		jta = new JTextArea("", 10, 50);
		jta.setBackground(Color.pink); //배경색을 핑크색으로
		//스크롤 가능하도록
		JScrollPane jsp=new JScrollPane(jta,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,   //수직 스크롤바 생기도록
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER); //수평 스크롤바 불가
		add(jsp, BorderLayout.CENTER);
		
		//접속자 명단에 관련된 처리
		String[] names={"접속자 명단"};
		jlist=new JList(names);
		jlist.setBackground(Color.yellow);
		jp3=new JPanel();
		jp3.setLayout(new BorderLayout());
		jp3.add(jlist, BorderLayout.CENTER);
		
		add(jp3, BorderLayout.EAST);
		
		//TextArea 수정 불가 
		jta.setEditable(false);
		
		//프레임의 위치와 크기 지정 
		setBounds(100, 100, 500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//소켓 접속을 할 스레드 객체를 생성하고 시작 시킨다.
		new ClientThread().start();
	}
	//서버에서 전달되는 문자열을 받을 스레드
	public class ClientThread extends Thread{
		@Override
		public void run() {
			Socket socket=null;
			try{
				//서버에 소켓 접속하기
				socket=new Socket(ip, 5000);
				//문자열을 읽어들일 객체, 바깥쪽 클래스의 필드
				br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
				//문자열을 출력할 객체, 바깥쪽 클래스의 필드
				bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				//채팅방 입장에 관련된 메세지를 서버에 보낸다.
				bw.write("0#"+id);
				bw.newLine(); //한줄의 끝을 인식하라고 개행기호도 같이 출력
				bw.flush(); //출력
				
				boolean isRun = true;
				//반복문 돌면서 서버가 출력하는 문자열을 읽어온다.
				while(isRun){
					String msg=br.readLine();
					String[] result=msg.split("#");	
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
	// 익명의 innerClass를 이용해서 WindowAdapter 추상클래스 type
	// 객체의 참조값을 얻어낸다.
	WindowAdapter wAdapter=new WindowAdapter() {
		public void windowClosing(java.awt.event.WindowEvent e) {
			
		};
	};
	//메인 메소드
	public static void main(String[] args) {
		// 생성자의 2번쨰 인자로는 여러분의 이름을 적으세요
		new BroadcastClient("192.168.0.122","ㄱㅎㅎ");
	}
}
