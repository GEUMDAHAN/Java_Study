package Java_Study_1119;

public class Java_Study_1119_1 {

	public static void main(String[] args) {
		
		// 1. 비교연산자 : 비교연산자 결과는 true(참) 혹은 false(거짓)으로 표기
		boolean 비교 = 3 < 5; // 3은 5보다 작다?
		System.out.println(비교);
		boolean 비교2 = 4 > 10; // 4는 10보다 크다?
		System.out.println(비교2);
		boolean 비교3 = 5 == 5; // 5는 5와 같음!(대입연산자 2번 사용 시, '같다' 표현)
		System.out.println(비교3);
		boolean 비교4 = 5 != 7; // 5는 7과 다르다?(느낌표는 부정을 의미)
		System.out.println(비교4);
		
		// 2. 논리연산자
		// ① AND (두 조건이 모두 참일 때 전체가 참)
		boolean 배가고프다 = true;
		boolean 돈이있다 = true;
		boolean 식당에갈수있다 = 배가고프다 && 돈이있다;
		System.out.println("식당에 갈수 있다 : " + 식당에갈수있다);
		
		// ② OR (두 조건 중 하나만 참이어도 전체가 참)
		boolean 비가온다 = true;
		boolean 우산이있다 = false;
		boolean 외출가능 = 비가온다 || 우산이있다;
		System.out.println("외출 가능? : " + 외출가능); // true 출력!
		
		// ③ NOT (조건의 결과를 뒤집음)
		boolean 햇빛이쨍쨍 = true;
		boolean 흐린날씨 = !햇빛이쨍쨍; // 변수명 앞에 느낌표(느낌표는 부정을 의미)
		System.out.println("흐린날씨 : " + 흐린날씨);
		
		// 3. 복합대입연산자
		int a = 10;
		int b = 20;
		
		// a = a + b;
		a += b; // 동일한 코드 : a = a + b
		System.out.println("a의 값은? : " + a);
		
		int c = 5;
		int d = 6;
		
		//c = c * d;
		c *= d; // 동일한 코드 : c = c * d;
		System.out.println("c의 값은? : " + c);
		
		// 4. 증감연산자(변수의 값을 1 증가 혹은 1 감소시키는 연산자)
		int 증감 = 0;
		증감++; // 1씩 증가
		System.out.println("증감 : " +증감);
		증감++; // 1씩 증가
		System.out.println("증감 : " +증감);
		증감--; // 1씩 감소
		System.out.println("감소 : " +증감);
		
		// 증감연산자는 전위 or 후위연산자로 나뉨
		// 전위연산자(변수명 앞에 ++ or -- 가 온다)
		int 사과 = 100;
		System.out.println(++사과); // 사과 1 증가(전위연산자)
		System.out.println(사과); // 그냥 사과 출력
		
		int 바나나 = 100;
		System.out.println(바나나++); // 바나나 1 증가(후위연산자)
		System.out.println(바나나); // 그냥 바나나 출력
		// 전위는 바로 값이 바뀌고, 후위는 그 다음에 바뀐다.
		
		// 삼항연산자(3개의 피연산자로 구성된 연산자)
		int num = 3;
		int num2 = 5;
		int 결과 = num > num2 ? num - num2 : num + num2;
		// opr1(num > num2 ?)이 true면, opr2(num - num2)이 실행되고 false면 opr3(num + num2)가 실행됨
		System.out.println("결과 : " + 결과);
		
		// 문제 1.
		int 용돈 = 5000;
		용돈 -= 3000; // 5000 - 3000
		System.out.println("용돈 : " + 용돈);
		용돈 += 3000; // 2000 + 3000
		System.out.println("용돈 : " + 용돈);
		
		/*
		 *  문제 2.
		 *  실수형 변수 weight과 height을 선언하고
		 *  weight에 70.5를 할당, height에는 1.77을 할당 후,
		 *  체질량 지수를 계산하는 프로그램을 작성하세요.
		 *  
		 *  #BMI(체질량 지수)공식 : 체중(kg) / (신장(m) * 신장(m))
		 */ 
		
		double weight = 70.5;
		double height = 1.77;
		double bmi = weight / (height * height); // 체질량 지수 공식
		System.out.println("bmi : " + bmi);
		

	}

}
