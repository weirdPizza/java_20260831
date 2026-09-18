package day15;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap예제2 {
	static Scanner s = new Scanner(System.in);
	public static String inputStr(String msg) {
		System.out.print(msg);
		String str = s.next();
		return str;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 스캐너로 학번, 이름, 자바점수, db점수 입력받아서
		// map(hong)에 저장
		// 키는 순서대로 'stuNo, name, java, db'로 저장
		
		HashMap<String, Object> hong = new HashMap<>();

		String stuNo = HashMap예제2.inputStr("학번 입력 : ");
		hong.put("stuNo", stuNo);
		
		String name = HashMap예제2.inputStr("이름 입력 : ");
		hong.put("name", name);
		
		System.out.print("java 입력 : ");
		int java = s.nextInt();
		hong.put("java", java);
		
		System.out.print("db 입력 : ");
		int db = s.nextInt();
		hong.put("db", java);
		
		System.out.println(hong);
	}

}
