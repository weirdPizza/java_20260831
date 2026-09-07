package day4;

public class _10_오버로딩 {

	static int sum(int x, int y) {
		return x + y;
	}
	
	static int sum(int x, int y, int z) {
		return x + y + z;
	}
	
	static double sum(int x, double y) {
		return x + y;
	}

	
	public static void main(String[] args) {
		// 메소드 오버로딩할 때(동일한 이름의 메소드를 여러 개 만들 때)는
		// (1) 매개변수(인자, 파라미터)의 개수가 다르거나 
		// (2) 혹은 매개변수 타입이 다를 때 생성 가능
		
		
		// sum 이름의 메소드를 만들겁니다
		// 1. 정수 2개를 받고 더해서 리턴 해주기
		int result1 = sum(3,5);

		// 2. 정수를 3개 받아서 더해서 리턴 해주는 메소드도 만들고 싶어요
		int result2 = sum(3,5,6);
	
		double result3 = sum(10, 20.5);
		
	}

}
