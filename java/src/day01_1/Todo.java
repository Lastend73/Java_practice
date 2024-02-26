package day01_1;

import java.time.LocalDate;

// 할일 객체 : 번호, 할일, 작성일, 완료여부
// js의 경우 : {tno : 1, title:'자바공부', finish:true}
// 자바의 경우에는 설계도인 클래스를 만든 다음에 객체를 생성


// 접근제어자(access modifier)
// 1. public :누구나 접근 가능
// 2. private : 아무도 접근 X
// 3. default : 같은 패키지 경우 -> 보통 권장 X
// 4. protected : 자식이면 접근 가능
// 왜 private? 허락된 사용자만 값을 읽고 쓸 수 있다
public class Todo {
	private Long tno;
	private String title;
	private LocalDate writeday;
	private Boolean finsh;
}
