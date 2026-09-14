package day11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _9999_추가연습문제 {
	
//	# 두 정수 배열이 주어졌을 때, 순서는 다르더라도 동일한 숫자들이 동일한 개수만큼 포함되어 있다면 true를 반환하는 메소드를 작성하시오
	public static boolean sameNumberCounts(int[] arr1, int[] arr2) {
		int arr1NumArr[] = new int[arr1.length];
		int arr2NumArr[] = new int[arr2.length];

		for(int i=0; i<arr1.length; i++) {
			arr1NumArr[arr1[i]]++;
		}
		for(int i=0; i<arr2.length; i++) {
			arr2NumArr[arr2[i]]++;
		}
		
		System.out.println(Arrays.toString(arr1NumArr));
		System.out.println(Arrays.toString(arr2NumArr));
		
		if(Arrays.equals(arr1NumArr, arr2NumArr)) {
			return true;
		}else {
			return false;
		}
	}
		
	
	
	// 입력: [1, 2, 2, 3], [3, 2, 1, 2]
	// 출력: true

	// 입력: [1, 2, 2], [1, 2, 3]
	// 출력: false

//	# 두 개의 정수 배열이 주어졌을 때, 공통으로 포함된 숫자들만 중복 없이 리스트로 반환
	// 예시 입력: {1, 2, 3, 4}, {3, 4, 4, 5}
	// 예시 출력: [3, 4]
	public static List<Integer> findIntersection(int[] arr1, int[] arr2) {
	    List<Integer> duplicateNum = new ArrayList<>();
		for(int i=0; i<arr1.length; i++) {
	    	for(int j=0; j<arr2.length; j++) {
	    		if(arr1[i]==arr2[j]) {
	    			duplicateNum.add(arr1[i],3);
	    		} // 인덱스 위치가 곧 값.
	    	}
	    }
		System.out.println(duplicateNum);
		return null;
	}

}
