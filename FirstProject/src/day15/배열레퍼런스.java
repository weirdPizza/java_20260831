package day15;

import java.util.Arrays;

public class 배열레퍼런스 {
	static void plusArr(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			arr[i] += 1;
		}
	}
	
//	static int[] plusArr(int[] arr) {
//		for(int i=0; i<arr.length; i++) {
//			arr[i] += 1;
//		}
//		return arr;
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,5,4,2,1};
		plusArr(arr);
//		System.out.println(Arrays.toString(newArr));
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr); // 얘도 리턴 안받음!
		// 왜? 인자로 보낸 arr과 같은 배열을 가리키고 있기 때문에!
		// 굳이 int[] 변수로 받을 필요가 없다!!
	}

}
