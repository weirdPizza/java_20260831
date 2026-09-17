package day14;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class ListChangeEx extends JFrame{
	public ListChangeEx() {
		setTitle("리스트 추가"); // 상단 제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램을 완전히 종료하겠단 명령어
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JTextField text = new JTextField(20);
		
		Vector<String> v = new Vector<>();
		v.add("홍길동");
		JList<String> list = new JList<String>(v);
		list.setVisibleRowCount(5); 
		list.setFixedCellWidth(100);
		JScrollPane scroll = new JScrollPane(list);
		
		text.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				v.add(text.getText());
				list.setListData(v);
				text.setText("");
			}
		});
		
		c.add(text);
		c.add(scroll);
		
		setSize(250, 250);
		setVisible(true); // visible true 안하면 실행은 하는데 눈에 안보이는 상태 되어버림
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ListChangeEx();
	}

}
