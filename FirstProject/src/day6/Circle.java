package day6;

public class Circle extends Shape{
	@Override
	public void draw() { // 오버라이딩
		super.draw();
		System.out.println("원을 그린다!");
	}
}
