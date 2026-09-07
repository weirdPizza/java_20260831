package day4;

import java.util.Arrays;
import java.util.Scanner;

public class _5_배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사용자로부터 입력받은 숫자를 배열에 저장
		// 중복된 숫자가 없으면 좋겠다
		
		Scanner s = new Scanner(System.in);
		int arr[] = new int[5];
		for(int i=0; i<arr.length; i++) { // 중복된 값을 넣어도 덮어씀
			System.out.print((i+1)+"번째 숫자 입력: "); 
			// 사용자 관점에서 i+1로 1번째부터 시작되게 만들어야!
			int input = s.nextInt();
			arr[i] = input; 
			for(int j=0; j<i; j++) {
				if(arr[j] == input) {
					i--;
					System.out.println("중복된 숫자가 존재합니다");
					break;
				}
			}
			
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
