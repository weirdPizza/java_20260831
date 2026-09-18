package day15;

public class Private변수 {

	public static void main(String[] args) {
		Human hong = new Human("홍길동", 30);
		hong.setAge(100);
//		hong.setAge(-100);
		
		System.out.println(hong.getAge());
		
		Human.intro();
		hong.intro = "zzzzzzzzz";
		
		System.out.println(Human.intro);
		
//		Math math = new Math(); 생성자가 private이라 객체 생성 불가
//		Math 클래스는 모든 멤버가 static이라 객체 생성 없이 사용 가능
		int max = Math.max(10, 20);
		
		
	}

}
