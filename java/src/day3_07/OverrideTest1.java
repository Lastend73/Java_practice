package day3_07;

import java.util.ArrayList;
import java.util.List;

// 객체 지향 구성요소
// 1. 캡슐화
// 2. 정보은닉
// 3. 상속
//    시작은 재사용 -> 부모의 참조변수로 작업한다
// 4. 다형성 -> 같은 이름의 메소드ㅓ가 상황에 따라 동작이 달라진다
//		overload : 이름은 같고 인자는 다르다 (이름만 같고 다른 메소드)
// 		override : 똑같은 메소드(리턴, 이름, 인자 모두같다) - 전제조건 : 상속

class 탈것{
	
}
class 트럭 extends 탈것{
	
}

class 버스 extends 탈것{

}

class Truck{
	
}

class Bus{
	
}
public class OverrideTest1 {
	public static void main(String args[]) {
		// 부모클래스 : 추상적인 분류 (abstract class)
		// 자식클래스 : 구체적인 실체 (concrete class, 구상 클래스)
		List <탈것> list = new ArrayList<>();
		list.add(new 트럭());
		list.add(new 버스());
		// list에서 원소를 꺼내면 탈것
				
		List list2 = new ArrayList();
		list2.add(new Truck());
		list2.add(new Bus());
		// list2에서 원소를 꺼내면 Object 객체
		// 자바에서 오류를 막기위해 모든 객체의 부모다 .. 라고 만들어 놓은 개념
		// OBject 객체는 실제로 작업하는 객체는 아님
	}
}
