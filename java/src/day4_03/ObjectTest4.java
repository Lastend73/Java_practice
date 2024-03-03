package day4_03;

import lombok.*;

@Getter
@AllArgsConstructor
@ToString
class Apple {
	private String name;
	private int price;
	
	// 어떤 경우에 두객체가 같은 거니?... 프로그래머가 아니라 업무 규칙
	@Override
	public boolean equals(Object obj) {
		// 핸드폰 ob = new 갤럭시();
		// 참조변수 ob가 가리키는 대상이 갤럭시인지 확인하는 연산자
		// ob instacne of 갤럭시
		
		// 제품과 제품이 아닌것을 비교하면 무조건 false
		if((obj instanceof Apple)==false) {
			return false;
		}
		
		// 이제 obj 가 가리키는 대상은 제품인지 확인
		// obj를 제품으로 형변환 합니다
		Apple target = (Apple)obj;
		return this.price==target.getPrice();
	}
}

public class ObjectTest4 {
	public static void main(String[] args) {
		Apple a1 = new Apple("대구 사과", 3500);
		Apple a2 = new Apple("경북 능금", 3500);

		System.out.println(a1==a2);
		System.out.println(a1.equals(a2));
	}
}
