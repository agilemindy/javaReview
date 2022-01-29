package chap14_입출력.한채영.hw1.run;

import java.util.Scanner;

import chap14_입출력.한채영.hw1.model.dao.FileDao;

public class Run {

	public static void main(String[] args) {

		FileDao fd = new FileDao();
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("****** MyNote ******");
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("4. 끝내기");
			System.out.println("번호를 입력하세요: ");

			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				fd.fileSave();
				break;
			case 2:
				fd.fileOpen();
				break;
			case 3:
				fd.fileEdit();
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력했습니다.");
				continue;
			}
		}

	}

}
