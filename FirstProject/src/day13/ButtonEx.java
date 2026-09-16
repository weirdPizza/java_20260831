package day13;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonEx extends JFrame{
	public ButtonEx(){
		setTitle("버튼!"); // 상단 제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램을 완전히 종료하겠단 명령어
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon img1 = new ImageIcon("images/RYAN_1.jpg");
		Image reSizeImg1 = img1.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		img1 = new ImageIcon(reSizeImg1);
		
		ImageIcon img2 = new ImageIcon("images/RYAN_2.jpg");
		Image reSizeImg2 = img2.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		img2 = new ImageIcon(reSizeImg2);
		
		ImageIcon img3 = new ImageIcon("images/RYAN_3.jpg");
		Image reSizeImg3 = img3.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		img3 = new ImageIcon(reSizeImg3);
		
		JButton btn = new JButton(img1);
		btn.setRolloverIcon(img2);
		btn.setPressedIcon(img3);
		c.add(btn);
		
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ButtonEx();
	}

}
