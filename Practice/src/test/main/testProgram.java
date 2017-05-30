package test.main;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class testProgram extends JFrame implements ActionListener{
	//맴버필드 정의하기
	JTextField inputTodo;
	DefaultTableModel model;
	JButton saveBtn, deleteBtn, updateBtn;
	JTable table;
	JCheckBox inputCheck;
	JComboBox inputMonth;
	JComboBox inputDate;
	
	List<Map<String, Object>> todoList;
	//생성자
	public testProgram(){
		initUI();
	}
	//메소드 
	public void initUI(){

		//레이아웃 설정
		setLayout(new BorderLayout());
		//상단 페널 객체 생성
		JPanel topPanel=new JPanel();
		
		//레이블 객체 생성
		JLabel label1=new JLabel("월");
		JLabel label2=new JLabel("일                ");
		JLabel label3=new JLabel("할 일");
		
		//텍스트 필드 객체 생성
		inputMonth=new JComboBox();
		inputMonth.setModel(new DefaultComboBoxModel(new String[]{"1","2","3","4","5","6","7","8","9","10","11","12"}));
		inputDate=new JComboBox();
		inputDate.setModel(new DefaultComboBoxModel(new String[]{
				"1","2","3","4","5","6","7","8","9","10","11","12",
				"13","14","15","16","17","18","19","20","21","22","23","24",
				"25","26","27","28","29","30","31"}));
		inputTodo=new JTextField(17);
		
		saveBtn=new JButton("저장");
		deleteBtn=new JButton("삭제");
		updateBtn=new JButton("수정");

		//페널에 컴포넌트 추가 하기 
		topPanel.add(inputMonth);
		topPanel.add(label1);
		topPanel.add(inputDate);
		topPanel.add(label2);
		
		topPanel.add(label3);
		topPanel.add(inputTodo);
		topPanel.add(saveBtn);
		topPanel.add(deleteBtn);
		topPanel.add(updateBtn);
		
		//프레임의 상단에 페널 배치하기
		add(topPanel, BorderLayout.NORTH);		
		
		//테이블 칼럼명 
		String[] colNames={"check", "날짜", "할 일"};
		//테이블에 연결할 모델 객체 
		model=new DefaultTableModel(colNames, 0);
		
		//테이블 객체 생성 
		table=new JTable();
		//테이블에 모델 연결
		table.setModel(model);
		
		//스크롤 할수 있는 UI 로 테이블을 감싼다. 
		JScrollPane tablePanel=new JScrollPane(table);
		
		add(tablePanel, BorderLayout.CENTER);

		//가로 세로 크기 지정하기 
		setSize(800, 500);
		//화면의 가운데 배치 되도록
		setLocationRelativeTo(null);
		setVisible(true);
		// 창 닫을때 프로세스 종료 되도록 
		setDefaultCloseOperation(EXIT_ON_CLOSE);	
		
	}	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == saveBtn){
			String Todo = inputTodo.getText();
			String Month = inputMonth.toString();
			String Date = inputDate.toString();
			Map<String, Object> map=new HashMap<>();
			map.put("ToDo", Todo);
			map.put("Month", Month);
			map.put("Date", Date);
			todoList.add(map);
			saveToFile();
		}else if(e.getSource() == updateBtn){
			
		}else if(e.getSource() == deleteBtn){
			
		}
	}
	
	public void saveToFile(){
		//파일에 출력해서 영구 저장한다.		
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		try{
			fos=new FileOutputStream("c:/myFolder/MyTodo.dat");
			//객체 정보를 출력할수 있는 객체 생성하기 
			oos=new ObjectOutputStream(fos);
			//List 객체 출력하기 
			oos.writeObject(todoList);
			oos.flush();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(fos!=null)fos.close();
				if(oos!=null)oos.close();
			}catch(Exception e){}
		}
	}
	public static void main(String[] args) {
		new testProgram();
	}
}
