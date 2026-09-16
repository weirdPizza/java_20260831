package day13;

import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FlyingTextEx extends JFrame{
	FlyingTextEx(){
		setTitle("키보드 이벤트!"); // 상단 제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램을 완전히 종료하겠단 명령어
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel label = new JLabel("Hello");
		label.setBounds(50, 50, 100, 20);
		c.add(label);
		final int FLYING_UNIT = 10;
		
		c.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				if(keyCode == KeyEvent.VK_LEFT) {
					label.setLocation(label.getX()-FLYING_UNIT, label.getY());
				}else if(keyCode == KeyEvent.VK_RIGHT) {
					label.setLocation(label.getX()+FLYING_UNIT, label.getY());
				}else if(keyCode == KeyEvent.VK_UP) {
					label.setLocation(label.getX(), label.getY()-FLYING_UNIT);
				}else if(keyCode == KeyEvent.VK_DOWN) {
					label.setLocation(label.getX(), label.getY()+FLYING_UNIT);
				}
			}
		
		});
		
		c.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) { // 포커스 계속 벗어나서 불안한 감 있어서 컨테이너 클릭하면 제대로 작동하게 만듦
			c.setFocusable(true);
			c.requestFocus();
		}
		});
		
		setSize(300, 300);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlyingTextEx();
	}

}
