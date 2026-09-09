package day8;

import java.util.Scanner;

public class _4_Equals {
	public static void main(String[] args) {
		Point p1 = new Point(3,5);
		Point p2 = new Point(3,5);
		
		if(p1==p2) {
			// false
		}
		if(p1.equals(p2)) {
			// false
			// .equals는 내가 만들어줘야 해
		}
		
		Scanner s = new Scanner(System.in);
		System.out.print("[(메인), (게시판), (기타), (종료)] : ");
		String menu = s.next();
		
		if(menu.equals("메인")) { // 문자열을 비교할 때는 .equals()!
			System.out.println("메인 입니다!");
		}
	}
}
