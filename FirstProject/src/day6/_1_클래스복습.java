package day6;

public class _1_클래스복습 {

	public static void main(String[] args) {
		Food food1 = new Food();
		Food food2 = new Food("라면",3000);
		Food food3 = new Food("김찌", 8000, "한식");
		
		String info = food2.getInfo();
		System.out.println(info);
		
		System.out.println(food3.getInfo());
		
		// 이름, 가격, 종류 중 하나라도 값이 없으면
		// 정보가 없습니다 출력
		// Food의 메소드를 통해 제어!
		System.out.println(food1.getInfo());
		
//		food2.price = 4000; // private이므로 접근 불가
		// set, add, put
		food2.setPrice(4000);
		System.out.println(food2.getPrice());
		

	}

}
