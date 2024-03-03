package day01_2;

import java.util.ArrayList;

public class GuestBook_Service {
	ArrayList<GuestBook> books = new ArrayList<>();
	
	public ArrayList<GuestBook> findAll() {
		return books;
	}

	public GuestBook findById(Long GuestNum) {
		for(GuestBook bo : books) {
			if(bo.getGusetNum()== GuestNum) {
				return bo;
			}
		}
		return null;
	}

	public void Save(GuestBook book) {
		books.add(book);
	}

	public Long delete(Long GuestNum) {
		for(GuestBook bo : books) {
			if(bo.getGusetNum()== GuestNum) {
				books.remove(bo);
				return 1L;
			}
		}
		return 0L;
	}
}
