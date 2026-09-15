package day12;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Grid연습문제 extends JFrame{
	Grid연습문제(){
		setTitle("첫번째 화면!!"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		Container c = getContentPane();
		c.setLayout(new GridLayout(4,4));
		
		String arr[] = {
				"7", "8","9", "*",
				"4", "5", "6", "-",
				"1", "2", "3", "+",
				"+/-", "0", ".", "="
		}; 
		// 규칙이 있는 듯하면서 없으면 이렇게 배열로 만들면 됨. 안그러면 하드코딩 밖에 답이 없다.
		
		for(int i=0; i<arr.length; i++) {
			JButton btn = new JButton(arr[i]);
			c.add(btn);
			
		}
		
		
		setSize(300, 300);
		setVisible(true); 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Grid연습문제();
	}

}
