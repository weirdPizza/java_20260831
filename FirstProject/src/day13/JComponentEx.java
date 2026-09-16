package day13;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JComponentEx extends JFrame{
	public JComponentEx() {
		setTitle("컴포넌트"); // 상단 제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램을 완전히 종료하겠단 명령어
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("Button1");
		btn1.setBackground(new Color(255, 80, 0));
		btn1.setForeground(Color.DARK_GRAY);
		btn1.setFont(new Font("Arial", Font.BOLD, 20));
		
		JButton btn2 = new JButton("Button2");
		btn2.setEnabled(false); // 아이디 중복체크 안하면 회원가입 안되는 
		JButton btn3 = new JButton("Button3");
		
		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
		
		
		setSize(300, 300);
		setVisible(true); 
	}
	public static void main(String[] args) {
		new JComponentEx();
	}

}
