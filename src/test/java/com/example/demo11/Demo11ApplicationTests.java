package com.example.demo11;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest//���q�{���J�f�}�l�B�@�A�|�������{�����򥻰t�m�A�A������դ��e
class Demo11ApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void interfaceTest() {
		MyInterface my = new MyInterfaceImpl();
		System.out.println(my.NUM);
		System.out.println(MyInterface.NUM2);
	}
	
	
}
