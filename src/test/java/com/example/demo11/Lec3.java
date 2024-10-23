package com.example.demo11;

import java.util.Random;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class Lec3 {

	@Test
	public void recurrenceTest() {
//		System.out.println(this.recurrence(100));
	}

	public int money(int age) {
		if(age <= 6 || age>= 80 ) {
			return 20;
		}
		if(age >=7 && <=12 || age >=60 && <=79 ) {
			return 50;
		}
			return 100 ;
	}

	// **********練習************
	@Test
	public void getPricetTest() {
		this.getPrice(20);
	}

	public int getPrice(int age) {

		// 用變數將票價裝起來，方便之後維護(如漲價需要修改，只須更動此處即可)
		int price = 150;
		if (age <= 6 || age >= 80) { // 先篩選邊界值，會比較方便之後的運算，因為切割出來的段落比較少且連貫
										// 用小於等於6歲 且 大於等於80歲，剩下的人群會是 =>7~79
										// 用7~12或60~79 剩下的人群會是 => <=6 13~59 >=80
										// 用13~59切割後剩下的人群會是 => <=12 >=60
			return (int) (price * 0.2);
		} else if (age <= 12 || age >= 60) { // 因為第一層 if 已經篩選未滿七歲或大於八十歲的人群，故剩下的人一定會在7~79之間
			return (int) (price * 0.5);
		} else { // 最終剩下的即一般票價的人
			return price;
		}

		// 單純if的寫法雖然較為冗長，但閱讀上較 if...else if...else輕鬆
//		if(age <= 6 || age >=80) {
//			return (int)(price*0.2);  //return會直接將結果回傳並終止此方法，故滿足條件的人會自動離開
//		}
//		if(age >=7 && age <= 12 || age >= 60 && age <=79) {
//			return(int)(price*0.5);
//		}
//		return price;
	}

	// 條件控制-if
	public void ifTest() {

	}

	// 條件控制-switch
	@Test
	public void switchTest() {

		String book = "第一章";

		// 可以把switch想成要程式讀一本書
		switch (book) { // 小括號內放的是要程式開始讀的條件
		case "序": // 程式碼會依序對應每一個case，從符合條件的case開始往下閱讀
		case "第一章":
			System.out.println("11111111");
			break; // 讀到break的時候，程式就會收到結束閱讀的通知，離開 switch的大括號
		case "第二章":
			System.out.println("2222222");
			// 而若沒有加上break的話，程式就會接著執行，直到把整本「書」給讀完
			break;
		default: // 若程式根據輸入的條件，找不到相符的case，就會自動從 默認 (default)的位置開始執行
			System.out.println("END");
		} // default 通常放在最後，因為後面沒有別的 case，且會遇上右大括號，故無須特別加上break就會自行離開
	}

	@Test
	public void scoreTest() {

		int score = 100;

		// 整數/整數-整數，小數點會被自動省略
		switch (score / 10) { // 根據輸入的條件，搜尋對應的case，須要完全相符才會進入該case內

		case 10: // 因為case 10和case 9 要執行的內容都一樣，故可以直接刪除case 10 的內容，直接讓他執行和9一樣的方法
					// 因為case只是程式要執行的起點位置，即使這個起點位置內沒有程式碼也無妨，只是會順著繼續往下執行
		case 9:
			System.out.println("A"); // 此為最終要回傳的轉換結果
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default: // 當程式找不到相符的case時，最終就會進入此區塊執行裡面的方法
			System.out.println("F");
		}
	}

	public void guessNumberPrepare() {
		// ******螢幕輸入******
		System.out.println("請輸入數字");
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		System.out.println("您輸入的數字是:" + i);

	}

	@Test
	public void Number() {

		Random random = new Random();

		int targetNumber = random.nextInt(97) + 2;
		int lowerBound = 1;
		int upperBound = 99;

		Scanner scanner = new Scanner(System.in);
		int guess;

		System.out.println("歡迎來到猜數字遊戲！請在 1 到 99 之間猜一個數字。");
		System.out.print("請輸入一個數字（" + lowerBound + "~" + upperBound + "）：");

		while (true) {

			guess = scanner.nextInt();

			if (guess <= lowerBound || guess >= upperBound) {
				System.out.println("輸入錯誤，數字必須在 " + lowerBound + " 和 " + upperBound + " 之間。");
			} else if (guess < targetNumber) {

				lowerBound = guess;
				System.out.println("請在 " + lowerBound + "~" + upperBound + " 範圍內猜個數字");
			} else if (guess > targetNumber) {

				upperBound = guess;
				System.out.println("請在 " + lowerBound + "~" + upperBound + " 範圍內猜個數字");
			} else {

				System.out.println("恭喜！你猜中了！目標數字是：" + targetNumber);
				break;
			}
		}
	}
}






