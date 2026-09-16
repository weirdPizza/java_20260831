package day13;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class FruitPriceRadio extends JFrame{
	public FruitPriceRadio() {
		setTitle("라디오버튼 문제"); // 상단 제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램을 완전히 종료하겠단 명령어
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ButtonGroup group = new ButtonGroup();
		
		JRadioButton fruits[] = new JRadioButton[3];
		String fruitsNames[] = {"사과", "배", "체리"};
		
		c.add(new JLabel("사과 100원, 배 500원, 체리 20000원"));
		
		JLabel sumLabel= new JLabel("현재 0원입니다.");
		
//		group.add(apple);
//		group.add(pear);
//		group.add(cherry);
//		
//		c.add(apple);
//		c.add(pear);
//		c.add(cherry);
		
		for(int i=0; i<fruits.length; i++) {
			fruits[i] = new JRadioButton(fruitsNames[i]);
			group.add(fruits[i]);
			c.add(fruits[i]);
			
			fruits[i].addItemListener(new ItemListener() {
				
				@Override
				public void itemStateChanged(ItemEvent e) {
					// TODO Auto-generated method stub
					int price = 0;
					if(e.getStateChange() == ItemEvent.SELECTED) {
						// 체크 됐을 때
						if(e.getItem() == fruits[0]) {
							price = 100;
						}else if(e.getItem() == fruits[1]){
							price = 500;
						}else {
							price = 20000;
						}
					}
					sumLabel.setText("현재 "+price+"원 입니다.");
				}
			});
		}
		c.add(sumLabel);
		
		setSize(250, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FruitPriceRadio();
	}

}
