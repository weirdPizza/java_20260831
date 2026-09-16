package day13;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabelEx extends JFrame{
	public JLabelEx(){
		setTitle("이미지 레이블"); // 상단 제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램을 완전히 종료하겠단 명령어
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon image = new ImageIcon("images/beauty.jpg");
		JLabel label = new JLabel(image);
		c.add(label);
		
		setSize(400, 400);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JLabelEx();
	}

}
