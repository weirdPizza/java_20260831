package day8;

import java.util.Scanner;

public class _7_서브스트링 {

	public static void main(String[] args) {
//		String text = "Hello JAVA";
//		System.out.println(text.substring(1)); // 인덱스 1부터 끝까지 출력
//		System.out.println(text.substring(2, 7)); // 인덱스 2부터 7되기 전까지 출력
		
//		String text = "Hello";
//		// 첫 글자를 맨 뒤로 보내고 싶어요.
//		String result = text.substring(1) + text.substring(0,1);
//		System.out.println(result.toUpperCase());
		
		Scanner s = new Scanner(System.in);
		System.out.print("문자 입력: ");
		String text = s.next();
//		System.out.println(text.length());
		for(int i=0; i<text.length(); i++) {
			String result = text.substring(i+1) + text.substring(0, i+1);
			System.out.println(result);
		}
		
	}

}
