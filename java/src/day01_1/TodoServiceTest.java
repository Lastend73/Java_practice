package day01_1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class TodoServiceTest {
	private TodoService service = new TodoService();
	
	// junit으로 테스트하려면 반드시 public void 형식이여야 한다
	// 형식 완성후 Run as에서 junit 으로 검증
	//@Test
	public void saveAndfinAlltest() {
		// Todo가 없는 상태에서 0인지 테스트
		ArrayList<Todo> list1 = service.findall();
		assertEquals(0, list1.size());
		
		service.save(new Todo(1L,"자바공부", LocalDate.now(),false));
		ArrayList<Todo> list2 = service.findall();
		
		// assert 메소드는 검증한느 메소드
		// assertEquals(내가 원하는 값, 실제 값);
		assertEquals(1, list2.size());
		
	}
	
	// 모든 @Test 
	//@Test
	public void deleteTest() {
		service.save(new Todo(1L,"자바 공부", LocalDate.now(),false));
		service.save(new Todo(2L,"영어 공부", LocalDate.now(),false));
		// 삭제 성공 테스트
		assertEquals(1L, service.delete(2L));
		
		// 삭제 실패 테스트
		assertEquals(0L, service.delete(222L));
	}
	@Test
	public void updateTest() {
		service.save(new Todo(1L,"자바 공부", LocalDate.now(),false));
		service.save(new Todo(2L,"영어 공부", LocalDate.now(),false));
		// 삭제 성공 테스트
		assertEquals(1L, service.change(2L));
	
		
		
	}
	

}
