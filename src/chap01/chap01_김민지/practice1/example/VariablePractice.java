package chap01.chap01_�����.practice1.example;

import java.util.Scanner;

public class VariablePractice {
	Scanner sc = new Scanner (System.in);
	public void method1() {
		System.out.println("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		
		System.out.println("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.println("������ �Է��ϼ���(��/��) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.println("Ű�� �Է��ϼ���(cm) : ");
		double height = sc.nextDouble();
		
		System.out.println("Ű " + height + "�� " + age + "�� " + gender + "�� " + name +"�� �ݰ����ϴ�^^");
	}
	
	public void method2() {
		System.out.println("ù ��° ������ �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("�� ��° ������ �Է��ϼ��� : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("���ϱ� ��� : " + (num1 + num2));
		System.out.println("���� ��� : " + (num1 - num2));
		System.out.println("���ϱ� ��� : " + (num1 * num2));
		System.out.println("������ �� ��� : " + (num1 / num2));
	}

	public void method3() {
		System.out.println("���� : ");
		double w = sc.nextDouble();
		
		System.out.println("���� : ");
		double h = sc.nextDouble();
		
		System.out.println("���� : " + (w*h));
		System.out.println("�ѷ� : " + ((w+h)*2));
	}
	
	public void method4() {
		System.out.println("���ڿ��� �Է��ϼ��� : ");
		String str = sc.nextLine();
		
		System.out.println("ù ��° ���� : " + str.charAt(0));
		System.out.println("�� ��° ���� : " + str.charAt(1));
		System.out.println("�� ��° ���� : " + str.charAt(2));
	}
}
