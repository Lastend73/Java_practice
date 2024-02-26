package day01;

import java.util.ArrayList;
import java.util.List;

//for문 : 일반for, 향상된 for(js의 of, python의 in)
public class Example05 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList<>();
		
		list1.add(10);
		list1.add(20);
		list1.add(30);
		
		for(int i=0; i<3; i++) {
			System.out.println(list1.get(i));
		}
		
		// list1은 객체(Object) -> 객체는 자기열을 자기가 알아서 하는 S/W 부품
		for(int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
	}
}
