package day4;

public class _1_배열복습 {

	public static void main(String[] args) {
		// 배열을 선언하고 값을 채우는 방법
		// 배열 선언과 동시에 초기화
		int arr[] = new int[5]; // 5개의 공간을 가지는 배열 선언
		// 5개의 공간이 모두 0으로 초기화 된 상태
		// 배열의 최대 index는 전체크기 - 1, 0부터 시작하기 때문.
		// 크기가 5일 경우 arr1[4]까지 가능, arr1[5] 사용하면 에러 발생 
		
		int[] arr2 = {3,5,2,4,1};
		
		for(int i=0; i<arr2.length; i++) { 
			// i<=arr2.length로 =을 붙이면 안됨. 왜? index-1이니깐!
			System.out.println(arr2[i]);
		}
		

	}

}
