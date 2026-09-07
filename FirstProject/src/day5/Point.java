package day5;

public class Point {
	private int x, y; // 한점을 구성하는x, y 좌표
	public void set(int x, int y) {
	this.x= x; this.y= y;
	}
	public void showPoint() { // 점의좌표출력
	System.out.println("(" + x + "," + y + ")");
	}

}
