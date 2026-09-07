package day3;

import java.util.Random;
import java.util.Scanner;

public class _99_문제풀이 {

	public static void main(String[] args) {
		// 카페에 '랜덤구구단 연습문제' 게시글에 있는
		// 이미지처럼 동작하도록 코드 작성
		
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		

		System.out.println("=== 랜덤 구구단 ===");
		for(;;) {
			System.out.print("[ (1) 구구단 시작  (2) 종료 ]: ");
			int menuNo = s.nextInt();

			if(menuNo==1) {
				System.out.print("문제 수를 입력해주세요: ");
				int queNo = s.nextInt();
				int correctCnt = 0;	
				for(int i=1; i<=queNo; i++) {
					int x = r.nextInt(8)+2;
					int y = r.nextInt(9)+1;
					System.out.print("["+i+"번 문제] "+x+" * "+y+" = ");
					int answer = s.nextInt();
					if(answer == x*y) {
						System.out.println("정답!!!");
						correctCnt++;
					} else {
						System.out.println("오답!!!");
					}
				}
				System.out.println("총 "+correctCnt+"문제 맞추셨습니다. 틀린 문제 개수는 "+(queNo-correctCnt));
				System.out.println();
			} else {
				System.out.println("종료되었습니다.");
				break;
			}
			
			
		}

	}

}
