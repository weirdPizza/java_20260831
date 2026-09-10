package day9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class _8_과일가게수정1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		
		System.out.println("======= 과일 가게 프로그램 =======");
		
		while(true) {
			System.out.print("[(1) 과일등록, (2) 가격수정, (3) 과일구매 (그 외) 종료] : ");
			int menu = s.nextInt();
			if(menu == 1) {
				HashMap<String, Object> map = new HashMap<>();
				System.out.print("과일 이름 입력 : ");
				String name = s.next();
				HashMap<String, Object> fruit=FruitFunc.searchFruit(list, name);
				
				
				if(fruit != null) {
					System.out.println("이미 등록된 과일 입니다");
				}else {
					map.put("name", name);
					
					int price = FruitFunc.nonNegative("가격 입력 : ");
					map.put("price", price);
					
					System.out.print("개수 입력 : ");
					int count = s.nextInt();
					map.put("count", count);
					
					list.add(map);
				}
			} else if(menu == 2) { // 가격수정
				// 같은 거 있으면 가격 변경
				// 같은 거 없으면 '해당 과일 없습니다' 출력
				System.out.print("가격 변경할 과일 이름 입력 : ");
				String name = s.next();
				
				HashMap<String, Object> fruit = FruitFunc.searchFruit(list, name);
				if(fruit==null) {
					System.out.println("해당 과일이 없습니다");
				} else {
					System.out.println("기존 가격 : "+fruit.get("price"));
					System.out.print("변경할 가격 입력 : ");
					int price = s.nextInt();
					fruit.put("price", price); // 객체라서 딴 데서 수정돼도 적용됨. 
				}					
			} else if(menu == 3) {
				System.out.print("구매할 과일 이름 입력 : ");
				String name = s.next();
				
				HashMap<String, Object> fruit = FruitFunc.searchFruit(list, name);
				// <String, Object> 라서 value는 Object로 꺼내짐. 그래서 출력해서 연산할거면 다운캐스팅 해줘야 함.
				if(fruit != null) {
					System.out.println("변경 전 : "+fruit);
					int count = 0;
					do {
						count = FruitFunc.nonNegative("구매할 과일 개수 : ");
						
						if((Integer) fruit.get("count")<count) {
							System.out.println("현재 남은 과일의 개수는 "+(Interger) fruit.get("count"));
						}
						
					} while ((Integer) fruit.get("count")<count);
					
					fruit.put("count", (Integer)fruit.get("count") - count); // (int)로 다운캐스팅해도 자동 번역됨ㅇㅇ
					System.out.println("변경 후 : "+fruit);
					
					System.out.println("총 구매가 : " + count*(Integer)fruit.get(list));
					
				} else { // 입력할 과일 못 찾음
					System.out.println("해당 과일이 없습니다.");
				}
				
				
				
				
				
			} 
			
			
			
		}
	}
		
		
}


