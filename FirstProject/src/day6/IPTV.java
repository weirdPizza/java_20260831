package day6;

public class IPTV extends ColorTV{
	String ip;
	public IPTV(String ip, int size, int color) {
		super(size, color);
		this.ip = ip;
	}
	protected String getip() {return ip;}
	public void printProperty() {
		// 방법 1.
		System.out.println("나의 IPTV는 " + this.getip() +" 주소의 " + this.getSize() +"인치 "+this.getColor()+"컬러");
		
		// 방법 2.
		System.out.print("나의 IPTV는 " + this.getip() +" 주소의 ");
		super.printProperty();
		
	}
}
