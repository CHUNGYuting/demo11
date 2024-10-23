package com.example.demo11;

import org.junit.jupiter.api.Test;

public class stringBufferTest {

	@Test
	public void stringBufferTest(){		
		StringBuffer strBuf = new StringBuffer("abc");
		strBuf.append("ABC");
		StrBuf.append("DEF").append("QQQ");
		System.out.println(strBuf.toString());		
	}
	
	@Test
	public void stringReverseTest() {
		String str = "abcde"; //長度 5 
		String[]strArray = str.split("");// [a ,b, c, d, e]
							        //index: 0  1  2  3  4  
		String newStr = "";
		for(int i = strArray.length - 1;i >= 0; i--) {
			String item = strArray[i];
			newStr = newStr + item;
			//第一次 i= 4 ; item = "e";  newStr 從 "" -->""+"e" = "e"
			//第二次 i= 3 ; item = "d";  newStr 從 "e" -->"e"+"d" = "ed"
			//第三次 i= 2 ; item = "c";  
			//第四次 i= 1 ; item = "b";
			//第五次 i= 0 ; item = "a";
		}
		//-----------------------------------------------------------------
		StringBuffer strBuf = new StringBuffer(str);
		strBuf = strBuf.reverse();
	}
	
	@Test
	public void tttTest() {
		int a = 5 ;
		if(a >= 18) {
			System.out.println("年齡:"+ a );
			System.out.println("已成年");
		}
	}
	
	
	
}
