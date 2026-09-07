package day5;

public class _8_Value_Ref {

//	static void valueMethod(int a) { // 값을 복사하기만 함.
//		// a = a+1; // 리턴 안해주면 전달받은 a 수정안됨
//		// 그래서 리턴을 해줘야 함.
//		return a;
//		
//	}
	static void refMethod(int arr[]) {
		// arr[] => djfklas12(주소)
		arr[1] = 1000;
		// 리턴할 필요 없이 수정됨
	}
	
	static void refMethod(Animal animal) {
		animal.age += 1;
	}
	
	public static void main(String[] args) {
		
		int a = 10;
//		valueMethod(a); // 10
		
		int arr[] = {1,2,3,4,5}; // arr => djfklas12(주소)
		refMethod(arr); // 1,1000,3,4,5
		
		Animal dog = new Animal("강아지","댕댕이",5);
		System.out.println("메소드 호출 전 : " + dog.age);
		refMethod(dog);
		System.out.println("메소드 호출 후 : " + dog.age);
		
		// 배열에 값을 복사하고 싶을 때
		int arr2[] = {3,5,2,4,1};
//		int copyArr[] = arr2; // arr2의 주소를 복사하므로
			// 두 배열은 같은 곳을 바라보게 된다.
		int copyArr[] = new int[arr2.length]; // 이렇게 하면 주소는 다르고 모양은 같은 배열이 됨!
		for(int i=0; i<arr.length; i++) {
			copyArr[i] = arr2[i];
		}
		
	}

}
