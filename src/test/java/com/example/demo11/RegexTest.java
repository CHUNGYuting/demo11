package com.example.demo11;

import java.util.Scanner;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

import ch.qos.logback.core.boolex.Matcher;

public class RegexTest {

	@Test
	public void test0() {
		// \ �b java ����ܸ��檺�Ÿ��A�ΨӸ��榳�S��N�q���Ÿ� --> �����S��N�q���Ÿ��ܦ���ª��r��
		// \����Ÿ��L�k��W�s�b
		// \\ -->�Ĥ@�Ӹ���Ÿ��O���ĤG�Ӹ���Ÿ��q���S��N�q�ܦ���ª��r��
		String pattern = "\\";
		System.out.println(pattern);
		String path = "D:\\JavaProject";
	}

	@Test
	public void test() {
		// ��������X�榡:�Ʀr4�X-�Ʀr3�X-�Ʀr3�X
		// \d ��ܼƦr 0~9�����N�䤤�@��
		String pattern = "\\d\\d\\d\\d-\\d\\d\\d-\\d\\d\\d";

		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J������X:�榡�� �Ʀr4�X-�Ʀr3�X-�Ʀr3�X");
		String input = scan.next();
		boolean check = input.matches(pattern);
		if (check) { // ���P�� check == true
			System.out.println(input + "�ŦX������X�榡");
		} else {
			System.out.println(input + "���ŦX������X�榡!!");
		}
		// =================================================
		// �W���� input.matches(pattern)�����G���ܼ� check ���^��
		// ���b���򪺵{���X���A�ܼ�check�u�ϥΤF�@��
		// �ҥH�i�H�ϥΰΦW(���ݭn���ܼƦW�٨ӱ��p�⪺���G)���覡�ӧ�g
		if (input.matches(pattern)) { // ���P�� input.matches(pattern) == true
			System.out.println(input + "�ŦX������X�榡");
		} else {
			System.out.println(input + "���ŦX������X�榡!!");
		}
	}

	@Test
	public void test1() {
		// ��������X�榡:�Ʀr4�X-�Ʀr3�X-�Ʀr3�X
		// \d ��ܼƦr 0~9�����N�䤤�@��
//		String pattern = "\\d\\d\\d\\d-\\d\\d\\d-\\d\\d\\d";
		// �ϥΤj�A��{}�B�z pattern �����ƥX�{���r��A���ȭ���{}���e�����Ӧr��
//		String pattern = "\\d{4}(-\\d{3}){3}";
		// �W�@��-\\d{3} ���ƥX�{�F2���A���O -\\d{3}�O�]�t�F-,\\d,{3}�o3�Ӧr��
		// �ҥH�ݭn�Τp�A���N�o3�Ӧr��ئ��P�@�� (-\\d{3})�A�A�Τj�A���B�z���ƪ�����
		String pattern = "\\d{4}(-\\d{3}){2}";

		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J������X:�榡�� �Ʀr4�X-�Ʀr3�X-�Ʀr3�X");
		String input = scan.next();
		boolean check = input.matches(pattern);
		if (check) { // ���P�� check == true
			System.out.println(input + "�ŦX������X�榡");
		} else {
			System.out.println(input + "���ŦX������X�榡!!");
		}
		// =================================================
		// �W���� input.matches(pattern)�����G���ܼ� check ���^��
		// ���b���򪺵{���X���A�ܼ�check�u�ϥΤF�@��
		// �ҥH�i�H�ϥΰΦW(���ݭn���ܼƦW�٨ӱ��p�⪺���G)���覡�ӧ�g
		if (input.matches(pattern)) { // ���P�� input.matches(pattern) == true
			System.out.println(input + "�ŦX������X�榡");
		} else {
			System.out.println(input + "���ŦX������X�榡!!");
		}
	}

	@Test
	public void test2() {
		// ���ܮ榡1:�Ʀr2�X-�Ʀr7�X
		String pattern1 = "\\d{2}-\\d{7}";
		// ���ܮ榡2:(�Ʀr2�X)-�Ʀr7�X
		String pattern2 = "\\(\\d{2}\\)-\\d{7}";
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J���ܸ��X:�榡�� �Ʀr2�X-�Ʀr7�X �άO (�Ʀr2�X)-�Ʀr7�X");
		String input = scan.next();
		if (input.matches(pattern1) || input.matches(pattern2)) {
			System.out.println(input + "�ŦX���ܸ��X�榡!!");
		} else {
			System.out.println(input + "���ŦX���ܸ��X�榡!!");
		}
		// =======================================================
		// �X��pattern1 �M pattern2
		String str = "06-1234567";
		String pattern3 = "\\d{2}-\\d{7}|\\(\\d{2}\\)-\\d{7}";
		if (input.matches(pattern3)) {
			System.out.println(input + "�ŦX���ܸ��X�榡!!");
		} else {
			System.out.println(input + "���ŦX���ܸ��X�榡!!");
		}
		String pattern4 = "(\\d{2}|(\\d{2}\\))-\\d{7}";
		if (input.matches(pattern4)) {
			System.out.println(input + "�ŦX���ܸ��X�榡!!");
		} else {
			System.out.println(input + "���ŦX���ܸ��X�榡!!");
		}
	}

	@Test
	public void test3() {
		// ���ܮ榡:�Ʀr2�X-�Ʀr7�X��8�X
		String pattern = "\\d{2}-(\\d{7}|\\d{8})";
		// \\d{7,8} :���\\d �ܤ֥X�{7���A�ܦh�X�{8��
		String pattern1 = "\\d{2}-\\d{7,8}";
	}

	@Test
	public void test4() {
		String pattern = "[A-CSW-Z]"; // �ŦX���r����:A�BB�BC�BS�BW�BX�BY�BZ
		String str = "_";
		System.out.println(str.matches(pattern));
		String str1 = "\n";
		System.out.println("==========================");
		System.out.println(str1);
		System.out.println("==========================");
	}

	@Test
	public void test5() {
		String pattern = "0[1-9]{1,3}-\\d{7,8}";
		String str = "0023";
		System.out.println(str.matches(pattern));

	}

	@Test
	public void test6() {
		String pattern = "^aB$";
		String str = "aB";
		String str1 = "AB";
		System.out.println(str.matches(pattern));
		System.out.println(str1.matches(pattern));
	}

	// �����Ҧr���ˬd(Scanner ��J)
	// 10�X
	// �Ĥ@�Ӧr���^��r��(�j�p�g�ҥi)
	// �^��r���᭱���۪��Ĥ@�ӼƦr�u�|�O 1 �� 2
	// �ХΥ��W��F������

	@Test
	public void test7() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�п�J�����Ҧr��: ");
		String id = scanner.nextLine();

		// ���W��F��
		String pattern = "[A-Za-z][1-2]\\d{8}";
		
		String pattern1 = "[A-Za-z&&[^ABDEFHabcdefh]][1-2]\\d{8}";
		
		String pattern2 = "[\\w&&[^ABDEFHabcdefh0-9_]][1-2]\\d{8}";
	}
}
