package day14;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBoxEx extends JFrame{
	public ComboBoxEx(){
		setTitle("comboBox"); // 상단 제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램을 완전히 종료하겠단 명령어
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		String [] fruits = {"apple", "banana", "kiwi", "mango", "pear",
				 "peach", "berry", "strawberry", "blackberry"};
		
		JComboBox<String> comboBox = new JComboBox<String>(fruits);
		c.add(comboBox);
		
		JComboBox<String> comboBox2 = new JComboBox<String>();
		// 빈 콤보박스 생성됨
		comboBox2.addItem("1");
		// 1 추가
		c.add(comboBox2);
		
		for(int i=0; i<fruits.length; i++) {
			comboBox2.addItem(fruits[i]);
		}
		c.add(comboBox2);
		
		
		setSize(300, 300);
		setVisible(true); // visible true 안하면 실행은 하는데 눈에 안보이는 상태 되어버림
		
	}
	public static void main(String[] args) {
		new ComboBoxEx();
	}

}
