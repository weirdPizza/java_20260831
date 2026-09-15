package day12;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GridLayoutEx extends JFrame{

	GridLayoutEx(){
		setTitle("첫번째 화면!!"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		Container c = getContentPane();
		c.setLayout(new GridLayout(4,2,5,5));
		
		c.add(new JLabel("이름")); // label은 안내문구
		c.add(new JTextField()); // textField는 값을 입력받음
		
		c.add(new JLabel("학번")); 
		c.add(new JTextField()); 

		c.add(new JLabel("학과")); 
		c.add(new JTextField()); 
		
		c.add(new JLabel("과목")); 
		c.add(new JTextField()); 
		
		
		
		setSize(300, 300);
		setVisible(true); 

	}
	
	public static void main(String[] args) {
		new GridLayoutEx();
	}

}
