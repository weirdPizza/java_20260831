package day6;

import java.util.Arrays;

public class _4_Static {

	public static void main(String[] args) {
		int arr[] = {3,5,2,4,1};
		
//		ArrayFunc af = new ArrayFunc(); // 객체를 만들 필요가 없다 이거야
		// 기능만 쓰는 클래스는 객체를 만들 필요가 없이 쓰는 게 더 효율적
		// 하지만 사람관리 프로그램은 객체를 만들어야 겠지? 이런 식으로 구분해.
//		ArrayFunc af = new ArrayFunc();
//		af.arrayMax(arr); // 굳이 객체 만들어서 접근할 필요 x
		
		// 메소드를 static으로 선언했으므로
		ArrayFunc.arrayMax(arr);
		
		Arrays.sort(arr); // 정렬함수
		System.out.println(Arrays.toString(arr)); // Arrays는 클래스 이름. toString()은 static으로 선언됨.
		// Arrays도 생성자가 private로 막아져있음. 클래스이름으로 쓰도록 종용하기 위해.
	}

}
