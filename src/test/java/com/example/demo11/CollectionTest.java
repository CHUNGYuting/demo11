package com.example.demo11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

public class CollectionTest {

	@Test
	public void listTest() {
		String str = new String();
		Bank bank = new Bank();
		// List 是介面(interface)，只是用來定義方法而已，並無任何實作內容，所以無法使用 new 建立實例
		// ArrayList 是用來實現定義在 List 中方法的實作類別
		List<Bank> List = new ArrayList<>();
		// List 中的資料型態不能放8種基本資料型態，意思就是只能放類別(class)
		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(1);
		intList.add(3);
		intList.add(2, 5);
		for (Integer item : intList) {
			System.out.println(item);
		}
		intList.remove(2);
		for (Integer item : intList) {
			System.out.println(item);
		}
	}

	@Test
	public void listTest2() {
		LinkedList<String> list = new LinkedList<>();
		List<Integer> strList = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("A");
		list.add("C");
		System.out.println(list.getFirst());
		System.out.println(list.getLast());

		List<String> strList1 = new ArrayList<>();
		strList1.add("A");
		strList1.add("B");
		strList1.add("A");
		strList1.add("C");
		System.out.println(list.get(0));
		System.out.println(list.get(strList1.size() - 1));
	}

	@Test
	public void HashSetTest() {
		// HashSet
		// 1.相同的元素只會保留一個(不允許重複的元素)
		// 2.無序(不會依照新增的順序來排列)
		Set<String> strSet = new HashSet<>();
		strSet.add("A");
		strSet.add("C");
		strSet.add("A");
		strSet.add("B");
		strSet.add("F");
		strSet.add("D");
		strSet.add("E");
		strSet.add("B");

		for (String item : strSet) {
			System.out.println(item);
		}
	}

	@Test
	public void linkedHashSetTest() {
		// LinkedHashSet
		// 1.相同的元素只會保留一個(不允許重複的元素)
		// 2.有序(會依照新增的順序來排列)
		Set<String> strSet = new LinkedHashSet<>();
		strSet.add("A");
		strSet.add("C");
		strSet.add("A");
		strSet.add("B");
		strSet.add("F");
		strSet.add("D");
		strSet.add("E");
		strSet.add("B");

		for (String item : strSet) {
			System.out.println(item);
		}
	}

	@Test
	public void treeSetTest() {
		// treeSet
		// 1.相同的元素只會保留一個(不允許重複的元素)
		// 2.由小到大排列
		Set<String> strSet = new TreeSet<>();
		strSet.add("A");
		strSet.add("C");
		strSet.add("A");
		strSet.add("B");
		strSet.add("F");
		strSet.add("D");
		strSet.add("E");
		strSet.add("B");

		for (String item : strSet) {
			System.out.println(item);
		}
	}

	@Test
	public void randomNumbersTest() {
		Random random = new Random();
		Set<Integer> Numbers = new TreeSet<>();

		while (Numbers.size() < 5) {
			int num = random.nextInt(1, 11);
			Numbers.add(num);
		}

		ArrayList<Integer> numbersList = new ArrayList<>(Numbers);

		int max = Collections.max(numbersList);
		int min = Collections.min(numbersList);

		System.out.println("隨機產生的數字: " + numbersList);
		System.out.println("最大數字: " + max);
		System.out.println("最小數字: " + min);

		System.out.println("由小到大排序: " + numbersList);

		Collections.sort(numbersList, Collections.reverseOrder());
		System.out.println("由大到小排序: " + numbersList);
	}
	// ***********************隨機數字練習題，老師示範*********************

	@Test
	public void setTest() {
		Set<Integer> set = new TreeSet<>();
		Random ran = new Random();
		while (set.size() < 5) {
			// 1~10的亂數
//				int number = ran.nextInt(1, 11);
//				set.add(number);
			// 上述兩行中，因為number被宣告後，在後續的程式碼只被使用一次，可以用匿名的方式合併
			set.add(ran.nextInt(1, 11));
		}
		// 轉型:將值得資料型態轉換成另一種資料型態
		// 1. 被轉型的資料型態寫在變數前面，一定要有小括號(TreeSet<Integer>)set
		// 2. 使用小括號將轉換的資料型態和值框在一起，這樣才能使用轉換資料型態後的方法
		// 3. 慎用
		System.out.println("min:" + ((TreeSet<Integer>) set).first());
		System.out.println("max:" + ((TreeSet<Integer>) set).last());
	}

	@Test
	public void setTest3() {
		Set<Integer> set = new TreeSet<>();
		Random ran = new Random();
		while (set.size() < 5) {
			// 1~10的亂數
//				int number = ran.nextInt(1, 11);
//				set.add(number);
			// 上述兩行中，因為number被宣告後，在後續的程式碼只被使用一次，可以用匿名的方式合併
			set.add(ran.nextInt(1, 11));
		}
		// 將 Set 轉成 List
		List<Integer> list = new ArrayList<>(set);
		System.out.println("min:" + list.get(0));
		System.out.println("max:" + list.get(list.size() - 1));
		// 由小到大
		System.out.println(set);
		// 由大到小 (treeSet的反序)
		System.out.println();
		Collections.reverse(list); // reverse:反轉排序
		System.out.println(list);
	}

	// ---------------------------------------------------------

	@Test
	public void mapTest() {
		// Map < key 的資料型態，value 的資料型態 >
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		// 使用 get(key值)透過 key 將對應的 value 取出
		String str = map.get(2);
		System.out.println(str);
		// 遍歷:使用 foreach 將 map 中的 key-value 取出
		// 將 map 轉成 entrySet，item 就是包含了 key 和 value ，可以使用 getKey 和 getValue 取值
		for (Entry<Integer, String> item : map.entrySet()) {
			System.out.println(item.getKey());
			System.out.println(item.getValue());
		}
		System.out.println("=====");
		// 將 map 轉成 keySet，每個 item 就表示一個 key ，透過 get(item) 將對應的 value 取出
		for (Integer item : map.keySet()) {
			System.out.println("key:" + item);
			System.out.println("value:" + map.get(item));
		}
		System.out.println("=====");
		// 原本 map 中，已存在 key = 1 以及對應的 value = A;
		// 現在在相同1的位置放入 D，key = 1 其對應的 value 會變成 D(相同 key ，對應的 value 後蓋前)
		map.put(1, "D");
		// 不同的 key ，可以有相同或不同的對應 value
		map.put(4, "D");
		for (Entry<Integer, String> item : map.entrySet()) {
			System.out.println(item.getKey());
			System.out.println(item.getValue());
		}
	}

	@Test
	public void mapTest2() {
		// key-value 是 1對1
		Map<Integer, String> map = new HashMap<>();
		// key-value 是 1對多
		Map<Integer, String[]> map2 = new HashMap<>();
		Map<Integer, List<String>> map3 = new HashMap<>();
		Map<Integer, Set<String>> map4 = new HashMap<>();
		Map<Integer, Map<String, String>> map5 = new HashMap<>();
	}

	@Test
	public void test123() {
		// isEmpty(): 詢問集合或是 Map 其 size 是否為0(空的)
		List<String> list = new ArrayList<>();
		System.out.println(list.isEmpty());

		Set<String> set = new HashSet<>();
		System.out.println(set.isEmpty());

		Map<Integer, String> map = new HashMap<>();
		System.out.println(set.isEmpty());
		// =========
		System.out.println("=============");
		List<String> list2 = null;
		// 因為 list2 是 null ，所以無法使用 null 透過 . 方法()來執行程式，會報錯
		// 下行程式碼會報 NullPointerException(空指針錯誤)
		System.out.println(list2.isEmpty());
	}

	// ****************************練習題*****************************

	@Test
	public int[] twoSum(int[] nums, int target) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];

			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}

			map.put(nums[i], i);
		}

		throw new IllegalArgumentException("No two sum solution");
	}

	public void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;

		int[] result = twoSum(nums, target);
		System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
	}
}
