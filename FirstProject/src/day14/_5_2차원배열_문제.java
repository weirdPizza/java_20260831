package day14;

import java.util.Random;

public class _5_2차원배열_문제 {

	public static void main(String[] args) {
		int arr[][] = new int[4][4];
		
		Random ran = new Random();
		for(int i=1; i<=10; i++) {
			int x = ran.nextInt(10)+1;
			int y = ran.nextInt(10)+1;
			
			if(arr[x][y]!=0) {
				i--;
				continue;
			}
			arr[x][y]=i;
		}
		for(int i=0; i<arr.length; i++) {
			if(i==arr.length-1) { // 마지막행에선 각 열 총합
				
			}
			for(int j=0; j<arr.length; j++) {
				if(j==3) {
					
				}
			}
		}
		
	}

}
