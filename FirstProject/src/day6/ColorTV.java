package day6;

public class ColorTV extends TV{
	private int color;
	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}
	protected int getColor() {return this.color;}
	public void printProperty() {
		System.out.println(this.getSize()+"인치 "+this.getColor()+"컬러");
	}
}
