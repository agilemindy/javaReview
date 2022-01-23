package chap12.김민보.hw1.view;

import java.util.Scanner;

import chap12.김민보.hw1.controller.TokenController;

public class TokenMenu {
	
	Scanner sc = new Scanner(System.in);
	TokenController tc = new TokenController();
	
	public void mainMenu() {		
		
		while(true) {
			
			System.out.println("1. 지정 문자열");
			System.out.println("2. 입력 문자열 ");
			System.out.println("9. 프로그램 끝내기");
			System.out.println("메뉴 번호 : ");
			int num = sc.nextInt();
			
			switch(num) {
			
			case 1 :
				tokenMenu();
				break;
			
			case 2 : 
				inputMenu();
				break;
			case 9 :
				System.out.println("프로그램을 종료합니다.");
				return;
			
			default:
				System.out.println("잘못입력하였습니다. 안내된 번호를 입력하세요.");
				break;				
				
			}			
		}		
	}
	
	
	public void tokenMenu() {
		
		String str = "J a v a P r o g r a m";
		System.out.println("토큰 처리 전 글자 : " + str);
		System.out.println("토큰 처리 전 개수 : " + str.length());
		
		//위 str을 TokenController의 afterToken() 메소드의 인자로 보내 반환 값 출력
						
		System.out.println("토큰 처리 후 글자 : " + tc.afterToken(str));
		System.out.println("토큰 처리 후 개수 : " + tc.afterToken(str).length());
		
		System.out.println("모두 대문자로 변환 : " + tc.afterToken(str).toUpperCase());
		
	}
	
	public void inputMenu() {
		
		sc.nextLine();
		System.out.println("문자열을 입력하세요 : ");
		String inputStr = sc.nextLine();
		System.out.println("첫글자 대문자 : "  + tc.firstCap(inputStr));
		
		System.out.println("찾을 문자 하나를 입력하세요 : ");
		char one = sc.nextLine().charAt(0);
		System.out.println(one +"문자가 들어간 개수 : " +  tc.findChar(inputStr, one));
		
		
		 
	}
	
	
	
	
}