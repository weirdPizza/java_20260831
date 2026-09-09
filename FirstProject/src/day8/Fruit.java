package day8;

public class Fruit {
	private String name;
	private int price;
	
	Fruit(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	@Override
	public boolean equals(Object obj) {
		Fruit fruit = (Fruit)obj;
		if(name.equals(fruit.getName()) && fruit.price == price) { // 문자열은 equals를 써라!
			return true;
		}else {
			return false;
		}
	}
}
