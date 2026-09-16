package day13;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxItemEventEx extends JFrame{
	int sum=0; // 생성자는 한 번 클릭되면 끝나니깐, 얜 전역변수로 관리되어야 함.
	public CheckBoxItemEventEx() {
		setTitle("체크박스 이벤트"); // 상단 제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램을 완전히 종료하겠단 명령어
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JCheckBox fruits[] = new JCheckBox[3];
		String fruitNames[] = {"사과", "배", "체리"};
		
		c.add(new JLabel("사과 100원, 배 500원, 체리 20000원"));
		
		JLabel sumLabel= new JLabel("현재 0원입니다.");
		
		
		for(int i=0; i<fruits.length; i++) {
			fruits[i] = new JCheckBox(fruitNames[i]);
			fruits[i].addItemListener(new ItemListener() {
				
				@Override
				public void itemStateChanged(ItemEvent e) {
					// TODO Auto-generated method stub
					if(e.getStateChange() == ItemEvent.SELECTED) {
						// 체크됐을 때 로직 처리
						System.out.println("체크됨!");
						
						if(e.getItem() == fruits[0]) { // 사과
							sum += 100;
						}else if(e.getItem() == fruits[1]) { // 배
							sum+=500;
						}else { // 체리
							sum+=20000;
						}
						
					}else {
						// 체크 해제 됐을 때 로직 처리
						System.out.println("체크 해제 됨!");
						if(e.getItem() == fruits[0]) { // 사과
							sum -= 100;
						}else if(e.getItem() == fruits[1]) { // 배
							sum-=500;
						}else { // 체리
							sum-=20000;
						}
					}
					sumLabel.setText("현재 "+sum+"원 입니다.");
				}
			});
			c.add(fruits[i]);
		}
		c.add(sumLabel);
		
		setSize(250, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CheckBoxItemEventEx();
	}

}
