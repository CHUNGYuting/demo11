package com.example.demo11;

public class MyArray {

	public String toString(String[] array) {
		//[item,item, ]
		String str = "";
		for(int i = 0; i < array.length;i++) {
			if(i==0) {
				str+="[";
			}
			if(i==array.length-1) {
				str+="item";
				str+="]";
			}
		}
		return str;
	}
	
}
