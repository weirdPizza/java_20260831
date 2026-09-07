package day3;

public class _16_배열문제 {

	public static void main(String[] args) {
		int arr[] = {3,5,1,7,4};
		// 배열에서 가장 작은 숫자의 위치(index)를 알고 싶어요
		int minIndex = 0;
		for(int i=1; i<arr.length; i++) {
			if(arr[minIndex]>arr[i]) {
				minIndex = i;
			}
		}
		System.out.println(minIndex);

	}

}
