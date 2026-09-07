package day3;

import java.util.Random;

public class _7_랜덤숫자 {

	public static void main(String[] args) {
		// 랜덤하게 숫자를 제공해주는 클래스 Random
		// 랜덤 숫자를 제공해주는 클래스는 크게 2가지(Random, Math)
		
		Random ran = new Random();
		int x = ran.nextInt(10); // 스캐너의 nextInt()와 이름은 같지만 다른 기능임. 랜덤한 숫자를 뽑아주는 기능.
		//.nextInt() : 랜덤 수의 범위는 int형 숫자 범위로 나옴.
		//.nextInt(10) : 0~9까지의 랜덤숫자 (총 10개)
		int y = ran.nextInt(5) + 1; // 1~6까지 랜덤숫자
		// 0~5 -> 1 2 3 4 5 6
		
		System.out.println(x);
		System.out.println(y);
		
	}

}
