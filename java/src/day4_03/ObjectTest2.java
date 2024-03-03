package day4_03;

import lombok.*;

@Getter
@AllArgsConstructor
//ToString 메소드를 만들어라
@ToString
// equals 메소드와 hashcode를 만들어라

@EqualsAndHashCode
class 제품 {
	private String name;
	private int price;
	
}

@EqualsAndHashCode
@AllArgsConstructor
class 제품2 {
	private String name;
	private int price;
	
}

@NoArgsConstructor
class test1{
	  public String a ;
	  
	  public test1(String a) {
		  this.a =a;
	  }
	  
	  public static int b = 10;
}

public class ObjectTest2 {
	public static void main(String[] args) {
		String a = "hello world";
		String b = new String("hello world");
		
		제품 p1 = new 제품("컵누들", 1500);
		제품 p2 = new 제품("신라면", 1500);
		제품 p3 = new 제품("컵누들", 1500);
		
		
		// ==로 비교하면 무조건 false
		System.out.println(p1.equals(p2));
		System.out.println(p1==p2);
		
		
		// ==로 비교하면 무조건 false
		System.out.println(p1.equals(p3));
		System.out.println(p1.hashCode());
		System.out.println(p3.hashCode());
		
		System.out.println(((Object)a).hashCode());
		System.out.println(((Object)b).hashCode());
		System.out.println(a==b);
		
		int test3 = test1.b;
		int test4 = test1.b;
		System.out.println(System.identityHashCode(test3));
		System.out.println(System.identityHashCode(test4));
		
		
		test1 c = new test1("A");
		test1 d = new test1("A");
		System.out.println(c == d);
		System.out.println(c.hashCode());
		System.out.println(d.hashCode());
		
	}
}
