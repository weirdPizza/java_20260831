package day6;

public class Person {
	private String name;
	private int age;
	private String addr;
	
	Person(String name){
		this(name, 0);
	}
	Person(String name, int age){
		this(name, age, null);
	}
	Person(String name, int age, String addr){
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	String getInfo() {
		if(name==null||age==0||addr==null) {
			return"모든 정보가 입력되지 않았습니다";
		}
		String info = "이름 : " + name;
		info += ", 나이 : "+age;
		info += ", 주소 : "+addr;
		
		return info;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		if(age==0) {
			return "나이가 등록되지 않았습니다.";
		}
		return age + ""; // 숫자를 문자로 바꿈.
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
}
