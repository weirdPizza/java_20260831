package day12;

import java.util.Map;

public class _9999_추가연습문제 {

	// 알고리즘

//	1. 문장이 주어졌을 때, 각 단어가 몇 번씩 나오는지 세어 Map<String, Integer> 형태로 반환
	// 입력 예시: "Hello world, hello Java!"
	// 출력 예시: {hello=2, world=1, java=1}
	// (대소문자 구분 없이 처리, 마침표/쉼표 같은 기호는 제거)
	public static Map<String, Integer> countWords(String sentence) {
	    // 구현
		// 띄어쓰기 기준으로 자름 , 기호 제거 -> 배열 안에 넣어두고
		// 반복문 안에 가두고 .equals()조건으로 만들기(대소문자 구분X : upper처리)
		String list[] = new String[50];
		list = sentence.split(" "); // 기호도 제거해야함
		
		int count = 0;
		String temp;
		for(int i=0; i<list.length; i++) {
			temp = list[i]; // 비교할 대상
			for(int j=0; j<list.length; j++) {
				if(temp.equals(list[j])) { 
					count++;
				}
			}
			// 맵에 넣어야 함.
			System.out.print(temp+","+count);
			
			
		}
		return null;
		
		
	}

//	2. 두 정수 배열이 주어졌을 때, 순서는 다르더라도 동일한 숫자들이 동일한 개수만큼 포함되어 있다면 true를 반환
	// 입력: [1, 2, 2, 3], [3, 2, 1, 2]
	// 출력: true

	// 입력: [1, 2, 2], [1, 2, 3]
	// 출력: false
//	public static boolean hasSameElementCounts(int[] arr1, int[] arr2) {
//	    // 구현
//	}

//	3. 같은 문자가 연속으로 반복될 경우, 문자 뒤에 반복된 횟수를 붙여 압축한 문자열을 반환
	// 입력: "aaabbcddd"
	// 출력: "a3b2cd3"
//	public static String compressString(String input) {
//	    // 구현
//	}
	
//	public static void main(String[] args) {
//		countWords("Hello world, hello Java!");
//	}
}
