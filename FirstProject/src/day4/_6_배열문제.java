package day4;

import java.util.Arrays;
import java.util.Random;

public class _6_배열문제 {

	public static void main(String[] args) {
		// 6개의 공간에 1~45사이의 랜덤한 숫자 넣기

		Random r = new Random();
		int arr[] = new int[6];
		for(int i=0; i<arr.length; i++) {
			arr[i] = r.nextInt(45)+1;
			for(int j=0; j<i; j++) {
				if(arr[j]==arr[i]) {
					i--;
					break;
				}
			}			
		}
		System.out.println(Arrays.toString(arr));

	}

}
