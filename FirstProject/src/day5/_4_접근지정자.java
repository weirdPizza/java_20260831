package day5;

public class _4_접근지정자 {

	public static void main(String[] args) {
		User u = new User();
		u.name = "홍길동";
		u.age = 30;
		u.addr = "인천";
//		u.gender = "남"; private라서 접근 불가
		
	}

}
