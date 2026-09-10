package day9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FruitFunc {
	
	static Scanner s = new Scanner(System.in);
	
	static HashMap<String,Object> searchFruit(ArrayList<HashMap<String, Object>> list, String name) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).get("name").equals(name)) {
				return list.get(i); // 리턴만 하면 메소드 끝나서 break 필요 없음
			}
		}
		return null;
	}
	

	static int nonNegative(String msg) {
		System.out.print(msg);
		int num = s.nextInt();
		while(true) { 
			if(num>0) {
				return num;
			}else {
				System.out.println("1 이상의 숫자를 입력해주세요");
			}
			
		}
		
	}
	
	
	
		
		
		
		
}
	

