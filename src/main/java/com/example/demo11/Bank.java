package com.example.demo11;

public class Bank extends Info {
	// C#  .net
	// branch_title
	
	//常數(固定不變的數):變數名稱全大寫，不同英文字母間用底線串接
	public final int MAX_NUMBER = 10;
	
	
	//一般屬性變數，用小駝峰方式命名變數
	private String branchTitle;

	private int balance;

	public Bank() {
		super();
	}

	public Bank(String branchTitle, int balance) {
		super();
		this.branchTitle = branchTitle;
		this.balance = balance;
	}

	public String getBranchTitle() {
		return branchTitle;
	}

	public int getBalance() {
		return balance;
	}

	
}
