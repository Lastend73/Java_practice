package day2_4;

import lombok.*;

// 채력 : 40/40 -> 40/28 -> 40/0
@Getter
public class Marine {
	// 전체채력은 모든 마린들이 공유
	public static Long 전체체력 = 40L;

	// 현재채력은 마린마다 다르다 -> 정보은닉
	private Long 현재체력;
	
	public Marine() {
		현재체력 = 40L;
	}
}
