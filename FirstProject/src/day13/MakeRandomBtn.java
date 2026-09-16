package day13;

import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MakeRandomBtn extends JFrame{
	public MakeRandomBtn() {
		setTitle("F1키 누르면 랜덤위치에 버튼 생성"); // 상단 제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램을 완전히 종료하겠단 명령어
		Container c = getContentPane();
		c.setLayout(null);
		
		Random ran = new Random();
		c.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_F1) {
					JButton btn = new JButton("버튼!");
					btn.setSize(70,50);
					btn.setLocation(ran.nextInt(620), ran.nextInt(620));
					c.add(btn);
					
					c.revalidate(); // 컴포넌트를 적당한 위치에 배치시키고
					c.repaint();
				}
				
			}
		
		});
		
		setSize(700, 700);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	public static void main(String[] args) {
		new MakeRandomBtn();
	}

}
