package day3;

import java.util.Arrays;

public class _17_배열 {

	public static void main(String[] args) {
		int arr[] = {3,5,1,7,4};
		
		// {7,5,1,3,4}
		
		int temp = arr[0]; // 위치를 바꾸고 싶으면 백업을 이용해라!
		arr[0] = arr[3];
		arr[3] = temp;
		
		System.out.println(Arrays.toString(arr));

	}

}
