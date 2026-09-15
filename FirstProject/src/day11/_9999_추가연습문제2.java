package day11;

import java.util.List;

public class _9999_추가연습문제2 {

	public static void main(String[] args) {
		int arr1[] = {1,2,3,4};
		int arr2[] = {3,4,4,5};

//		boolean result =_9999_추가연습문제.sameNumberCounts(arr1, arr2);
//		System.out.println(result);
		
		// 예시 입력: {1, 2, 3, 4}, {3, 4, 4, 5}
		// 예시 출력: [3, 4]
		List<Integer> result2 = _9999_추가연습문제.findIntersection(arr1, arr2);
		System.out.println(result2);
	}

}
