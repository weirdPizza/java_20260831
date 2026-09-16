package day13;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseListenerMotionEx extends JFrame{
	public MouseListenerMotionEx(){
		setTitle("마우스 모션!"); // 상단 제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램을 완전히 종료하겠단 명령어
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Mouse Event!");
		c.add(label);
		
		c.addMouseMotionListener(new MouseAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				label.setText("mouseDragged! "+e.getX()+", "+e.getY());
			} // mouseReleased랑 같이 사용하는 경우가 많다
			@Override
			public void mouseMoved(MouseEvent e) {
				label.setText("mouseMoved! "+e.getX()+", "+e.getY());
			}
		});
		
		c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				label.setText("드래그 끝!");
			}
		});
		
		setSize(300, 300);
		setVisible(true); 
	}
	public static void main(String[] args) {
		new MouseListenerMotionEx();
	}

}
