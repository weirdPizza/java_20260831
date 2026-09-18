package day15;

import java.util.HashMap;

public class HashMap예제1 {

	public static void main(String[] args) {
		// key, value
		HashMap<String, Object> hong = new HashMap<>();
		hong.put("name", "홍길동");
		hong.put("age", 30);
		hong.put("height", 170.1);
		
		System.out.println(hong);
		
		HashMap<String, Object> addr = new HashMap<>();
		addr.put("도로명주소", "인천시 부평구 머쩌구 머쩍");
		addr.put("상세주소", "oo동 oo호");
		addr.put("우편번호", "123-123");
	
		hong.put("address", addr);
		System.out.println(hong);
		HashMap map = (HashMap<String,Object>)hong.get("address"); // 맵에서 나올 땐 Object로 나오니까!
		System.out.println(map.get("도로명주소"));
	}

}
