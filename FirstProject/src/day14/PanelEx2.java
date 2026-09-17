package day14;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelEx2 extends JFrame{
	public PanelEx2() {
		setTitle("PanelEx2"); // 상단 제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램을 완전히 종료하겠단 명령어
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JPanel topPanel = new JPanel();
		topPanel.setBackground(Color.red);
		topPanel.add(new JLabel("상단영역!!"));
		c.add(topPanel, BorderLayout.NORTH);
		
		JPanel centerPanel = new JPanel();
		centerPanel.setBackground(Color.LIGHT_GRAY);
		centerPanel.add(new JButton("버튼1"));
		centerPanel.add(new JButton("버튼2"));
		c.add(centerPanel, BorderLayout.CENTER);

		JPanel bottomPanel = new JPanel();
		bottomPanel.setBackground(Color.ORANGE);
		bottomPanel.add(new JLabel("하단영역!!"));
		c.add(bottomPanel, BorderLayout.SOUTH);
		
		
		setSize(300, 300);
		setVisible(true); // visible true 안하면 실행은 하는데 눈에 안보이는 상태 되어버림
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PanelEx2();
	}

}
