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
		String str = "abcde"; //���� 5 
		String[]strArray = str.split("");// [a ,b, c, d, e]
							        //index: 0  1  2  3  4  
		String newStr = "";
		for(int i = strArray.length - 1;i >= 0; i--) {
			String item = strArray[i];
			newStr = newStr + item;
			//�Ĥ@�� i= 4 ; item = "e";  newStr �q "" -->""+"e" = "e"
			//�ĤG�� i= 3 ; item = "d";  newStr �q "e" -->"e"+"d" = "ed"
			//�ĤT�� i= 2 ; item = "c";  
			//�ĥ|�� i= 1 ; item = "b";
			//�Ĥ��� i= 0 ; item = "a";
		}
		//-----------------------------------------------------------------
		StringBuffer strBuf = new StringBuffer(str);
		strBuf = strBuf.reverse();
	}
	
	@Test
	public void tttTest() {
		int a = 5 ;
		if(a >= 18) {
			System.out.println("�~��:"+ a );
			System.out.println("�w���~");
		}
	}
	
	
	
}
