package day3;

public class _15_배열 {

	public static void main(String[] args) {
		int arr[] = {3,5,2,7,4};
		// 배열에서 가장 큰 숫자가 뭔지 알고 싶어요
		int max = arr[0]; // 7. 초기화를 arr[0]으로 설정해야 arr[]에 음수만 있을 때도 안전함.
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println(max);

	}

}
