package com.example.demo;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class ConditionTest {

//	@Test
//	public void ifTest() {
//		int a = 6;
//		if (a > 5) {
//			System.out.println("========");
//
//		} else {
//			System.out.println("-------");
//
//		}
//
//	}
//	@Test
//	public void switchTest() {
//		int a = 95;
//		double b = 95.0/10; //�q���w�]i n t ����� �n+(.0 )�~��L�X�p��
//		System.out.println(b);
//	}
//	@Test
//	public void scannerTest() {
//		Scanner scan = new Scanner(System.in); //�i�H�bConsole��J�F��
//		System.out.println("��J��r:");
//		String a = scan.next();
//		System.out.println("��J��r�O:" + a);
//	}
//	@Test
//	public void scannerTest1() {
//		Scanner scan = new Scanner(System.in); //�i�H�bConsole��J�F��
//		System.out.println("��J��r:");
//		String a = scan.next();
//		String b = scan.next();
//		System.out.println("��J��r�O:"+ a  + b);
//	}
//	@Test
//	public void scannerTest2() {
//		Scanner scan = new Scanner(System.in); //�i�H�bConsole��J�F��
//		System.out.println("��J��r:");
//		String a = scan.nextLine();
//		System.out.println("��J��r�O:" + a);
//	}
//	@Test
//	public void scannerTest3() {
//		Scanner scan = new Scanner(System.in); //�i�H�bConsole��J�F��
//		System.out.println("��J�Ʀr:");
//		int a = scan.nextInt();
//		System.out.println("��J�Ʀr�O:" + a);
//	}
//	
//	

//	@Test
//	public void switchTest1() {
//	
//		Scanner scan = new Scanner(System.in);
//		System.out.println("��J���Z:");
//		int input = scan.nextInt();
//		switch(input/10) {
//			case 10 :
//				System.out.println("AA");
//					break;
//			case 9 :
//				System.out.println("A");
//					break;
//			case 8 :
//				System.out.println("B");
//					break;
//			case 7 :
//				System.out.println("C");
//					break;
//			case 6 :
//				System.out.println("D");
//					break;
//			case 5 :
//				default:
//				System.out.println("E");
//
//		}
//		
//	}

	@Test
	public void switchTest1() {

		Scanner scan = new Scanner(System.in);
		System.out.println("���ѬO�P���X:");
		String x = scan.next();
//		int input = scan.nextInt();
		System.out.println("�X�ѫ�");
		int y = scan.nextInt();
		int z = 0; 
		switch(x) {
			case "��":
				z = 1 ;
				break;
			case "�@":
				z = 2 ;
				break;
			case "�G":
				z = 3 ;
				break;
			case "�T":
				z = 4 ;
				break;
			case "�|":
				z = 5 ;
				break;
			case "��":
				z = 6 ;
				break;
			case "��":
				z = 7 ;
				break;
		
		
		}
		
		switch ((z+ y) % 7) {
		case 1:
			System.out.println("�P����");
			break;
		case 2:
			System.out.println("�P���@");
			break;
		case 3:
			System.out.println("�P���G");
			break;
		case 4:
			System.out.println("�P���T");
			break;
		case 5:
			System.out.println("�P���|");
			break;
		case 6:
			System.out.println("�P����");
			break;
		case 7:
		default:
			System.out.println("�P����");

		}
		
	}
}
