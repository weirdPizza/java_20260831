package day8;

public class PositivePoint extends Point{

	PositivePoint(){
		super(0,0);
	}
	PositivePoint(int x, int y){
		super(x,y); // super가 무조건 위에 있어야 하니까 이런 코드인거ㅇㅇ
		if(x<0&&y<0) {
			move(0,0);
		}
		
	}
	@Override
	protected void move(int x, int y) {
		if(x>=0&&y>=0) {
			super.move(x, y);
		}
	}
	
	@Override
	public String toString() {
		
		return "("+getX()+", "+getY()+")의 점";
	}
	
}
