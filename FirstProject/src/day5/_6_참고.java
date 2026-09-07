package day5;

public class _6_참고 {

	public static void main(String[] args) {
		// 삼항연산자
		// 상황에 따라서 if~else 대체 가능
		int score = 76;
		String result; // score가 60점 이상이면 Pass 아니면 Fail
//		if(score >= 60) {
//			result = "Pass";
//		}else {
//			result = "Fail";
//		}
		result = score >= 60 ? "Pass" : "Fail";
		// 프린트문은 안됨. result에 문자열 넣어야 돼서 문자열은 가능임.
		
		
		// 향상된 for문
		int arr[] = {1,3,5,2,4};
		for(int element : arr) {
			System.out.println(element);
		} // 몇 번째에 있는지와 같은 인덱스 값은 알 수가 없다.
		
		// final
		int age = 30;
		// 나이는 언젠가는 변할 수 있는 값
		age+=1;
		
		// pi => 3.1415923535...
		// 프젝을 하는데 누군 pi를 3.14로 계산하고
		// 누군 3.1415로 계산을 하고...결국 계산값이 서로 미묘하게 달라짐
		// 그래서 서로 약속을 함. pi는 3.141592로 하자.
		final double PI = 3.14; // 이렇게
		
//		PI = 3030; // final은 후에 수정을 불가하게 만들어줌.
		// 다 대문자로 선언해야 함. _언더바 허용. STUDENT_NAME
		// final로 선언된 변수를 '상수'라고 표현

	}

}
