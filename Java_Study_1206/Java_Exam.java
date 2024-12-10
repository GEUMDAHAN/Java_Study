package Java_Study_1206;

public class Java_Exam {

	public static void main(String[] args) {
		
		/*
		 *  문제 1.
		 *  버블정렬을 이용해서 아래 배열을 오름차순으로 정렬하세요.
		 *  (디버깅을 실행하면서 꼼꼼히 확인해보기)
		 */
		
		int[] array = {10, 4, 3, 29, 31}; // 배열 선언
		
		for (int i = 0; i < array.length - 1; i++) { // 외부 : 전체적으로 배열을 돌리는? 흠..(어쨌든 i는 0~3까지 총 4번 반복됨)
            for (int j = 0; j < array.length - 1 - i; j++) {
            	/*
            	 *  내부 : 두 개의 인접한 요소를 비교('-i'는 이미 비교 끝난 거 다시 비교 안하려고)
            	 *  비교 끝난 거는 맨 뒤에 위치하게 됨.
            	 */
            	
            	// 비교할 두 요소를 x, y에 저장
                int x = array[j]; // 이게 왼쪽
    			int y = array[j+1]; // 이게 오른쪽
    			
    			if (x > y) { // 왼쪽이 오른쪽보다 크다면
    				int temp = x; // temp에 왼쪽을 임시저장
					array[j] = y; // array[j]에 오른쪽을 저장(임시저장과 그냥 저장이 뭔가 차이가 있나? 수업 때 얘기했던가?)
					array[j+1] = temp; // array[j+1]에 temp를 저장하는 건데, x를 y에 넣엇.. 흠.. swap? 흠.. 뭔지 잘 모르겠음 그냥 복붙함
               }
           }
       }
       for (int num : array) {
           System.out.print(num + " ");
       }

	}

}
