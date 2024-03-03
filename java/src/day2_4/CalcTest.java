package day2_4;


public class CalcTest {
	public static void main(String[] args) {
		Calc c1 = new Calc();
		Calc c2 = new Calc();
		// c1.sum(2,5);
		// c2.sum(2,5);
		// c1, c2의 객체는 동작은 항상 같다
		
		System.out.println(Calc.sum(3, 4));
	}
}
