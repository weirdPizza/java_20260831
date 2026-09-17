package day14;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Quiz3 extends JFrame{

	public Quiz3() {
		setTitle("PanelEx2"); // 상단 제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램을 완전히 종료하겠단 명령어
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JPanel topPanel = new JPanel();
		topPanel.setBackground(Color.lightGray);
		JLabel label = new JLabel("수식");
		topPanel.add(label);
		JTextField mathEx = new JTextField(25);
		topPanel.add(mathEx);
		c.add(topPanel, BorderLayout.NORTH);
		
		
		String arr[] = {
				"7", "8","9","*",
				"4", "5", "6", "-",
				"1", "2", "3", "+",
				"/", "0", ".", "="};
		String specialListTemp[] = {"*","-","+","=","/","."};
		ArrayList<String> specialList = new ArrayList<>();
		for(int i=0; i<specialListTemp.length; i++) {
			specialList.add(specialListTemp[i]);
		}
		System.out.println(specialList);
		
		
		JPanel bottomPanel = new JPanel();
		bottomPanel.setBackground(Color.ORANGE);
		bottomPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel label2 = new JLabel("계산결과");
		bottomPanel.add(label2);
		JTextField mathResult = new JTextField(20);
		bottomPanel.add(mathResult);
		c.add(bottomPanel, BorderLayout.SOUTH);
		
		
		JPanel centerPanel = new JPanel();
		centerPanel.setBackground(Color.LIGHT_GRAY);
		centerPanel.setLayout(new GridLayout(4,4,2,2));
		for(int i=0; i<arr.length; i++) {
			JButton btn = new JButton(arr[i]);
			centerPanel.add(btn);
			c.add(centerPanel);
			btn.addActionListener(new ActionListener() {
				
				
				@Override
				public void actionPerformed(ActionEvent e) {
					JButton btn = (JButton)e.getSource();
					String btnText = btn.getText();
					int mathExLength = mathEx.getText().length();
					
					if(mathExLength == 0 && specialList.contains(btnText)) { // 특수문자 처리
						// 첫글자에 특수문자 못 와
						return;
					}else if(mathExLength!=0) { // 특수문자 중복 안되게
						String lastText = mathEx.getText().substring(mathExLength-1);
						if(specialList.contains(lastText)&&specialList.contains(btnText)) {
							return;
						}else if(btnText.equals("=")) { // = 나오면 답 추출
							System.out.println(mathEx.getText());
//							btnText.spl
							return;
						}
					}
					
					
					String inputText = mathEx.getText()+ btnText;
					mathEx.setText(inputText); 
					
					
				}
			});
		}
		c.add(centerPanel, BorderLayout.CENTER);

		
		
		setSize(400, 400);
		setVisible(true); // visible true 안하면 실행은 하는데 눈에 안보이는 상태 되어버림
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Quiz3();
	}

}
