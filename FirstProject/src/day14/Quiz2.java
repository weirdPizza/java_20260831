package day14;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Quiz2 extends JFrame{
	private int num = 10;
	Quiz2(){
		setTitle("첫번째 화면!!"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		Container c = getContentPane();
		c.setLayout(null);
		
		start(c);
		
		setSize(700, 700);
		setVisible(true);
	}
	
	
	void start(Container c) {
		Random ran = new Random();
		
		
		for(int i=1; i<=10; i++) {
			int ranX = ran.nextInt(640);
			int ranY = ran.nextInt(640); // 첫번째 화면!!이라 나오는 부분까지 합해서 700임!
			JButton btn = new JButton(i+"");
			btn.setBounds(ranX,ranY,50,20);
			c.add(btn);
			btn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JButton tempBtn=(JButton)e.getSource();
					int nowNum = Integer.parseInt(tempBtn.getText());
					System.out.println(num);
					
					if(nowNum==num) { // 정상
						c.remove(tempBtn);
						num--;
						if(num == 0) {
							num=1;
							start(c);
						}
					}
					c.repaint();
				}
			});}
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Quiz2();
	}

}
