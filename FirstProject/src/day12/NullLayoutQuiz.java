package day12;

import java.awt.Container;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NullLayoutQuiz extends JFrame{
	// 700 x 700 크기의 컨테이너 안에
	// 1부터 10까지의 값을 가지는 버튼을 랜덤한 위치에 출력
	// 버튼의 크기는 50 x 20
	NullLayoutQuiz(){
		setTitle("첫번째 화면!!"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		Container c = getContentPane();
		c.setLayout(null);
		Random ran = new Random();
		
		
		for(int i=1; i<=10; i++) {
			int ranX = ran.nextInt(640);
			int ranY = ran.nextInt(640); // 첫번째 화면!!이라 나오는 부분까지 합해서 700임!
			JButton btn = new JButton(i+"");
			btn.setBounds(ranX,ranY,50,20);
			c.add(btn);
			
		}
		
		// 각각의 버튼 영역엔 침범하지 않으면서 랜덤한 위치는 어떻게 부여할까
		// 버튼의 번호 2 -> x,y 배열은 번호-1, 번호 값이 인덱스가 됨.
		
		
		setSize(700, 700);
		setVisible(true); 
	}
	
	public static void main(String[] args) {
		new NullLayoutQuiz();
	}

}
