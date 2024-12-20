package Java_Study_1217;

//Food 클래스 시작
class Food {
	String name; // 음식의 이름을 저장하는 필드변수
	int calories; // 음식의 칼로리를 저장하는 필드변수
	
	public Food(String name, int calories) { // Food 클래스를 만들 때, name과 calories를 초기화
		this.name = name;
		this.calories = calories;
	}
	public void eat() { // 이건 뭐지?
		System.out.println("Eating : "+this.name);
	}
	public int getCalories() { // 칼로리 값을 반환
		return this.calories;
	}
} // Food 클래스 끝

// Pizza 클래스 시작
class Pizza extends Food { // extends : Pizza 클래스는 Food 클래스를 상속받음
	String[] toppings; // toppings(피자의 토핑)를 저장하는 배열(문자열)
	
	public Pizza(String name, int calories, String[] toppings) {
		super(name, calories); // super : 부모클래스 생성자(Food(String name, int calories)) 호출
		this.toppings = toppings; // 필드변수 대입(toppings 초기화)
	}
	@Override // 오버라이딩 : 부모클래스에 정의된 메소드를 자식클래스에서 호출해서 '재정의'
	public void eat() { // 부모클래스에 있는 eat 메소드를 재정의(사실 잘 모름 그냥 외웠음)
		System.out.println("Eating a slice of : "+super.name+" pizza");
	}
	public void showToppings() { // toppings(피자의 종류)를 출력하는 메소드
		System.out.print("Toppings : ");
		for(String s : toppings) {
			System.out.print(s+", ");
		}
		System.out.println("");
	}
} // Pizza 클래스 끝

//Sushi 클래스 시작
class Sushi extends Food { // extends : Sushi 클래스도 Food 클래스를 상속받음
	String fishtype; // fishType(생선의 종류)을 저장하는 변수
	
	public Sushi(String name, int calories, String fishType) {
		super(name, calories); // super : 부모클래스 생성자(Food(String name, int calories)) 호출
		this.fishtype = fishType; // 필드변수 대입(fishType 초기화)
	}
	@Override
	public void eat() { // 부모클래스에 있는 eat 메소드 재정의
		System.out.println("Eating : "+super.name+" sushi");
	}
	public void showFishType() { // fishType(생선의 종류)을 출력하는 메소드
		System.out.println("Fishtype : "+this.fishtype);
	}
} // Sushi 클래스 끝


public class Java_Study_1217_2 {

	public static void main(String[] args) {
		
		Food food = new Food("Food", 100); // Food 클래스 호출(부모)
		
		String[] toppings = {"Tomato", "Mozzarella", "Basil"};
		Pizza margherita = new Pizza("margherita", 300, toppings); // Pizza 클래스 호출
		
		Sushi salmonRoll = new Sushi("salmon Roll", 250, "Salmon"); // Sushi 클래스 호출
		
		food.eat(); // Food 클래스의 eat(메소드) 호출
		margherita.eat(); // Pizza 클래스 eat(재정의한 메소드) 호출
		salmonRoll.eat(); // Sushi 클래스 eat(재정의한 메소드) 호출
		
		margherita.showToppings(); // 피자의 토핑 출력
		salmonRoll.showFishType(); // 초밥의 생선 종류 출력
		
		/*
		 * 코드 설명
		 * 
		 * Food 클래스 : 기본 음식 클래스, 모든 음식의 공통 속성인 name과 calories 그리고 eat() 메소드를 가진다.
		 * 
		 * Pizza와 Sushi 클래스 : Food를 상속받아 eat 메소드를 오버라이딩
		 * 또한 Pizza 클래스에는 토핑을 보여주는 showToppings() 메소드 구현
		 * Sushi 클래스에는 생선 종류를 보여주는 showFishType() 메소드 구현
		 * 
		 * 핵심 : Pizza와 Sushi 클래스는 Food 클래스의 속성과 메소드를 상속받아 재사용 할 수 있습니다.
		 */

	}

}
