package Java_Study_1219;

interface MusicPlayer { // 음악플레이어 인터페이스 정의
	/*
	 * 인터페이스에는 '메소드 구현'만 가능
	 */
	public void play();
	public void pause();
	public void stop();
	public void next();
	public void previous();
}

interface MusicPlayer2 {
	// 밑에 보면 알 수 있듯이 interface 추가하려면 , 찍고 쭉-
}
// 스마트폰 플레이어 클래스 생성
class SmartphonePlayer implements MusicPlayer, MusicPlayer2 { // MusicPlayer 인터페이스를 구현하다
	/*
	 * 인터페이스의 주요 특징
	 * ① 계약 : 인터페이스는 클래스가 특정 메소드를 반드시 구현하도록 강제합니다.
	 * ② 다중 구현 : Java 클래스는 여러 인터페이스를 동시에 구현할 수 있습니다.
	 * ③ 추상화 : 인터페이스는 메소드의 선언만을 포함하며, 구현은 포함하지 않습니다.
	 */
	@Override
	public void play() {
		System.out.println("Smartphone : Playing Music");
	}

	@Override
	public void pause() {
		System.out.println("Smartphone : pausing Music");
	}

	@Override
	public void stop() {
		System.out.println("Smartphone : stopping Music");
	}

	@Override
	public void next() {
		System.out.println("Smartphone : Playing next Music");
	}

	@Override
	public void previous() {
		System.out.println("Smartphone : Playing previous Music");
	}
	
}
// 자바의 모든 클래스는 기본으로 'Object'라는 최상위 클래스를 상속받는다.
class DD extends Object {
	
}

public class Java_Study_1219_2 {

	public static void main(String[] args) {
		
		SmartphonePlayer phone = new SmartphonePlayer();
		phone.play();
		phone.pause();
		phone.stop();
		phone.next();
		phone.previous();
	}

}
