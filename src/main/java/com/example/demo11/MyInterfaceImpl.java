package com.example.demo11;

//類別要實作介面使用的關鍵字 implements 
public class MyInterfaceImpl implements MyInterface {

	//類別必須要重新定義""所有定義""在介面中的方法
	
		
	//預設方法不強制一定要重新定義
	@Override
	public void flying2(String name) {
		// TODO Auto-generated method stub
		MyInterface.super.flying2(name);
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void flying() {
		// TODO Auto-generated method stub
		
	}

}
