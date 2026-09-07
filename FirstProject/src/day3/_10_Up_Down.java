package day3;

import java.util.Random;
import java.util.Scanner;

public class _10_Up_Down {

	public static void main(String[] args) {
		// Up & Down 게임
		// 1~100 사이의 랜덤 숫자가 생성되고, 해당 숫자를 맞추는 게임
		// ex) 랜덤숫자 : 76(비공개)
		// 1번째 시도 : 50  => Up
		// 2번째 시도 : 80 => Down
		// 3번째 시도 : 76 => 정답입니다! 3번째에 정답을 맞추셨습니다!
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		System.out.println("Up&Down 게임을 시작합니다!");
		
		int ranNum = r.nextInt(100) + 1;
		int count = 0;
		
		for(;;) {
			count++;
			System.out.print(count+"번째 시도: ");
			int answer = s.nextInt();
			
			if(answer>100||answer<1) {
				System.out.println("1부터 100 사이의 값을 입력해주세요");
				count--; // 이상한 값의 시도는 무효로 처리하겠단 의미
				//continue; // continue를 안써도 되지 않나? 안써도 된답니다
			}else if(answer == ranNum) {
				System.out.println("정답입니다!" + count + "번째에 정답을 맞추셨습니다!");
				break;
			} else if(answer > ranNum) {
				System.out.println("Down");
			} else {
				System.out.println("Up");
			}
		}
			
		}

}
