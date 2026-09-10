package day9;

import java.util.ArrayList;

public class _1_ArraList {

	public static void main(String[] args) {
//		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list = new ArrayList<>();
		
		// 데이터 삽입
		list.add(10);		
		list.add(25);		
		list.add(12);
//		System.out.println(list.toString()); 과 아래는 같다 .toString()은 생략이 가능
		System.out.println(list);
		
		list.add(1,100);
		System.out.println(list);
		System.out.println(list.contains(99));
		
		list.remove(1);
		System.out.println(list);
		
		int sum = 0;
		for(int i=0; i<list.size(); i++) {
			sum+=list.get(i);
		}
		System.out.println(sum);
		
		// add, get, contains, remove 꼭 기억!
		
	}

}
