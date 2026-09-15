package day12;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NullLayoutEx1 extends JFrame{	
	NullLayoutEx1(){
		setTitle("첫번째 화면!!"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		Container c = getContentPane();
		c.setLayout(null); // 배치관리자가 원래 컴포넌트 크기도 정해줌
		
		JButton btn = new JButton("버튼!!!");
//		btn.setSize(200, 50); // layout이 없으니 component가 직접 설정
//		btn.setLocation(15, 15);
		btn.setBounds(15,15, 200,50);
		c.add(btn);
		
		
		setSize(500, 500);
		setVisible(true); 
	}

	public static void main(String[] args) {
		new NullLayoutEx1();
	}

}
