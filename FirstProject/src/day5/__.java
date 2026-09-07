package day5;

import java.util.Random;
import java.util.Scanner;

public class __ {
	static void question8() {
		Scanner s = new Scanner(System.in);
		Random ran = new Random(); 
//		8. 
//		기본조건
//		 - 메인메뉴는 1~2. 그외 숫자 입력 시 안내 문구 후 다시 입력
//		 - 1번 메뉴 진입 시 난이도 선택. 1~3외 값 입력 시 안내 문구 후 다시 입력
//		 - 1번 난이도는 2~5단, 2번 난이도는 6~9단, 3번 난이도는 12~19단 문제 출력
//		 - 문제는 5문제 고정. 5문제 모두 푼 후 맞춘 개수 출력
//		 - 메인 메뉴에서 2번 선택 시 종료
		while(true) {
			System.out.print("[1. 구구단 풀기, 2. 종료] : ");
			int menu = s.nextInt();
			int count = 0;
			if(menu == 1) {
				System.out.print("[1. 쉬움(2~5단), 2. 보통(6~9단), 3. 어려움(12~19단)] : ");
				int level = s.nextInt();
				if(level < 1 || level > 3) {
					System.out.println("난이도는 1~3사이를 선택해주세요.");
					continue;
				} 
				
				System.out.println("====== 문제풀이를 시작합니다(5문제) ======");
				for(int i=1; i<=5; i++) {
					int x;
					int y = ran.nextInt(9) + 1;
					if(level == 1) {
						x = ran.nextInt(4) + 2;
					} else if(level == 2){
						x = ran.nextInt(4) + 6;
					} else {
						x = ran.nextInt(8) + 12;
					}
					System.out.print(x + " * " + y + " = " );
					int answer = s.nextInt();
					if(answer == (x*y)) {
						System.out.println("정답입니다!");
						count++;
					} else {
						System.out.println("틀렸습니다. 정답은 " + (x*y) + " 입니다.");
					}
				}
				System.out.println("총 " + count + "개 맞추셨습니다.");
			} else if(menu == 2){
				System.out.println("종료되었습니다.");
				break;
			} else {
				System.out.println("메뉴는 1~2중에 선택해주세요.");
			}
		}
	}
	
	public static void main(String[] args) {
		question8();
	}
}
