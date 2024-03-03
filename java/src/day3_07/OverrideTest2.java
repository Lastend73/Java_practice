package day3_07;

import java.util.ArrayList;
import java.util.List;

// 오버라이드 : 부모와 자식이 똑같은 메소드를 가질 때 자식것을 호출한다
/*
 * 부모의 참조 변수로 작업한다
 * 하지만 자식들의 동작은 자식마다 달라야한다
 * !!! 부모는 표준 -> 함수의 이름을 정해준다
 * 		탈것이 이동하는 방법은 go()며
 * 자식들을 부모를 상속한다
 * 		Bus, Taxi 비행기는 super.go()를 가진다
 * 		이 상황에서 자식이 go()를 다시만들면 this.go()를 실행한다
 * */
class Vehicle2 {
	public void go() {
		System.out.println("부모의 go");
	}
}

class Taxi extends Vehicle2 {
	public void go() {
		System.out.println("택시가 달린다");
	}
}

class Bus2 extends Vehicle2 {
	public void go() {
		System.out.println("버스가 날아갑니다");
	}
}
class 비행기 extends Vehicle2{
	public void go() {
		System.out.println("비행기가 날아갑니다");
	}
	
}
public class OverrideTest2 {
	public static void main(String args[]) {
		List<Vehicle2> list = new ArrayList<>();
		
		list.add(new Bus2());
		list.add(new 비행기());
		list.add(new Taxi());
		
		for(Vehicle2 i : list) {
			i.go();
		}
		
	}
}
