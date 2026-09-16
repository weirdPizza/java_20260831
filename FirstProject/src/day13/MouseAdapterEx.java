package day13;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseAdapterEx extends JFrame{
	public MouseAdapterEx(){
		Random ran = new Random();
		setTitle("첫번째 화면!!"); // 상단 제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램을 완전히 종료하겠단 명령어
		Container c = getContentPane();
		c.setLayout(null);
		JLabel label = new JLabel("Hello");
		label.setBounds(30, 30, 70, 50);
		c.add(label);
		c.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				label.setLocation(e.getX(), e.getY());
				c.setBackground(new Color(ran.nextInt(256),ran.nextInt(256),ran.nextInt(256)));
			}
		
		});
		
		
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MouseAdapterEx();
	}

}
