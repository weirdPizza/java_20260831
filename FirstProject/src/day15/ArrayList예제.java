package day15;

import java.util.ArrayList;

public class ArrayList예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=1; i<=5; i++) {
			list.add(i);
		}
		list.add(1,100);
		System.out.println(list); 
		// 컬렉션은 .toString()을 오버라이딩 했기 때문에 print해도 주소 안나오고 값 잘 나옴
		
		int sum = 0;
		for(int i=0; i<list.size(); i++) {
			sum += list.get(i);
		}
		System.out.println(sum);
		
		
		if(true == list.contains(3)) {
			System.out.println("3이 있다!");
		}
		
	}

}
