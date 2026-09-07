package day2;

import java.util.Scanner;

public class _21_중첩반복연습문제 {

	public static void main(String[] args) {
		// 1. 구구단 역순으로 출력(9단부터)
		// 9*1=9, 9*2=18...2*9=18
		for(int i=9; i>=2; i--) {
			System.out.println("==== " +i+ "단 ====");
			for(int j=1; j<=9; j++) {
				System.out.println(i +" * "+ j + " = " +i*j );
			}
		}
		
		System.out.println();
		
		// 2. 숫자 하나 입력받아서 해당 숫자만큼 별표 늘려가면서 출력
		// ex) 3를 입력하면
		// *
		// **
		// ***
		System.out.println("숫자 입력: ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
