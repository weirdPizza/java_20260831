package day13;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI복습1 extends JFrame{
	public GUI복습1() {
		setTitle("복습!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		Container c = getContentPane();
		c.setLayout(null);
		
		JButton btn = new JButton("버튼!");
//		btn.setSize(80,40);
//		btn.setLocation(30,30);
		btn.setBounds(30, 30, 80, 40);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				c.setBackground(Color.red);
				c.setBackground(new Color(100, 100, 100));
			}
		});;
		c.add(btn);
		
		setSize(300, 300);
	}
	
	public static void main(String[] args) {
		new GUI복습1();
	}

}
