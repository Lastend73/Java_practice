package day4_04;

abstract class Sample {
	// 중괄호 대신 ; 을 찍으면 추사메소드 -> 미구현 메소드
	// 추상메소드가 포함된 클래스 - > 추상 클래스
	public abstract void insa();
}


class 자식Sample extends Sample {
}

public class 추상메소드Test1 {
	public static void main(String[] args) {
		// 추상 메소드를 가지는 클래스는 추상 클래스
		// 미완성인 추상 클래스는 객체를 생성할 수 없다
		Sample ob = new Sample();
		
		// 추상 클래스를 상속받으면 자식 클래스에 추상 메소드가 전달된다
		// 따라서 자식도 추상 클래스가 된다
	}
}
