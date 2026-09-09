package day8;

public class _0_and_or {
	static boolean test(int x) {
		System.out.println("원하는 메시지~~");
		return x > 30;
	}
	
	public static void main(String[] args) {
//		&&, ||
		int a = 100;
		int b = 50;
		if (a>100 && test(b)) { // 메시지 출력 안됨.
			System.out.println("두 수 모두 큰 수 입니다.");
		}
		
		if (a>100 & test(b)) { // 메시지 출력함. 이때 &를 씀.
			System.out.println("두 수 모두 큰 수 입니다.");
		}
	}
}
