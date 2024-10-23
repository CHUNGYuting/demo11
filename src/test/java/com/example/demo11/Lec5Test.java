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
		int c = Math.max(1, Math.max(2, 99)); //要比較三個倍以上的話，一樣得兩個比，再拿贏家去比較下一輪(呼叫多次max/min 的方法)		
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
	//	rint：retrun 最接近的整數值，但小數點是5時，回傳最接近的偶數值
	//	ceil：無條件進位
	//	floor：無條件捨去
	//	sqrt：開根號
	//	cbrt：立方根
	//	pow( x, y )：return x 的 y 次方，算出來的結果會是 double，所以記得可能要強制轉型成 int

		
		
	}
	
	@Test
	public void stringTest() {
		//長度
		String str1 = "123456";
		int a = str1.length();
//		System.out.println(a);
		
		//判斷內容有無意義
		String str5 = new String(); //預設空字串
		String str4 = null;
		String str2 = "";  //空字串(empty string)
		String str3 = " ";  //空白字串
		System.out.println(str5);
		System.out.println(str4);
		boolean b1 = str2.isEmpty();
		System.out.printf("字串長度為:%d, isEmpty的結果為:%b\n", str2.length(),b1);
		System.out.printf("字串長度為:%d, isEmpty的結果為:%b\n", str3.length(),b2);
		boolean b3 = str2.isBlank();
		boolean b4 = str3.isBlank();
//		System.out.printf("字串長度為:%d, isEmpty的結果為:%b\n", str2.length(),b3);
//		System.out.printf("字串長度為:%d, isEmpty的結果為:%b\n", str2.length(),b4);
		boolean b5 = StringUtils.hasLength(str2);
		boolean b6 = StringUtils.hasLength(str3);
		boolean b7 = StringUtils.hasLength(str4);
//		System.out.printf("字串長度為:%d, isEmpty的結果為:%b\n", str2.length(),b5);
//		System.out.printf("字串長度為:%d, isEmpty的結果為:%b\n", str2.length(),b6);
//		System.out.println("字串長度為:%d, isEmpty的結果為:%b\n",0,b7);
//		SringUtils.hasLength(變數名稱):判斷 null + isEmpty，除了判斷長度，還會自行篩選
		boolean b8 = StringUtils.hasLength(str2);
		boolean b9 = StringUtils.hasLength(str3);
		boolean b10 = StringUtils.hasLength(str4);
//		System.out.printf("字串長度為:%d, isEmpty的結果為:%b\n", str2.length(),b8);
//		System.out.printf("字串長度為:%d, isEmpty的結果為:%b\n", str2.length(),b9);
//		System.out.printf("字串長度為:%d, isEmpty的結果為:%b\n", 0,b10);
		
		//搜尋
		String s1 = "小龍女與楊過與楊與楊";
		String s2 = "過";
		System.out.println(s1+s2);
//		System.out.println(s1.contains("不")); //如果搜尋不到結果，會回傳-1
//		System.out.println(s1.charAt(4));
//		System.out.println(s1.indexOf("楊")); 
//		System.out.println(s1.lastIndexOf("楊"));
//		System.out.println(s1.indexOf("楊",9));
//		System.out.println(s1.indexOf("楊",8));
		//indexOf("搜尋內容"，起始位置):從起始位置開始搜尋
		//lastIndexOf("搜尋內容"，起始位置):從起始位置開始搜尋
		
		
//		System.out.println(s1.substring(7));
//		System.out.println(s1.substring(7,9)); //index >= 7  AND index < 9
//		System.out.println(s1);
//		System.out.println(s1.trim());
//		System.out.println(s1.replace("與", "")); //當以空字串取代某個文字時，即可批量刪除某個文字
//		System.out.println(s1.replace(" ", ""));  //當以空字串取代空白時，即可把字串中的所有空白格刪除
//		System.out.println(s1.concat(s2)); 
//		System.out.println(s1.replaceAll("與", ""));
		
		//轉換資料型態
		String[] ar1 = s1.split("與");
		String[] ar2 = s1.split("");
//		System.out.println(Arrays.toString(ar2));
//		System.out.println(String.join("+", ar1));
//		System.out.println(s1.toCharArray()); // char array是陣列鐘的特列，不會印出記憶體位置，而可以直接列出內容值，但是印出的結不會用，分隔
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
		
		//比較內容值
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
		b.name = "台南";
		b.money = 100;
		b.account = "123456";
		
		Bank c = new Bank();
		c.name = "台南";
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
