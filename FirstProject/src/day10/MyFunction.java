package day10;

import java.util.HashMap;
import java.util.Scanner;

public class MyFunction {
	static Scanner s = new Scanner(System.in);
	
	static String textLength(String msg, int length) { // length 글자 수만큼 쓸 수 있게 강제 가능한 메소드
		while(true) {
			System.out.print(msg);
			String input = s.next();
			if(input.length()==4) {
				return input;
			}else {
				System.out.println("글자 수는 "+length+"글자 입니다. 다시 입력해주세요.");
			}
		}
	}
	
	static int scoreScope(String msg, int min, int max) {
		while(true) {
			System.out.print(msg);
			int input = s.nextInt();
			if(input >= min && input <= max ) { // 범위 내여서 반환
				return input;
			}else {
				System.out.println(min+"~"+max+" 사이의 점수를 입력해주세요.");
			}
		}
	}
	
	
	// 총점 구하는 메소드 내가 만듬
//	static int totalScore(HashMap<String, Object> student) {
//		int total = (Integer)student.get("java") + (Integer)student.get("db")+ (Integer)student.get("html");
//		return total;
//	}
	
	
	
	
}
