package day6;

public class _8_업캐스팅 {
	
	static void fruitBoxing(Fruit f) {
		// Object를 파라미터로 안 받는 이유? 뭐겠어. 오직 과일만을 범위 좁히려고ㅇㅇ
		System.out.println(f.name+"를 포장했습니다.");
		// 이거 하나만 있어도 모든 애들을 포장할 수 있게 됨.
	}
	
	// 밑에 코드는 필요 없어
	static void appleBoxing(Apple a) {
		System.out.println(a.name+"를 포장했습니다.");
	}
	static void orangeBoxing(Orange a) {
		System.out.println(a.name+"를 포장했습니다.");
	}
	static void bananaBoxing(Banana a) {
		System.out.println(a.name+"를 포장했습니다.");
	}


	public static void main(String[] args) {
		Fruit f = new Fruit("과일");
		
		Apple apple1 = new Apple("사과");
		Orange orange1 = new Orange("오렌지");
		Banana banana1 = new Banana("바나나");
		
		appleBoxing(apple1);
		
		fruitBoxing(apple1);
		fruitBoxing(orange1);
		fruitBoxing(banana1);
		
//		f = apple1;
////		orange1 = banana1; 안된다
//		f = banana1;
//		Fruit fruit2 = orange1; 
		
	}

}
