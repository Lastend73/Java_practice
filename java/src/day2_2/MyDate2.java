package day2_2;

import lombok.Getter;
import lombok.Setter;

// 데이터를 처리하는 슬래스 : Entitiy
// 	필드 + 게터 세터 + 생성자
// 데이터를 처리하는 클래스: 알아서 만들어야지

@Getter
@Setter
public class MyDate2 {
	// 1. 필드를 결정
	// 2. 정보은닉 -> 외부에 마음대로 읽고 쓸 수 없다
	// 3. Getter ,Setter
	// 4. 생성자 -> 2개
	private Long year;
	private Long month;
	private Long day;
	
	public MyDate2() {
		// 기본생성자
	}
	
	public MyDate2(Long year, Long month, Long day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
}
