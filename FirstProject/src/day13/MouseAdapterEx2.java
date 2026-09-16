package day13;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseAdapterEx2 extends JFrame{
	public MouseAdapterEx2(){
		Random ran = new Random();
		setTitle("첫번째 화면!!"); // 상단 제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램을 완전히 종료하겠단 명령어
		Container c = getContentPane();
		c.setLayout(null);
		JLabel label = new JLabel("Hello");
		label.setBounds(30, 30, 70, 50);
		c.add(label);
		c.addMouseListener(new MouseAdapter() {
			// 더블 클릭했을 때 label 이동
			public void mouseClicked(MouseEvent e) {
//				if(e.getClickCount()==2) {
//					label.setLocation(e.getX(), e.getY());
//				}
				if(e.getButton() == MouseEvent.BUTTON3) {
					label.setLocation(e.getX(), e.getY());
				}
			}
		
		});
		
		
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MouseAdapterEx2();
	}

}
