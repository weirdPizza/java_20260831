package day3;

import java.util.Arrays;
import java.util.Random;

public class _14_배열 {

	public static void main(String[] args) {
		int arr[] = new int[5]; // {0,0,0,0,0}
		// 5개의 공간을 가지는 숫자형(int) 배열에
		// 1~10사이의 랜덤한 숫자를 채우기

		Random r = new Random();
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = r.nextInt(10)+1;
			for(int j=0; j<i; j++) { // 이건 내가 쓴 코드. 중복값 거르기!
				if(arr[i] == arr[j]) {
					i--;
				}
			}
		}
		// # 참고, Arrays.toString(); -> 배열의 모든 값 확인 가능
		System.out.println(Arrays.toString(arr));
	}

}
