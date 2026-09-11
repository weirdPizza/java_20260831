package day10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FruitFunc {
	static HashMap<String, Object> searchFruit(ArrayList<HashMap<String, Object>> list, String name) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).get("name").equals(name)) {
				return list.get(i);
			}
		}
		return null;
	}

}
