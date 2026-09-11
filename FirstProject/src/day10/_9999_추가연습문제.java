package day10;

import java.util.Random;

public class _9999_추가연습문제 {

	public static void main(String[] args) {
//		1. 20개의 공간을 가지는 배열을 생성하고, 랜덤한 숫자 1~10사이의 값을 20개의 공간에 모두 넣으시오.
		int arr[] = new int[20];
//		int count = 0;
		
		Random ran = new Random();
		for(int i=0; i<arr.length; i++) { // 값을 넣음
			int ranNum = ran.nextInt(10)+1;
			arr[i] = ranNum;			
		}
		
		int maxCnt = 0;
		int max = 0;
		for(int i=1; i<=10; i++) { // 값을 출력함
			int count = 0;
			for(int j=0; j<arr.length; j++) {
				if(arr[j]==i) {
					count++;
				}
			}
			if(max < count) {
				maxCnt = count;
				max = i;
			}
			System.out.println(i+" : "+count+"개  ");
		}
		System.out.println("가장 많은 수 : "+ max +", 개수 : "+ maxCnt);
		
			
		
		
	}

}
