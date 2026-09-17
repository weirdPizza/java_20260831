package day14;

import java.util.Arrays;

public class _2_2차원배열_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[3][5];
		int num = 1;
		for(int i=0; i<arr.length; i++) { // 0 1 2
			for(int j=0; j<arr[i].length;j++) { // 
				arr[i][j] = i+j+1;
			}
		}
		System.out.println(Arrays.toString(arr[0]));
	}

}
