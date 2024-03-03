package day2_9;

// 상속 : 부모 것은 내것
class 부모 {
	int 부모재산 = 100000000;
}

class 자식 extends 부모 {
	int 자식재산 = 500000;
}

public class 상속Test {
	public static void main(String[] args) {
		자식 ob = new 자식();
		System.out.println(ob.부모재산);
		System.out.println(ob.자식재산);
	}
}
