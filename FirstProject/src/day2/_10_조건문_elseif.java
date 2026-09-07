package day2;

public class _10_조건문_elseif {

	public static void main(String[] args) {
		// else는 조건이 2개로 끝날 때(참&거짓일 때) 사용
		// else if는 조건이 여러 개일 때 사용
		
		int score = 105;
		// 90~100점 A학점
		// 80~89점 B학점
		// ...60점 미만 F학점 출력
		// 100점 초과하면 '다시 입력하세요' 출력
		/*
		 * if(score/10>=9) { System.out.println("A학점"); }
		 */
		
		if(score>100) {
			System.out.println("다시 입력하세요");
		}else if(score>=90&&score<=100) {
			System.out.println("A학점");
		}else if(score>=80&&score<90) {
			System.out.println("B학점");
		}else if(score>=70&&score<80) {
			System.out.println("C학점");
		}else if(score>=60&&score<70) {
			System.out.println("D학점");
		}else {
			System.out.println("F학점, 공부해라!");
		}

	}

}
