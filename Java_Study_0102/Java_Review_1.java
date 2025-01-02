package Java_Study_0102;

import java.util.ArrayList;

public class Java_Review_1 {

	public static void main(String[] args) {
		
		/*
		 * 제네릭과 컬렉션즈
		 * 
		 * ArrayList는 자바에서 가장 많이 사용되는 자료구조 중 하나
		 * 일반 배열과 비슷하지만 크기가 유동적으로 변할 수 있는 '동적 배열'
		 * 
		 * - 일반 배열 : 크기가 고정된 장바구니
		 * - ArrayList : 필요에 따라 크기가 늘어나는 장바구니
		 * 
		 * ArrayList의 특징
		 * ① 일반 배열과 다르게 사이즈를 선언할 필요가 없음(일반 배열 : new int[7];)
		 * ② 클래스 타입(레퍼런스 타입)만 추가할 수 있음(int, double, boolean... X)
		 */
		
		// ArrayList 생성(String 타입의 항목 추가)
		ArrayList<String> shoppingList = new ArrayList<>(); // <> : 제네릭(안에 있는 건 제네릭 타입)
		
		// Integer : wrapper 클래스
		ArrayList<Integer> list = new ArrayList<>(); // int형을 저장할 수 있는 list(int를 못 넣으니까 int의 클래스 타입인 Integer 사용)
		
		// 항목 추가
		shoppingList.add("우유"); // 장바구니에 물건을 넣는 것과 비슷
		shoppingList.add("계란");
		shoppingList.add("빵");
		
		// 장바구니에 있는 항목을 모두 출력
		System.out.println("장바구니 내용 : "+shoppingList);
		
		// 장바구니에 있는 항목을 하나씩 출력
		for (String s : shoppingList) {
			System.out.println("장바구니 내용 : "+s);
		}
		
		// 특정 위치에 항목 추가
		shoppingList.add(1, "치즈");
		// 수정된 장바구니 내용 출력
		System.out.println("장바구니 내용 : "+shoppingList);
		
		// 항목 개수 확인
		System.out.println("장바구니에 담긴 항목 수 : "+shoppingList.size());
		
		// 특정 항목이 있는 지 확인
		if (shoppingList.contains("빵")) {
			System.out.println("빵이 장바구니에 있습니다.");
		} else {
			System.out.println("빵이 장바구니에 없습니다.");
		}
		
		// 특정 항목 제거
		shoppingList.remove("계란"); // 장바구니에서 특정 물건을 빼내는 것과 같음
		// 최종 장바구니 내용 출력
		System.out.println("최종 장바구니 : "+shoppingList);

	}

}
