package day1;

public class _5_형변환 {

	public static void main(String[] args) {
		int age = 30;
		double age2 = 30; // 30.0
		
//		int height = 160.5; // 소수점 있어서 에러 
		int height = (int)160.5; // 실수를 int로 강제 형변환 
		System.out.println(height);
		
		int newAge = age + 1; // 31
		int newAge2 = (int)age2; 
	}

}
