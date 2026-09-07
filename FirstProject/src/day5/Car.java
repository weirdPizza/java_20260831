package day5;

public class Car {
	// 필드(변수)
	String modelName;
	String color;
	private int price;
	int speed; // 현재 속도
	
	// 생성자
	Car(String modelName, String color, int price){
		this.modelName = modelName;
		this.color = color;
		this.price = price;
	}
	
	Car(String modelName, String color){ // 생성자 오버로딩
		this.modelName = modelName;
		this.color = color;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if(price <= 0) {
			System.out.println("가격은 1 이상 입력해주세요");
			return;
		}
		this.price = price;
	}

	// 메소드
	void speedUp(int speed) {
		this.speed += speed; // this.speed = this.speed + speed;
		System.out.println("현재 속도는 " + this.speed + "입니다");
	} 
	// 오버로딩
	void speedDown() {
		// 속도를 0으로 변경
		this.speed = 0;
		System.out.println("자동차가 정지했습니다");
	}
	void speedDown(int speed) {
		this.speed -= speed;
		System.out.println("현재 속도는 " + this.speed + "입니다");
	}
	
	String carInfo() {
		String info = "모델명: " + this.modelName + ", 색상: " + color;
		return info;
	}
	
}
