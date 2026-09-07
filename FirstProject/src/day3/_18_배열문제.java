package day3;

import java.util.Arrays;
import java.util.Random;

public class _18_배열문제 {

	public static void main(String[] args) {
		// 1. 6개의 공간을 가지는 int 배열을 만든 후
		// 1~100사이의 랜덤한 숫자를 넣어주세요.
		// 단, 홀수만

		Random r = new Random();
		int arr[] = new int[6];
		for(int i=0; i<arr.length; i++) {
			int randNum = r.nextInt(100)+1;
			if(randNum%2==1) { // 홀수면 대입
				arr[i] = randNum;
			} else {
				i--;
			}
		}
		System.out.println(Arrays.toString(arr));
		
		
		// 2. 1번에서 만든 배열의 숫자들의 평균을 구하기.
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum/arr.length);
		
		// 3. 1번에서 만든 배열에서 가장 큰 숫자와 가장 작은 숫자의
		// 위치를 바꾸기
		// ex) [33, 67, 97, 59, 9, 93] => [33, 67, 9, 59, 97, 93]
		// 중복된 숫자가 있으면 먼저 나온 숫자를 기준으로 하면 됨. 
		
		int minIndex = 0;
		int maxIndex = 0;
		for(int i=1; i<arr.length; i++) {
			if(arr[maxIndex] < arr[i]) { // max 구하기
				maxIndex = i;
			}
			if(arr[minIndex] > arr[i]) { // min 구하기
				minIndex = i;
			}
		}
		int temp = arr[minIndex];
		arr[minIndex] = arr[maxIndex];
		arr[maxIndex] = temp;
		
		System.out.println(Arrays.toString(arr));

	}

}
