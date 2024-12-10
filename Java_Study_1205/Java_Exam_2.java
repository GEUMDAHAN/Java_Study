package Java_Study_1205;

public class Java_Exam_2 {

	public static void main(String[] args) {
		// 문제 22. 그리드(탐욕) 알고리즘 : 매 선택에 있어서 가장 최선의 선택
		int hp2 = 24;
		int count2 = 0;
		
		count2 += hp2 / 5; // 장군개미
		hp2 %= 5;
		
		count2 += hp2 / 3; // 병정개미
		hp2 %= 3;
		
		count2 += hp2;
		System.out.println(count2);
		
		
		
		int chicken = 100; // 1081마리 주문
        int chickenCount = 0; // 총 내가 받을 수 있는 치킨 수
        
        // 1. 반복을 하면서 쿠폰이 있는지? 없는 지를 체크해야합니다.
        // 2. 10번 반복할 지 5번 반복할 지 모름 → while문
        
        while (chicken >= 10) { // 쿠폰이 10장 이상일 때만 반복
        	int coupon = chicken % 10; // 나머지 값을 쿠폰에 대입
        	chickenCount += chicken / 10;
        	chicken = coupon + chicken / 10;
        }
        System.out.println("받을 수 있는 최대 서비스 치킨 수는? : "+chickenCount);

	}

}
