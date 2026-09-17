package day14;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class ListEx extends JFrame{
	public ListEx() {
		setTitle("첫번째 화면!!"); // 상단 제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램을 완전히 종료하겠단 명령어
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		String [] fruits= {"apple", "banana", "kiwi", "mango", "pear",
				"peach", "berry", "strawberry", "blackberry"};
		
		JList<String> list = new JList<>(fruits);
		c.add(list);
		
		JScrollPane scroll= new JScrollPane(list);
		c.add(scroll);
		
		setSize(300, 300);
		setVisible(true); // visible true 안하면 실행은 하는데 눈에 안보이는 상태 되어버림
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ListEx();
	}

}
