package day15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		// 대소문자는 다 대문자로 취급
		System.out.println("영문 텍스트를 입력하고 세미콜론을 입력하세요.");
		Scanner s = new Scanner(System.in);
		
		String str = ""; // 텍스트 저장
		while(true) { // 영문 입력 조건 처리 해야함
			String tempStr = s.next();
			str += tempStr;
			if(str.substring(str.length()-1).equals(";")) {
				str = str.substring(0, str.length()-1); // 세미콜론은 없앰
				System.out.println("종료");
				break;
			}else {
				continue;
			}
		}
		System.out.println(str);
		// substring() 이용해야하나
		System.out.println("히스토그램을 그립니다.");
		
		ArrayList<String> alpha = new ArrayList<>(); // 알파벳 배열
		for(int i=65; i<=90; i++) {
			char temp = (char) i;
			alpha.add(Character.toString(temp));
		}
		
		HashMap<String, String> histogram = new HashMap<>();
		for(int i=0; i<alpha.size(); i++) {
			histogram.put(alpha.get(i), "");
		} // 알파벳 맵 만듦
		
		// 아 키 리스트랑 비교를 해야하네 맵의 키를 꺼내긴 힘드니까!
  // 집가서 수정
		for(int i=0; i<str.length(); i++) {
			String temp = str.substring(i, i+1);
			String value = histogram.get(temp); 
			if(alpha.contains(temp)) {
				histogram.put(temp, value+"-");
			}
		}
		System.out.println(histogram);
		
//		for(int i=0; i<str.length(); i++) {
//			String alphaTemp = str.substring(i, i+1);
//			
//			for(int j=0; j<alpha.size(); j++) {
//				if(alpha.get(j).equals(alphaTemp)) {
//					System.out.println(alphaTemp);
//					histogram.put(alphaTemp,histogram.get(alphaTemp)+"-");;
//					break;
//				}
//			}
			
			
		}
		
//		System.out.println(histogram);
//			
//		}
		
//		for(int )
		
		// 해시 맵으로 출력해야 할 듯 
		
}


