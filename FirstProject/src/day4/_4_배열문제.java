package day4;

import java.util.Arrays;
import java.util.Scanner;

public class _4_배열문제 {

	public static void main(String[] args) {
		// 사용자로부터 입력받은 숫자를 배열에 저장
		// 1부터 100사이 값이 아닐 경우 다시 입력하도록 
		
		Scanner s = new Scanner(System.in);
		int arr[] = new int[5];
		for(int i=0; i<arr.length; i++) {
			System.out.print((i+1)+"번째 숫자 입력: "); 
			// 사용자 관점에서 i+1로 1번째부터 시작되게 만들어야!
			int input = s.nextInt();
			if(input>=1&&input<=100) {
				arr[i] = input;				
			}else {
				System.err.println("1부터 100 사이의 값을 입력해주세요!");
				i--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
