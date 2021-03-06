package example2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame04 extends JFrame implements ActionListener{
	//버튼의 참조값을 담을 맴버필드 
	JButton saveBtn, deleteBtn;
	//생성자
	public MyFrame04(){
		initUI();
	}
	//UI 초기화 메소드 
	public void initUI(){
		//레이아웃 설정
		setLayout(new BorderLayout());
		//페널 객체 생성하기
		JPanel panel=new JPanel();
		//버튼 객체 생성하기
		saveBtn=new JButton("저장");
		deleteBtn=new JButton("삭제");
		//버튼 리스너 객체 등록하기 
		saveBtn.addActionListener(this);
		deleteBtn.addActionListener(this);
		
		//버튼을 페널에 추가하기
		panel.add(saveBtn);
		panel.add(deleteBtn);
		//페널을 프레임의 북쪽에 추가하기
		this.add(panel, BorderLayout.NORTH);
		
		setBounds(200, 200, 300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrame04();
	}
	//ActionListener 인터페이스 때문에 강제 구현된 메소드 
	@Override
	public void actionPerformed(ActionEvent e) {
		//눌러진 버튼의 참조값을 얻어온다.
		Object obj=e.getSource();
		if(obj == saveBtn){ //저장 버튼을 눌렀을때 
			System.out.println("저장 합니다.");
		}else if(obj == deleteBtn){ //삭제 버튼을 눌렀을때 
			System.out.println("삭제 합니다.");
		}
	}
}









