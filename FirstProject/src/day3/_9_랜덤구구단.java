package day3;

import java.util.Random;
import java.util.Scanner;

public class _9_랜덤구구단 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random ran = new Random(); 
		// s, ran은 객체라서 무한루프안에 넣어서 계속 똑같은 애를 만들면 문제가 생김
		// 재사용해야함
		
		int correctCnt = 0; // 맞춘 개수 
		int count = 0; // 전체 문제 수
		
		System.out.println("== 랜덤구구단 프로그램을 실행합니다 == ");
		System.out.println("정답에 0을 입력하면 종료됩니다");
		for(;;) {
			
			int x = ran.nextInt(8) + 2; // 2~9
			int y = ran.nextInt(9) + 1; // 1~9
			System.out.print(x + " * " + y + " = ");
			int answer = s.nextInt();
			count++;
			
			if(answer==0) {
				count--; // 0을 입력한 문제는 푼 문제가 아니기 때문에 --
				System.out.println("종료되었습니다~");
				break;
			}
			
			System.out.println("정답은 " + answer);
			if(x*y == answer) {
				System.out.println("정답~!");
				correctCnt++;
			} else {
				System.out.println("오답~!");
			}
			
			System.out.println();
		}

		System.out.println(count+"문제 중에 " + correctCnt +"문제 맞췄습니다");
	}

}
