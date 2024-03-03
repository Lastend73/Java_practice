package day2_7;


// 싱글톤은 객체를 하나만 생성하는 것을 보장하는 패턴

// BoardService를 싱글톤으로 만드려면....
class BoardService{
	// 1번 문제 해결책 : private 생성자
	private BoardService() {
		
	}
	// 2번문제 해결책 : 클래스 내부에 자기자신의 객체를 만든다
	private static BoardService service = new BoardService();
	
	public static BoardService getInstance() {
		return service;
	}
}

public class SingletonTest {
	public static void main(String[] args) {
		// 1. 아래 라인이 에러나야한다
		// BoardService service = new BoardService();
		
		// 2번문제 : 그럼 이제 객채가 없잖어??
		
		// 3번문제 : 사용하게 객체 주세요~~~
		BoardService s1 = BoardService.getInstance();
		BoardService s2 = BoardService.getInstance();
		
	}
}
