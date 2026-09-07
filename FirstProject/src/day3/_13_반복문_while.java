package day3;

public class _13_반복문_while {

	public static void main(String[] args) {
		// while 
		// for문처럼 선언식, 조건식, 증감식 존재해야 함.
		// 다만, 위치가 제각각
//		int i = 1;
//		while(i<=10) { // 괄호 안에는 조건식만 들어간다.
//			System.out.println(i);
//			i++; // 증감식의 위치를 신경쓰걸아
//		}
		
		// 중첩 while문을 이용해서 구구단을 작성해봐라.
		int i = 2;
		while(i<=9) {
			System.out.println("=== "+ i+"단 ===");
			int j=1;
			while(j<=9) {
				System.out.println(i+" * " +j +" = " + i*j);
				j++;
			}
			i++;
		}

	}

}
