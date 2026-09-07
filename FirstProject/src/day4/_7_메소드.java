package day4;

import java.util.Random;

public class _7_메소드 {

	static void firstMethod() {
		// 리턴이 없는 메소드
		System.out.println("내가 만든 첫번째 메소드 호출!");
	}
	
	static int returnMethod() { // void, int 위치에 있는 애들 : 리턴 타입
		// 리턴이 있는 메소드
		int number = 10;
		return number;
	}
	
	static int sum(int x, int y) { 
		return x+y;
	}
	
	public static void main(String[] args) {
		// 함수라고도 표현(메소드와 함수는 약간 차이가 있지만 지금은 같다고 생각해도 됨)
		// 괄호가 있는 애들을 메소드라고 생각하면 됨
		
		// 메소드는 특정행동을 하도록 정의되어 있는 요소
		firstMethod();
		
		// (1) 실행하고 끝나는 메소드  (2) 값을 되돌려주는(리턴) 메소드
//		System.out.println("z"); // (1)
//		
//		Random r = new Random();
//		int ranNum = r.nextInt(10); // (2)
		
		int num = returnMethod();

		// (1) 매개변수(파라미터)가 있는 메소드  (2) 매개변수가 없는 메소드
		int result1 = sum(3,5); // 8 
		int result2 = sum(10, 5); // 15

		
	
	}

}
