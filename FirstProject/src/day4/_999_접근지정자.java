package day4;

import day5.User; // 다른 패키지에 존재하는 클래스 갖고 올 땐 임포트
// 클래스의 접근제어자랑 상관없듬

public class _999_접근지정자 {

	public static void main(String[] args) {
		User u = new User();
		u.name = "홍길동"; // 다른 패키지면 public만 접근 가능하단 결론 도출
//		u.age = 30; 다른 패키지이므로 default 접근 불가 
//		u.addr = "인천"; 다른 패키지이므로 protected 접근 불가
//		u.gender = "남"; private라서 접근 불가
		
	}

}
