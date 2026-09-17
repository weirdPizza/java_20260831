package day14;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Quiz1 extends JFrame{
	public Quiz1() {
		setTitle("퀴즈1"); // 상단 제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램을 완전히 종료하겠단 명령어
		Container c = getContentPane();

		
		JPanel topPanel = new JPanel();
		topPanel.setBackground(Color.yellow);
		c.add(topPanel, BorderLayout.NORTH);
		
		JPanel centerPanel = new JPanel();
		centerPanel.setBackground(Color.yellow);
		centerPanel.setLayout(null); // 아래에서 위치 조정 for문 필요
		

		JLabel title = new JLabel("금액");
		JTextField input = new JTextField(10);
		JButton btn = new JButton("계산");
		btn.setSize(30, 10);
		topPanel.add(title);
		topPanel.add(input);
		topPanel.add(btn);
		c.add(topPanel, BorderLayout.NORTH);
		
		int moneyList[] = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
		String moneyNameList[] = {"오만원", "만원", "오천원", "천원", "500원","100원", "50원","10원","1원"};
		JTextField moneyField[] = new JTextField[moneyList.length];
		for(int i=0; i<moneyList.length; i++) {
			JLabel tempJLabel = new JLabel(moneyNameList[i]);
			tempJLabel.setBounds(20,i*25 , 50,30);
			tempJLabel.setHorizontalAlignment(JLabel.RIGHT);
			centerPanel.add(tempJLabel);
			
			JTextField tempField = new JTextField(5);
			tempField.setBounds(100, i*25, 150, 24);
			moneyField[i] = tempField;
			centerPanel.add(moneyField[i]);
		}
		
		// 위치 조정 위 반복문에서 해도 되겠다

		
		btn.addActionListener(new ActionListener() {
			int total = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(input.getText().length() == 0) {
					return; // 아무것도 입력안하고 버튼 누르면 리턴 
				}
				total=Integer.parseInt(input.getText());
				for(int i=0; i<moneyList.length; i++) {
					moneyField[i].setText(total/moneyList[i]+"");// 몫
					if(total>0) {
						total = total%moneyList[i]; // 나머지
					}
				}
				
			}
		});

		c.add(centerPanel, BorderLayout.CENTER);
		
		
		
		
		setSize(300, 320);
		setVisible(true); // visible true 안하면 실행은 하는데 눈에 안보이는 상태 되어버림
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Quiz1();
	}

}
