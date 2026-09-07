package day4;

import java.util.Arrays;

public class _12_선택정렬 {

	public static void main(String[] args) {
		int arr[] = {9,6,7,3,5};
		
		// arr에서 가장 작은 숫자를 찾아서 맨 앞에 숫자랑 자리 바꾸기
		int minIndex = 0;
		for(int i=1; i<arr.length; i++) {
			if(arr[minIndex] > arr[i]) {
				minIndex = i;
			}
		}
		int temp = arr[0];
		arr[0] = arr[minIndex]; // 백업한 것엔 덮어쓰기 가능이니깐
		arr[minIndex] = temp;
		
		System.out.println(Arrays.toString(arr));

		// 배열의 크기가 100이라면
		// 99번 반복문 쭉 작성?
		// 아래 코드를 반복문 안의 반복문으로 처리
		

	}

}
