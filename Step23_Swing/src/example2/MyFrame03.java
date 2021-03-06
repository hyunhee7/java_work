package example2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame03 extends JFrame implements ActionListener{
	//생성자
	public MyFrame03(){
		initUI();
	}
	//ActionListener 인터페이스 때문에 강제 구현된 메소드
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼을 눌렀네요?");
	}	
	
	//UI 초기화 메소드 
	public void initUI(){
		//레이아웃 설정
		setLayout(new BorderLayout());
		//페널 객체 생성하기
		JPanel panel=new JPanel();
		//버튼 객체 생성하기
		JButton button=new JButton("눌러보셈");
		JButton button2=new JButton("눌러보셈2");
		button.addActionListener(this);
		
		//버튼을 페널에 추가하기
		panel.add(button);
		panel.add(button2);
		//페널을 프레임의 북쪽에 추가하기
		this.add(panel, BorderLayout.NORTH);
		
		setBounds(200, 200, 300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrame03();
	}

}









