package com.example.demo11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.junit.jupiter.api.Test;

public class Lec4Test {

	@Test
	public void arrayTest() {

		// 宣告陣列
		int[] arr1 = new int[7]; // 單純宣告
		Integer[] arr1Class = new Integer[7];
		int arr2[] = new int[7]; // 單純宣告
		int[] arr3 = { 1, 2, 3, 4, 5, 6, 7 }; // 宣告同時給予值

		// 剛宣告的陣列內容值都會是 null 或是 預設值 (如果宣告時沒有賦值)
		System.out.println(arr1[0]); // 如果使用基本資料型態宣告，會自動幫你裝進預設值
		System.out.println(arr1Class[0]); // 如果使用類別宣告，不會有預設值，會是空的
		System.out.println(arr3[7]); // 因為索引值是從 0 開始，故長度為 7 時，索引值會在 0 ~ 6，程式找不到索引值為7的格子，就會報錯

		// 放值
		arr1[0] = 99;
		System.out.println(arr1[0]);

		// practice
		double weatherW1 = 30.0;
		double weatherW2 = 26.5;
		double weatherW3 = 27.5;
		double weatherW4 = 23.3;
		double weatherW5 = 21.8;
		double weatherW6 = 28.5;
		double weatherW7 = 35.9;

		double[] weather = { 30.0, 26.5, 27.5, 23.3, 21.8, 28.5, 35.9 }; // 使用陣列可以省去多個相似的變數，方便管理

		System.out.println(this.avgWeather(weather));

	}

	public double avgWeather(double[] weatherData) {
		System.out.println(weatherData.toString()); // 只要不是基本資料型態變數裡面存的會是記憶裡位置，故直接把變數名稱轉換成字串，會印出記憶體位置
		System.out.println(Arrays.toString(weatherData)); // 需要只用 Arrays 提供的方法才能正確印出內容值

		int sum = 0;
		for (int i = 0; i < weatherData.length; i++) { // 陣列的索引值最大 < 長度 ，因為索引值永遠都會是長度-1
			sum += weatherData[i];
			System.out.println(weatherData[i]);
		}
		double avg = sum / weatherData.length; // 長度即為值的個數，故 / 長度即為 平均值
		return avg;
	}

	@Test
	public void listTest() {
		// 宣告
		List<String> list1 = Arrays.asList("1", "2"); // 無法增刪
		List<Integer> list2 = List.of(99, 100); // 無法修改
		List<Character> list3 = new ArrayList<>(); // 可以任意修改
		List<String> list7 = new ArrayList<String>(); // 後面的角括號依樣可以填入資料型態，但因為很麻煩，通常不會寫
		List<String> list8 = new ArrayList<String>(list1); // 宣告同時給值
//		System.out.println(list8.get(0));

		// 使用 ArrayList 才能夠修改 List 的內容
		list8.add("3");
		System.out.println(list8.get(2));
		list8.remove("1");
		System.out.println(list8.get(0));

		// Q 為什麼是 new ArrayList ?
//		List<Character> list5 = new List<>();
		// A 因為 list 是 interface 的資料格式，故其沒有任何實作(實際的操作步驟)，無法被創建
		// 如果試圖 new List 會導致錯誤
//		list3 = new LikedList<Character>();
		// 為什麼不使用 ArrayList來裝 new ArrayList的結果?
//		ArrayList<Character>list4= new ArrayList<>();
		// (1)因為 ArrayList是實作 List裡面定義好的方法，故 ArrayList可以被視為是List的一種
		// 故List 不會對 ArrayLis 有排斥反應，可以裝進 ArrayList
		// ==>只要是實作相同 interface 的類別(class)，都可以用 interface 作為其容器(變數)的資料型態
		// (2) 因為介面可以被多個類別實作，對於 interface 來說，不同實作都是他的一種
		// 面對不同實作(class) 來說，彼此互不相通，故沒有辦法裝進彼此裡面
		// 因次採用 interface 作為容器的資料型態，可以盛裝各式各樣的實作類別(class)

//		List4= new LinkedList<Character>();
//		System.out.print(list1.get(1));
		// Arrays.asList和List.of 的長度無法變更，若對其使用 add(新增) 或 remove (刪除)，就會報錯
//		list1.add("3");  
//		list1.remove(0);
//		list2.add(98);
//		list2.remove(0);

		// ********練習******

		double[] weather = { 30.0, 26.5, 27.5, 23.3, 21.8, 28.5, 35.9 }; // 使用陣列可以省去多個相似的變數，方便管理
		List<Double> weatherList1 = new ArrayList<>();
		weatherList1.add(30.0);
		weatherList1.add(26.5);
		weatherList1.add(27.5);
		weatherList1.add(23.3);
		weatherList1.add(21.8);
		weatherList1.add(28.5);
		weatherList1.add(35.9);

		List<Double> tempList = Arrays.asList(30.0, 26.5, 27.5, 23.3, 21.8, 28.5, 35.9);
		List<Double> weatherList2 = new ArrayList<>(tempList);
		List<Double> weatherList3 = new ArrayList<>(List.of(30.0, 26.5, 27.5, 23.3, 21.8, 28.5, 35.9));
		for (int i = 0; i < weatherList1.size(); i++) {
			System.out.println(weatherList1.get(i) + "");
		}
		weatherList3.remove(weatherList3.indexOf(30.0));
		// (1)搜尋 index of 30.0，搜尋完畢回傳 index of 30.0
		// (2)根據 index of 30.0，移除對應索引值

		System.out.println(weatherList3.contains(0.0));
	}

	@Test
	public void score() {
		this.scoreTest(20, 60, 89, 90, 56);
	}

	public void scoreTest(int a, int b, int c, int d, int e) {
		int[] score = { a, b, c, d, e };
		System.out.println(Arrays.toString(score));

		int sum = 0;
		for (int i = 0; i <= score.length - 1; i++) {
			sum = sum + score[i];
		}
		double test = sum / 5;
	}

	public double avgWeatherByList(List<Double> weatherList) {
		double sum = 0;
		weatherList.size();
		weatherList.get(3);

//		for(int i = 0 , i < weatherList.siz(); i++) {
//			sum+= weatherList.goe(i);
//		}
//		

		// 遍歷寫法
		// item是可自定義的變數名稱，用來代稱冒號後面的 list 裡的每一筆資料，可增加程式的可讀性
		for (Double item : weatherList) { // item = weatherList.goe(i)
			if (weatherList.indexOf(item) == 0) {
				// 遍歷在程式執行前，就會設定好索引值的範圍
				// 因此在運作的過程中，不能夠去修改 list 的長度，會導致索引值錯誤
				weatherList.remove(0);
				weatherList.add(0.0);
			}
			System.out.println(item);
		}

//		//lambda 寫法
//		weatherList.forEach(item -> {  
//		System.out.println(item);
////			sum += item; //lambda 寫法的限制是不能有區域變數在裡面，所以無法用計算所有資料的總和(因為沒有容器去儲存結果)
////			if(weatherList)
//		});
		return sum / weatherList.size();
	}

	// **********練習************
	public void practiceText() {
		int[] score = { 60, 61, 62, 59, 58 };
		this.avgScore(score);
	}

	public int avgScore(int[] score) {
		int sum = 0;
		int max = score[0];
		int min = score[0];
		for (int i = 0; i < score.length; i++) {
			if (score[i] > max) {
				max = score[i];
			}
			if (score[i] > min) {
				min = score[i];
			}
			sum += score[i];
		}
		System.out.printf("最大值:%d\n最小值:%d\n得分:%d", max, min, (sum - max - min) / (score.length - 2));
		return (sum - max - min) / (score.length - 2);
	}

	public double avgScoreBySort(int[] score) {
		System.out.println("您輸入的陳列為:" + Arrays.toString(score));
		Arrays.sort(score);
		return 0;
	}

	@Test
	public void test() {
		this.randomNumber();
	}

	public String randomNumber() {
		List<Integer> numList = new ArrayList<>();
		Random r = new Random();
		 //要放在while迴圈裏面，才會一直生成隨機數
		while(numList.size()<4) {
			int num = r.nextInt(10);
			if (!numList.contains(num)) {
				numList.add(num);
			} //else {
				// do nothing;				
			//}
		}
		return numList.toString();
	}
}
