package day14;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxQuiz extends JFrame{
	public CheckBoxQuiz() {
		setTitle("체크박스"); // 상단 제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램을 완전히 종료하겠단 명령어
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JCheckBox cb1 = new JCheckBox("버튼 비활성화");
		c.add(cb1);
		
		JCheckBox cb2 = new JCheckBox("버튼 감추기");
		c.add(cb2);
		
		JButton btn = new JButton("test button");
		c.add(btn);
		
		cb1.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if(cb1.isSelected()==true) {
					btn.setEnabled(false);
				}else {
					btn.setEnabled(true);
				}
			}
		});
		
		cb2.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if(cb2.isSelected()==true) {
					btn.setVisible(false);
				}else {
					btn.setVisible(true);
				}
			}
		});
		
		
		setSize(300, 130);
		setVisible(true); // visible true 안하면 실행은 하는데 눈에 안보이는 상태 되어버림
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CheckBoxQuiz();
	}

}
