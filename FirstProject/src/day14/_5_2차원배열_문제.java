package day14;

import java.util.Arrays;
import java.util.Random;

public class _5_2차원배열_문제 {

	public static void main(String[] args) {
		int arr[][] = new int[4][4];
		
		Random ran = new Random();
		
		for (int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr[i].length-1; j++) {
				int ranNum = ran.nextInt(10)+1;
				arr[i][j] = ranNum;
				arr[i][arr[i].length-1] += ranNum;
				arr[arr.length-1][j] += ranNum;
				arr[3][3] += ranNum;
				
			}
		} // 값 넣기
		// 이상한데 다시 보고 써라
		
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
			
	}
	
		
}


