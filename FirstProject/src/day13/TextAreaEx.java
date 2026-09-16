package day13;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextAreaEx extends JFrame {
	public TextAreaEx() {
		setTitle("텍스트영역 만들기 예제"); // 상단 제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램을 완전히 종료하겠단 명령어
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("입력 후 <Enter> 키를 입력해주세요");
		JTextField field = new JTextField(20);
		JTextArea area = new JTextArea(7, 20);
		JScrollPane scroll = new JScrollPane(area); 
		field.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(field.getText());
				area.append(field.getText()+"\n");
				field.setText("");
			}
		});
		// 텍스트에리어는 보통 스크롤과 짝꿍
		
		c.add(label);
		c.add(field);
		c.add(scroll);
		
		
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TextAreaEx();
	}
}
