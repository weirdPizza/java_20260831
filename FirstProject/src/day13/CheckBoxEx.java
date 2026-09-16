package day13;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxEx extends JFrame{
	public CheckBoxEx() {
		setTitle("체크박스"); // 상단 제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램을 완전히 종료하겠단 명령어
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JCheckBox apple = new JCheckBox("사과");
		JCheckBox pear = new JCheckBox("배", true); 
		// 두번째 불린 넣어주면 체크된 상태 지정 가능
		ImageIcon img1 = new ImageIcon("images/cherry.jpg");
		ImageIcon img2 = new ImageIcon("images/selectedCherry.jpg");
		
		JCheckBox cherry = new JCheckBox("체리", img1);
		cherry.setSelectedIcon(img2);
		cherry.setBorderPainted(true);
		
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new CheckBoxEx();
	}

}
