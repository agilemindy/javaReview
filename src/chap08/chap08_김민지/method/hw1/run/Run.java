package chap08.chap08_김민지.method.hw1.run;

import chap08.chap08_김민지.method.hw1.controller.NonStaticSample;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStaticSample ns = new NonStaticSample();
		
		System.out.print("1. 랜덤 값 : ");
		ns.printLottoNumbers();
		
		System.out.print("2. a 문자 5개 출력 : ");
		ns.outputChar(5, 'a');
		
		System.out.print("\n3. 랜덤 영문자 출력 : ");
		System.out.print(ns.alphabette());
		
		System.out.print("\n4. apple의 2번 4번 인덱스 사이의 값 출력 : ");
		System.out.println(ns.mySubstring("apple", 2, 4));
	}

}
