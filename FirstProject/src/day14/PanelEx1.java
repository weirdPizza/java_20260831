package day14;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelEx1 extends JFrame{
	public PanelEx1() {
		setTitle("PanelEx1"); // 상단 제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램을 완전히 종료하겠단 명령어
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(2,1));
		
		panel1.setBackground(Color.yellow);
		panel2.setBackground(Color.green);
		
		panel1.add(new JButton("버튼1"));
		panel1.add(new JButton("버튼2"));
		
		panel2.add(new JButton("버튼3"));
		panel2.add(new JButton("버튼4"));
		
		c.add(panel1);
		c.add(panel2);
		
		setSize(300, 300);
		setVisible(true); // visible true 안하면 실행은 하는데 눈에 안보이는 상태 되어버림
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PanelEx1();
	}

}
