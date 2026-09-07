package day5;

public class Animal {
	String kind; // 동물 종류
	String name; // 동물 이름
	int age; // 동물 나이
	
	Animal(){}
	Animal(String kind, int age){
		this(kind, "이름미정", age); // this() 첫 줄에 위치해야 함
	}
	Animal(String kind, String name, int age){
		this.kind = kind;
		this.name = name;
		this.age = age;
	}
}
