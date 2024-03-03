package day01_2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class GusetBook_Service_Test {
	private GuestBook_Service Service = new GuestBook_Service();

	 @Test
	public void saveAndFindAllTest() {
		assertEquals(0, Service.findAll().size());
		Service.Save(new GuestBook(1L, "안녕하세요", "spring", LocalDate.now(),1L));
		assertEquals(1, Service.findAll().size());
	}

	//@Test
	public void findByIdTest() {
		GuestBook gb = new GuestBook(1L, "testcontent1", "writer_test", LocalDate.now(), 1L);
		Service.Save(gb);

		GuestBook books1 = Service.findById(1L);
		assertNotNull(books1);
		GuestBook books2 = Service.findById(222L);
		assertNull(books2);
	}

	// @Test
	public void deleteTest() {
		GuestBook gb = new GuestBook(2L, "testcontent1", "writer_test", LocalDate.now(), 1L);
		Service.Save(gb);

		assertEquals(1L, Service.delete(2L));
	}
}
