package day8;

public class Point3D extends Point{
	private int z;
	
	Point3D(int x, int y, int z){
		super(x, y);
		this.z = z;
	}
	void move(int x, int y, int z) {
		super.move(x, y);
		this.z = z;
	}
	void moveUp() {
		this.z++;
	}
	void moveDown() {
		this.z--;
	}
	@Override
	public String toString() {
		return "("+getX()+", "+getY()+", "+z+")의 점";
	}
}
