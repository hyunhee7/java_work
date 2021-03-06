package test.main;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
	JComboBox inputMonth;
	JComboBox inputDate;
	JComboBox inputCheck;
	
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
		inputCheck=new JComboBox();
		inputCheck.setModel(new DefaultComboBoxModel(new String[]{"안함","진행중","완료"}));
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
		//버튼 리스너 등록 
		saveBtn.addActionListener(this);
		deleteBtn.addActionListener(this);
		updateBtn.addActionListener(this);
		//페널에 컴포넌트 추가 하기 
		topPanel.add(inputCheck);
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
		String[] colNames={"진행상황", "날짜", "할 일"};
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
		
		//파일에 있는 정보 로딩하기
		loadFromFile();
		//로딩된 정보 출력하기 
		displayMember();
		
	}	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == saveBtn){
			String Check = (String)inputCheck.getSelectedItem();
			String Todo = inputTodo.getText();
			String Month = (String)inputMonth.getSelectedItem();
			String Date = (String)inputDate.getSelectedItem();
			Map<String, Object> map=new HashMap<>();
			map.put("Check", Check);
			map.put("ToDo", Todo);
			map.put("Month", Month);
			map.put("Date", Date);
			todoList.add(map);
			saveToFile();
			
			JOptionPane.showMessageDialog(this, "저장했습니다.");
			inputTodo.setText("");
		}else if(e.getSource() == updateBtn){
			int selectedIndex=table.getSelectedRow();
			if(selectedIndex==-1){
				JOptionPane.showMessageDialog(this, "수정할 row를 선택하세요");
				return;
			}
			String check = (String)inputCheck.getSelectedItem();
			//String check=(String)table.getValueAt(selectedIndex, 0);
			String todo=(String)table.getValueAt(selectedIndex, 2);
			todoList.get(selectedIndex).put("check", check);
			todoList.get(selectedIndex).put("addr", todo);
			saveToFile();
			JOptionPane.showMessageDialog(this, "수정했습니다.");			
		}else if(e.getSource() == deleteBtn){

			int selectedIndex=table.getSelectedRow();
			if(selectedIndex==-1){
				JOptionPane.showMessageDialog
					(this, "삭제할 row 를 선택하세요");
				return; 
			}

			todoList.remove(selectedIndex);
			saveToFile();
			JOptionPane.showMessageDialog(this, "삭제했습니다.");			
		}
		loadFromFile();
		displayMember();
	}
	
	public void saveToFile(){		
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		try{
			fos=new FileOutputStream("c:/myFolder/MyTodo.dat");
			oos=new ObjectOutputStream(fos);
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
	public void loadFromFile(){
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		try{
			fis=new FileInputStream("c:/myFolder/MyTodo.dat");
			ois=new ObjectInputStream(fis); 
			todoList=(List)ois.readObject();
		}catch(FileNotFoundException fne){
			todoList=new ArrayList<>();
			System.out.println("todoList.dat 파일이 없음");
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(fis!=null)fis.close();
				if(ois!=null)ois.close();
			}catch(Exception e){}
		}
	}
	
	//맴버필드에 있는 회원정보를 출력하는 메소드
	public void displayMember(){
		//table 에 출력된 내용 삭제 되도록
		model.setRowCount(0);
		
		for(Map<String, Object> tmp:todoList){
			String check=(String)tmp.get("Check");
			String month=(String)tmp.get("Month");
			String date=(String)tmp.get("Date");
			String todo=(String)tmp.get("ToDo");
			Object[] row=new Object[3];
			row[0]=check;
			row[1]=month+"월 "+date+"일";
			row[2]=todo;
			model.addRow(row);
		}
	}
		
	
	public static void main(String[] args) {
		new testProgram();
	}
}
