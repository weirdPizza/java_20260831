package day3;

import java.util.Scanner;

public class _2_조건문복습 {

	public static void main(String[] args) {
		// if ~ else if
		// 나이를 입력받은 후, 나이가 19세 이하면 '1000원' 출력
		// 20~65는 '3000원', 65 초과는 '무료'
		Scanner s = new Scanner(System.in);
		System.out.print("나이 입력: ");
		int age = s.nextInt();
		if(age<=19) {
			System.out.println("1000원");
		} else if(age>=20&&age<=65) {
			System.out.println("3000원");
		} else {
			System.out.println("무료");
		}

	}

}
