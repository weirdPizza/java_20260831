package day6;

public abstract class _Calc { 
	// 회의 결과로 이 정도가 구현되어야 함. 이걸 부하 직원한테 던지면서 구현하라 하면 됨.
	// 하나라도 안 구현하면 객체 생성이 불가하니 강제로 다 구현해야 함.
	// 설계용
	void info() { // 추상 클래스 안에 일반 메소드 당연히 들어가도 됨
		System.out.println("아주 좋은 계산기 입니다.");
	}
	// 덧셈
	abstract int sum(int x, int y);
	abstract int sum(int x, int y, int z);
	
	// 곱셈
	abstract int multiple(int x, int y);
	
	// 나눗셈
	abstract double divide(int x, int y);
}
