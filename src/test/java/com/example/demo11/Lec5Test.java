package com.example.demo11;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;

public class Lec5Test {

	@Test
	public void mathTest() {
		int a = Math.max(99,2);
		System.out.println(a);
		int b = Math.max(99, 2);
		System.out.println(b);
		int c = Math.max(1, Math.max(2, 99)); //�n����T�ӭ��H�W���ܡA�@�˱o��Ӥ�A�A��Ĺ�a�h����U�@��(�I�s�h��max/min ����k)		
		System.out.println(c);		
		
		int d = Math.abs(-1);
		System.out.println(d);
		int e1 =(int) Math.round(3.4);
		int e2 =(int) Math.round(3.5);
		System.out.println(e1);
		System.out.println(e2);
		int f1 = (int)Math.rint(2.5); // 2 2.5 4
		int f2 = (int)Math.rint(3.5); // 2 (1.5) 3.5 (0.5) 4 
		System.out.println(f1);
		System.out.println(f2);
		int g1 = (int)Math.ceil(2.5);
		int g2 = (int)Math.floor(2.5);
		System.out.println(g1);
		System.out.println(g2);
		
		int h1 = (int)Math.sqrt(4);
		int h2 = (int)Math.cbrt(27);
		System.out.println(h1);
		System.out.println(h2);
		
		int i = (int) Math.pow(10, 2); //10^2
		System.out.println(i);
	//	rint�Gretrun �̱��񪺾�ƭȡA���p���I�O5�ɡA�^�ǳ̱��񪺰��ƭ�
	//	ceil�G�L����i��
	//	floor�G�L����˥h
	//	sqrt�G�}�ڸ�
	//	cbrt�G�ߤ��
	//	pow( x, y )�Greturn x �� y ����A��X�Ӫ����G�|�O double�A�ҥH�O�o�i��n�j���૬�� int

		
		
	}
	
	@Test
	public void stringTest() {
		//����
		String str1 = "123456";
		int a = str1.length();
//		System.out.println(a);
		
		//�P�_���e���L�N�q
		String str5 = new String(); //�w�]�Ŧr��
		String str4 = null;
		String str2 = "";  //�Ŧr��(empty string)
		String str3 = " ";  //�ťզr��
		System.out.println(str5);
		System.out.println(str4);
		boolean b1 = str2.isEmpty();
		System.out.printf("�r����׬�:%d, isEmpty�����G��:%b\n", str2.length(),b1);
		System.out.printf("�r����׬�:%d, isEmpty�����G��:%b\n", str3.length(),b2);
		boolean b3 = str2.isBlank();
		boolean b4 = str3.isBlank();
//		System.out.printf("�r����׬�:%d, isEmpty�����G��:%b\n", str2.length(),b3);
//		System.out.printf("�r����׬�:%d, isEmpty�����G��:%b\n", str2.length(),b4);
		boolean b5 = StringUtils.hasLength(str2);
		boolean b6 = StringUtils.hasLength(str3);
		boolean b7 = StringUtils.hasLength(str4);
//		System.out.printf("�r����׬�:%d, isEmpty�����G��:%b\n", str2.length(),b5);
//		System.out.printf("�r����׬�:%d, isEmpty�����G��:%b\n", str2.length(),b6);
//		System.out.println("�r����׬�:%d, isEmpty�����G��:%b\n",0,b7);
//		SringUtils.hasLength(�ܼƦW��):�P�_ null + isEmpty�A���F�P�_���סA�ٷ|�ۦ�z��
		boolean b8 = StringUtils.hasLength(str2);
		boolean b9 = StringUtils.hasLength(str3);
		boolean b10 = StringUtils.hasLength(str4);
//		System.out.printf("�r����׬�:%d, isEmpty�����G��:%b\n", str2.length(),b8);
//		System.out.printf("�r����׬�:%d, isEmpty�����G��:%b\n", str2.length(),b9);
//		System.out.printf("�r����׬�:%d, isEmpty�����G��:%b\n", 0,b10);
		
		//�j�M
		String s1 = "�p�s�k�P���L�P���P��";
		String s2 = "�L";
		System.out.println(s1+s2);
//		System.out.println(s1.contains("��")); //�p�G�j�M���쵲�G�A�|�^��-1
//		System.out.println(s1.charAt(4));
//		System.out.println(s1.indexOf("��")); 
//		System.out.println(s1.lastIndexOf("��"));
//		System.out.println(s1.indexOf("��",9));
//		System.out.println(s1.indexOf("��",8));
		//indexOf("�j�M���e"�A�_�l��m):�q�_�l��m�}�l�j�M
		//lastIndexOf("�j�M���e"�A�_�l��m):�q�_�l��m�}�l�j�M
		
		
//		System.out.println(s1.substring(7));
//		System.out.println(s1.substring(7,9)); //index >= 7  AND index < 9
//		System.out.println(s1);
//		System.out.println(s1.trim());
//		System.out.println(s1.replace("�P", "")); //��H�Ŧr����N�Y�Ӥ�r�ɡA�Y�i��q�R���Y�Ӥ�r
//		System.out.println(s1.replace(" ", ""));  //��H�Ŧr����N�ťծɡA�Y�i��r�ꤤ���Ҧ��ťծ�R��
//		System.out.println(s1.concat(s2)); 
//		System.out.println(s1.replaceAll("�P", ""));
		
		//�ഫ��ƫ��A
		String[] ar1 = s1.split("�P");
		String[] ar2 = s1.split("");
//		System.out.println(Arrays.toString(ar2));
//		System.out.println(String.join("+", ar1));
//		System.out.println(s1.toCharArray()); // char array�O�}�C�����S�C�A���|�L�X�O�����m�A�ӥi�H�����C�X���e�ȡA���O�L�X�������|�ΡA���j
//		System.out.println(Arrays.toString(s1.toCharArray()));
		char[] ch = new char[2];
//		System.out.println(ch);
//		s1.getChars(7,9,ch,0);
//		System.out.println(ch);
		
		String q1 = String.valueOf(1);
		String q2 = String.valueOf(true);
		String q3 = String.valueOf(0.0);
		q1 = 1+ "";
		
		Integer z = Integer.valueOf("1");
		int z2 = Integer.parseInt("1");
		
		//������e��
		String st1 = "a";
		String st2 = "a";
		String st3 = new String("a");
		String st4 = new String("A");
//		System.out.println(st1==st2);
//		System.out.println(st1==st3);
//		System.out.println(st1.equals(st2));
//		System.out.println(st1.equals(st3));
		System.out.println(st1.equals(st4));
		System.out.println(st1.equalsIgnoreCase(st4));
	}
	
	
	@Test
	public void classTest() {
		Bank b = new Bank();
		b.name = "�x�n";
		b.money = 100;
		b.account = "123456";
		
		Bank c = new Bank();
		c.name = "�x�n";
		c.money = 100;
		c.account = "123456";
		
		b.saveMoney(100);
		System.out.println(b.money);
		System.out.println(c.money);
	}
	
		@Test
		public void wordText() {
			this.count("ABCD");
		}
		
		public void count(String str) {
			int a = 0;
			int b = 0;
			int c = 0;
			int d = 0;
			for(int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				switch(ch) {
				case 'A':
					a++;
					break;
				case 'B':
					b++;
					break;
				case 'C':
					c++;
					break;
				case 'D':
					d++;
				}
			}
		}
	
}
