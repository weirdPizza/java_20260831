package day6;

import java.util.Arrays;
import java.util.Random;

public class ArrayFunc { // 클래스의 private는 X. 아예 못 쓰는 클래스가 되버림
	
	private ArrayFunc(){};
	// 생성자를 private로 막으면 객체 생성이 불가능
	
	static void arrayMax(int arr[]) {
		int max = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("배열에서 가장 큰 값은 "+max+" 입니다");
	}
	
	static int arraySum(int arr[]) {
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	static int arrayChoice(int arr[],int userIndex) {
		return arr[userIndex-1];
	}
	
	static void arrayRandom(int size) {
		Random r = new Random();
		int arr[]= new int[size];
		for(int i=0; i<arr.length; i++) {
			arr[i] = r.nextInt(30)+1;
		}
		System.out.println(Arrays.toString(arr));
	}
}
