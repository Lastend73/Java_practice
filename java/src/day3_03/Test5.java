package day3_03;

// access modifier : protected


// 부모의 private에는 자식은 접근 불가
// protected는 자식의 접근을 허용
class Emp {
	protected String name;
	protected Long nai;
}

class Regular extends Emp {
	private String position;
	private Long salary;
	public Regular(String name, Long nai, String position, Long salary) {
		super.name = name;
		super.nai = nai;
		this.position = position;
		this.salary = salary;
	}
}

class PartTimer extends Emp {
	private String role;
	private Long 시급;
}

public class Test5 {

}
