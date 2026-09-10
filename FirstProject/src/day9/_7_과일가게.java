package day9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class _7_과일가게 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		
		System.out.println("======= 과일 가게 프로그램 =======");
		
		while(true) {
			System.out.print("[(1) 과일등록, (2) 가격수정, (3) 미정 (그 외) 종료] : ");
			int menu = s.nextInt();
			if(menu == 1) {
				// 과일이름, 가격, 개수 입력받아서 map 에 저장 후 
				// list 에 저장
				// 단, 동일한 이름의 과일이 이미 있으면 
				// '이미 등록된 과일 입니다' 출력 후 다시 메뉴로 이동
				HashMap<String, Object> map = new HashMap<>();
				
				System.out.print("과일 이름 입력 : ");
				String name = s.next();
				Boolean registerFlg = false;
				for(int i=0; i<list.size(); i++) {
					if(list.get(i).get("이름").equals(name)) {
						System.out.println("이미 등록된 과일 입니다");
						registerFlg = true;
						break;
					}
				}
				if(registerFlg == true) {
					continue;
				}
				map.put("이름", name);
				
				System.out.print("가격 입력 : ");
				int price = s.nextInt();
				map.put("가격", price);
				
				System.out.print("개수 입력 : ");
				int count = s.nextInt();
				map.put("개수", count);
				
				list.add(map);

			} else if(menu == 2) {
				// 과일 이름 입력받아서 과일이 없으면 '해당 과일 없습니다' 출력
				// 있으면 가격 입력받아서 해당 가격으로 변경
				System.out.print("가격을 변경할 과일 이름 입력 : ");
				String name = s.next();
				Boolean searchFlg = false;
				for(int i = 0; i<list.size(); i++) {
					if(list.get(i).get("이름").equals(name)) { // 가격 변경할 과일 있음
						System.out.println("기존 가격 : "+list.get(i).get("가격"));
						System.out.print("변경할 가격 입력 : ");
						int price = s.nextInt();
						list.get(i).put("가격",price);
						searchFlg = true;
						break;
					}
				}
				if(searchFlg == false) { // 가격 변경할 과일 없으면
					System.out.println("해당 과일이 없습니다");
				}
				

				
			}
			
			
			
			
			
			
		}
	}

}
