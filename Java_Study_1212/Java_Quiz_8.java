package Java_Study_1212;

class Calculator {
	
	public int add(int a, int b) {
		return a + b;
	}
}

public class Java_Quiz_8 {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		int result = cal.add(10, 20);
		System.out.println("결과 : "+result);

	}

}
