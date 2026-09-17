package day14;

import java.util.Arrays;
import java.util.Random;

public class _4_2차원배열_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[4][4];
		
		Random ran = new Random();
	
		
		for(int i=1; i<=10; i++) {
			int x= ran.nextInt(4);
			int y= ran.nextInt(4);
			
			if(arr[x][y]!=0) {
				i--;
				continue;
			}
			arr[x][y] = i;
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
