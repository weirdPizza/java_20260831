package day13;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class IntrodueceMyself extends JFrame{
	public IntrodueceMyself() {
		setTitle("나를 소개합니다"); // 상단 제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램을 완전히 종료하겠단 명령어
		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.LEFT, 15, 15));
		
		JLabel nameLabel = new JLabel("이름 : "); 
		c.add(nameLabel);
		c.add(new JTextField(16));
		
		JLabel addrLabel = new JLabel("주소 : "); 
		c.add(addrLabel);
		c.add(new JTextField(16));
		
		JLabel habitLabel = new JLabel("취미 : ");
		c.add(habitLabel);
		JCheckBox arr[] = new JCheckBox[4];
		String habitList[] = {"게임", "영화감상", "독서", "코딩"};
		for(int i=0; i<habitList.length; i++) {
			arr[i] = new JCheckBox(habitList[i]);
			c.add(arr[i]);
		}
		
		JLabel genderLabel = new JLabel("성별 : ");
		c.add(genderLabel);
		ButtonGroup genderGroup = new ButtonGroup();
		JRadioButton genderRadio[] = new JRadioButton[2];
		String genderList[] = {"남", "여"};
		for(int i=0; i<genderList.length; i++) {
			genderRadio[i] = new JRadioButton(genderList[i]);
			genderGroup.add(genderRadio[i]);
			c.add(genderRadio[i]);
		}
		
		
		JButton saveBtn = new JButton("저장");
		saveBtn.setSize(60, 50);
		c.add(saveBtn);


		
//		JLabel habitLabel = new JLabel("취미 : ");
		
		setSize(300, 250);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new IntrodueceMyself();
	}

}
