package day4;

import java.util.Arrays;

public class _13_선택정렬 {

	public static void main(String[] args) {
		int arr[] = {9,6,7,3,5};
		// 선택정렬은 기본적으로 배열크기-1만큼 진행이 됨!
		for(int i=0; i<arr.length-1; i++) { // 내가 짠 코드
			int minIndex = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
		System.out.println(Arrays.toString(arr));


	}

}
