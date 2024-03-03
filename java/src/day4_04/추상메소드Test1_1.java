package day4_04;
// 추상 메소드 많이 사용하나요? 많이
// 왜 사용하나요 오버라이드와 함깨

abstract class Parent{
	public abstract void insa();
}
// 추상 클래스 Parent 상속하면 자식도 추상클래스가 된다
class 첫째딸 extends Parent{
	public void 인사() {
		System.out.println();
	}

	@Override
	public void insa() {
		// TODO Auto-generated method stub
		
	}
}

class 둘째아들 extends Parent{
	public void hello() {
		System.out.println();
	}
}
public class 추상메소드Test1_1 {

}
