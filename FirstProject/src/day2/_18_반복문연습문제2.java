package day2;

import java.util.Scanner;

public class _18_반복문연습문제2 {

	public static void main(String[] args) {
		// 1. 숫자 10부터 1까지 역순으로 출력
		for(int i=10; i>=1; i--) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println();
		
		// 2. 1부터 100까지 숫자 중 3의 배수의 합 출력
		int sum = 0;
		for(int i=1; i<=100; i++) {
			if(i%3 == 0) {
				sum+=i;
			}
		}
		System.out.println("1부터 100까지의 숫자 중 3의 배수의 합: " + sum);

		System.out.println();
		
		// 3. 스캐너로 숫자를 하나 입력받고 (정수&양수)
		// 1부터 해당 숫자까지의 합 출력
		int sum2 = 0;
		System.out.print("숫자를 하나 입력해주세요: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for(int i=1; i<=num; i++) {
			sum2 += i;
		}
		System.out.println("입력받은 숫자 "+ num +"까지의 합: "+sum2);
		
	}

}
