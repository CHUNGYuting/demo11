package com.example.demo11;

public class Bank extends Info {
	// C#  .net
	// branch_title
	
	//�`��(�T�w���ܪ���):�ܼƦW�٥��j�g�A���P�^��r�����Ω��u�걵
	public final int MAX_NUMBER = 10;
	
	
	//�@���ݩ��ܼơA�Τp�m�p�覡�R�W�ܼ�
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
