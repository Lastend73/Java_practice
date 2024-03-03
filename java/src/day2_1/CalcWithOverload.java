package day2_1;
// 이름은 중복 부가능하다(식별기능)
// 함수의 이름도 중복불가능 -> C언어는 아래 작성해야 한다
public class CalcWithOverload {
	public int sum(int a, int b) {
		return a+b;
	}
	
	public double sum(double a, int b) {
		return a+b;
	}
	
	public double sum(int a, double b) {
		return a+b;
	}
	
	public double sum(double a, double b) {
		return a+b;
	}
}
