package day10;

import java.util.HashMap;

public class _2_컬렉션복습 {

	public static void main(String[] args) {
		// HashMap => (key, value)
		HashMap<String, Object> map = new HashMap<>();
		// 보통 키는 문자열로 관리(특정 상황에선 Integer 쓰기도)
		map.put("name", "홍길동");
		map.put("age_", "30");
		map.put("height", "170.1");
		System.out.println(map);
		
		System.out.println(map.get("name"));
		
		// 키를 잘못 입력해서 오류로 프로그램 중단됨.
		// 그럼 키를 잘못입력하면 계산 안하게 하고
		// 키를 잘 입력하면 계산하게 하면 되는 로직을 만들면 되지!
		if(map.containsKey("age")) {
			System.out.println((Integer)map.get("age") + 1);
		} // 이렇게
		
		
	}

}
