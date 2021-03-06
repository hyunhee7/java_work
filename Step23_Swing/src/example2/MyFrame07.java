package example2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrame07 extends JFrame implements ActionListener{
	JTextField inputText;
	JTextArea textArea;
	//생성자
	public MyFrame07(){
		initUI();
	}
	//UI 초기화 메소드 
	public void initUI(){
		//레이아웃 설정
		setLayout(new BorderLayout());

		//페널 객체 생성하기
		JPanel panel=new JPanel();
		inputText=new JTextField(10);
		JButton sendBtn=new JButton("전송");

		//버튼을 페널에 추가하기
		panel.add(inputText);
		panel.add(sendBtn);

		//new JTextArea(row, column);
		textArea=new JTextArea(10, 10);

		//페널을 프레임의 북쪽에 추가하기
		this.add(panel, BorderLayout.NORTH);
		add(textArea, BorderLayout.CENTER);
		sendBtn.addActionListener(this);

		//textArea.setText("hello");
		textArea.append("one\r\n");
		textArea.append("two\r\n");
		textArea.append("three\r\n");
		
		setBounds(200, 200, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrame07();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		String txt=inputText.getText();
		textArea.append(txt);
		textArea.append("\r\n");
		inputText.setText("");
	}
}









