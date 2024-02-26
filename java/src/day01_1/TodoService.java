package day01_1;

import java.util.ArrayList;

public class TodoService {
	private ArrayList<Todo> list = new ArrayList<>();
	// 할일 추가
	public void save(Todo todo) {
		list.add(todo);
	}

	// 할일 목록
	public ArrayList<Todo> findall() {
		return list;
	}

	// 마이바티스 db 프레임워크에서 save, delete, update의 결과는정수
	// 할일 삭제 
	public long delete(Long tno) {
		for(Todo t : list) {
			if(t.getTno() == tno) {
				list.remove(t);
				return 1L;
			}
		}
		return 0L;
	}

//	할일 변경
	
	public Long change(Long tno) {
		for(Todo t : list) {
			if(t.getTno() == tno) {
				t.setFinsh(!t.getFinsh());
				return 1L;
			}
		}
		return 0L;
	}

}
