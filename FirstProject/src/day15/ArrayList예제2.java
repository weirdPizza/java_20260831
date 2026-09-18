package day15;

import java.util.ArrayList;
import java.util.Random;

public class ArrayList예제2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		// 1. list에 1부터 20 사이 랜덤한 숫자 6개 넣기
		// 일단은 중복 신경쓰지 말 것.
		
		Random ran = new Random();
		
		ArrayList<Integer> arr = new ArrayList<>();
//		for(int i=0; i<6; i++) {
//			int ranNum = ran.nextInt(20)+1;
//			if(arr.contains(ranNum)) {
//				i--;
//				continue;
//			}
//			arr.add(ranNum);
//		}
		
		while(list.size() <= 6) {
			int ranNum = ran.nextInt(20)+1;
			if(arr.contains(ranNum)) {
				continue;
			}
			arr.add(ranNum);
		}
		System.out.println(arr);
	}

}
