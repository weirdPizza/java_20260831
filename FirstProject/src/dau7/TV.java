package dau7;

public class TV {
	// 6-1번
		int size;
	   String manufacturer;
	   public TV() {
//		  size = 32;
//		  manufacturer = "LG";
		  this("LG");
		  System.out.println(size+"인치 "+manufacturer);
	   }
	   public TV(String manufacturer) {
//		  this.size = 32;
//		  this.manufacturer = manufacturer;
		  this(32, manufacturer);
		  System.out.println(size+"인치 "+manufacturer);
	   }
	   public TV(int size, String manufacturer) {
		  this.size = size;
		  this.manufacturer = manufacturer;
		  System.out.println(size+"인치 "+manufacturer);
	   }
	   // 6-2번
	   // 32인치 LG
	   // 32인치 삼성
	   
	   // 6-3번
	   // TV tv = new TV(65, "삼성");
	   
	   // 6-4번
	   // 생성자를 빠르게 구현할 수 있다.
}
