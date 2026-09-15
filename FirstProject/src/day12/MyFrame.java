package day12;

import javax.swing.JFrame;

public class MyFrame extends JFrame{

	MyFrame(){
		setTitle("첫번째 화면!!"); // 상단 제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램을 완전히 종료하겠단 명령어
		setSize(300, 300);
		setVisible(true); // visible true 안하면 실행은 하는데 눈에 안보이는 상태 되어버림
		
	}
	
	public static void main(String[] args) {
		new MyFrame();
	}

}
