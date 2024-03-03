package day3_02;

import javax.swing.*;

/*
	상속은 기능의 확장
*/

class MyApp extends JFrame {
	public MyApp() {
		setSize(400, 300);
		add(new JButton("클릭"));

		// 종료버튼 활성화
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
public class 전통적상속Test {
	public static void main(String[] args) {
		new MyApp();
	}
}
