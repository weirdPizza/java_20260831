package day1;

public class _3_변수 {

	public static void main(String[] args) {
//		int num1 = 12341234123; // +- 21억 정도까지 허용
		long num2 = 12341234123l; // 그 이상 가능, 21억 넘으면 뒤에 'l' 붙여야 함.
		
		float num3 = 1.1234f; // 뒤에 'f' 붙여야 함. 2의 32제곱의 개수 한계로 약간의 오차가 있을 수 있음.
		double num4 = 1.1234; // double 써라
		
		// char 변수 값은 숫자랑 매핑이 된다(아스키코드)
		char num5 = 'a';
		System.out.println(num5+2); // 99
		
		// 학생을 만들어서 출력
		String stuName = "홍길동";
		int age = 20;
		String addr = "인천";
		String phone = "010-1111-1111"; // 핸드폰 번호는 문자열로 취급, 사칙연산할 일이 없으니깐
		double stuGrade = 3.93;
		
		
		System.out.println(stuName + "의 나이는 " + age + "살, 학점은 " + stuGrade + "점 입니다.");
	}

}
