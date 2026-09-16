package day13;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ClickCount extends JFrame{
	public ClickCount() {
		setTitle("클릭 횟수 카운트"); // 상단 제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램을 완전히 종료하겠단 명령어
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		for(int i=0; i<5; i++) {
			JButton btn = new JButton("0");
			c.add(btn);
			btn.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					btn.setText(e.getClickCount()+"");
				}
			}); //내 코드
			
			// 쌤코드는 다른데 잘 안보임 깃에서 확인!
		}
		
		setSize(300, 100);
		setVisible(true); 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ClickCount();
	}

}
