package day15;

import java.util.ArrayList;
import java.util.HashMap;

public class Json2 {

	public static void main(String[] args) {
		Human h[] = {new Human("홍길동", 30),new Human("김철수", 25),new Human("박영희", 21),new Human("김나리", 27),new Human("송아린", 35)};
		// 얘넬 우리가 외부에서 받았다 쳐
		
		// key -> name, age
		// 맵으로 만들고 리스트에 추가
		
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		for(int i=0; i<h.length; i++) {
			HashMap<String, Object> map = new HashMap<>();
			
			map.put("name", h[i].getName());
			map.put("age", h[i].getAge());
			
			list.add(map);
		}
		
		System.out.println(list);
		
		
	}

}
