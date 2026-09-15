package day12;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPaneEx extends JFrame{
	ContentPaneEx(){
		setTitle("첫번째 화면!!"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.setBackground(new Color(80,100,40));
		c.setLayout(new FlowLayout()); // 컴포넌트를 어떻게 위치 시킬지 배치관리자
		// FlowLayout은 공간이 좁아지면 넥스트라인으로 넘어가는구나~
		// 기본값은 borderLayout임
		
		JButton btn1 = new JButton("첫번째버튼");
		c.add(btn1);
		
		JButton btn2 = new JButton("두번째버튼");
		c.add(btn2);
		
		JButton btn3 = new JButton("세번째버튼");
		c.add(btn3);
		
		
		
		
		setSize(300, 300);
		setVisible(true); 
	}
	
	public static void main(String[] args) {
		new ContentPaneEx();
	}
}
