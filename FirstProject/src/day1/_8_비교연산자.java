package day1;

public class _8_비교연산자 {

	public static void main(String[] args) {
		// 크다, 작다, 크거나 같다 기타 등등
		int num1 = 100;
		int num2 = 50;
		
		System.out.println(num1 > num2); // true
		System.out.println(num1 < num2); // false
		
		System.out.println(num1 > 100); // false
		System.out.println(num1 >= 100); // true
		
		System.out.println(num1 = 100); // 100
		System.out.println(num1 == 100); // true
		System.out.println(num1 == num2); // false
		
		// 프로그래밍에서 느낌표(!)는 대부분 부정으로 사용됨
		System.out.println("=================");
		System.out.println(true);
		System.out.println(!true); // false
		
		System.out.println(!(num1 > num2)); // false
		
		// num1과 num2과 다르냐?
		System.out.println(num1 != num2); // true
		
	}

}
