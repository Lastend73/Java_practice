package day01_1;

import java.time.LocalDate;

public class TodoTest {
	public static void main(String[] args) {
	Todo t1 = new Todo(1L,"String",LocalDate.now(),false);
		
		System.out.println(t1.getTitle());
	}
	public void test1() {
		// 객체 생성을 담당하는 메소드 : 생성자(constructor)
		// 생성자는 new할 때만 호출된다
//		Todo t1 = new Todo(1L,"작업1",LocalDate.now(),false);
//		
//		Todo t1 = new Todo(1L,"String",LocalDate.now(),false);
//		
//		System.out.println(t1);
	}
}
