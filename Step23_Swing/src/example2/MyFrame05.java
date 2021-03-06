package example2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
/*
 *  버튼을 눌렀을 때 JTextField 에 입력한 내용을 읽어와서
 *  콘솔창에 출력 해 보세요.
 */
public class MyFrame05 extends JFrame implements ActionListener{
	JButton sendBtn;
	JTextField inputText;
	//생성자
	public MyFrame05(){
		initUI();
	}
	//UI 초기화 메소드 
	public void initUI(){
		//레이아웃 설정
		setLayout(new BorderLayout());
		//페널 객체 생성하기
		JPanel topPanel=new JPanel();
		inputText=new JTextField(10);
		sendBtn=new JButton("전송");
		topPanel.add(inputText);
		topPanel.add(sendBtn);
		sendBtn.addActionListener(this);

		add(topPanel, BorderLayout.NORTH);
		
		setBounds(200, 200, 300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrame05();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String txt=inputText.getText();
		System.out.println(txt);
	}
}









