package day9;

import java.util.ArrayList;
import java.util.Random;

public class _2_ArrayList문제 {

	public static void main(String[] args) {
		// ArrayList에 1부터 30 사이의 랜덤한 숫자 10개 넣기
		// 단, 중복 없도록
		
		Random r = new Random();
		ArrayList<Integer> list = new ArrayList<>();
		
//		for(int i=0; i<10; i++) { 
//			int ranNum=r.nextInt(30)+1;
//			if(list.contains(ranNum)) {
//				i--;
//				continue;
//			}
//			list.add(ranNum);
//		}
//		System.out.println(list);
		
		while(list.size()<10) {
			int ranNum=r.nextInt(30)+1;
			if(!list.contains(ranNum)) {
				list.add(ranNum);
			}
		}
		System.out.println(list);
		
	}

}
