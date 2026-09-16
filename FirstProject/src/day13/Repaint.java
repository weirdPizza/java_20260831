package day13;

import java.awt.Container;
import java.awt.Label;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Repaint extends JFrame {
	public Repaint() {
		setTitle("첫번째 화면!!"); // 상단 제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램을 완전히 종료하겠단 명령어
		Container c = getContentPane();
		c.setLayout(null); 
		// 배치 관리자는 이벤트마다 사건을 처리하는 작업을 해주는데 null이니(관리자가 없으니까) 수작업 해줘야 함. 이벤트 익명에서
		
		c.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				JLabel label = new JLabel("Hello");
				label.setSize(50, 30);
				label.setLocation(30, 30);
				c.add(label);
				
				c.revalidate(); // 컴포넌트를 적당한 위치에 배치시키고
				c.repaint(); // 다시 그려줘
			}
				
		});
		
		setSize(300, 300);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	public static void main(String[] args) {
		new Repaint();
	}

}
