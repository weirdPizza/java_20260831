package day13;

import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseListenerEx extends JFrame {
	public MouseListenerEx(){
		setTitle("첫번째 화면!!"); // 상단 제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램을 완전히 종료하겠단 명령어
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel label = new JLabel("Hello");
		label.setBounds(30, 30, 70, 50);
		c.add(label);
		
		c.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) { // 누르는 순간 바로 실행
				System.out.println(e.getX()+","+e.getY());
				label.setLocation(e.getX(),e.getY());
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("나갔다!");
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("올라갔다!");
			}
			
			@Override
			public void mouseClicked(MouseEvent e) { // 누르고 클릭이 끝나는 순간 실행
				// TODO Auto-generated method stub
				
			}
		});
		
		
		
		setSize(300, 300);
		setVisible(true); 
	}
	public static void main(String[] args) {
		new MouseListenerEx(){};
	}

}
