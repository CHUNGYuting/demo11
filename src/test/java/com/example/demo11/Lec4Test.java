package com.example.demo11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.junit.jupiter.api.Test;

public class Lec4Test {

	@Test
	public void arrayTest() {

		// �ŧi�}�C
		int[] arr1 = new int[7]; // ��«ŧi
		Integer[] arr1Class = new Integer[7];
		int arr2[] = new int[7]; // ��«ŧi
		int[] arr3 = { 1, 2, 3, 4, 5, 6, 7 }; // �ŧi�P�ɵ�����

		// ��ŧi���}�C���e�ȳ��|�O null �άO �w�]�� (�p�G�ŧi�ɨS�����)
		System.out.println(arr1[0]); // �p�G�ϥΰ򥻸�ƫ��A�ŧi�A�|�۰����A�˶i�w�]��
		System.out.println(arr1Class[0]); // �p�G�ϥ����O�ŧi�A���|���w�]�ȡA�|�O�Ū�
		System.out.println(arr3[7]); // �]�����ޭȬO�q 0 �}�l�A�G���׬� 7 �ɡA���ޭȷ|�b 0 ~ 6�A�{���䤣����ޭȬ�7����l�A�N�|����

		// ���
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

		double[] weather = { 30.0, 26.5, 27.5, 23.3, 21.8, 28.5, 35.9 }; // �ϥΰ}�C�i�H�٥h�h�Ӭۦ����ܼơA��K�޲z

		System.out.println(this.avgWeather(weather));

	}

	public double avgWeather(double[] weatherData) {
		System.out.println(weatherData.toString()); // �u�n���O�򥻸�ƫ��A�ܼƸ̭��s���|�O�O�и̦�m�A�G�������ܼƦW���ഫ���r��A�|�L�X�O�����m
		System.out.println(Arrays.toString(weatherData)); // �ݭn�u�� Arrays ���Ѫ���k�~�ॿ�T�L�X���e��

		int sum = 0;
		for (int i = 0; i < weatherData.length; i++) { // �}�C�����ޭȳ̤j < ���� �A�]�����ޭȥû����|�O����-1
			sum += weatherData[i];
			System.out.println(weatherData[i]);
		}
		double avg = sum / weatherData.length; // ���קY���Ȫ��ӼơA�G / ���קY�� ������
		return avg;
	}

	@Test
	public void listTest() {
		// �ŧi
		List<String> list1 = Arrays.asList("1", "2"); // �L�k�W�R
		List<Integer> list2 = List.of(99, 100); // �L�k�ק�
		List<Character> list3 = new ArrayList<>(); // �i�H���N�ק�
		List<String> list7 = new ArrayList<String>(); // �᭱�����A���̼˥i�H��J��ƫ��A�A���]���ܳ·СA�q�`���|�g
		List<String> list8 = new ArrayList<String>(list1); // �ŧi�P�ɵ���
//		System.out.println(list8.get(0));

		// �ϥ� ArrayList �~����ק� List �����e
		list8.add("3");
		System.out.println(list8.get(2));
		list8.remove("1");
		System.out.println(list8.get(0));

		// Q ������O new ArrayList ?
//		List<Character> list5 = new List<>();
		// A �]�� list �O interface ����Ʈ榡�A�G��S�������@(��ڪ��ާ@�B�J)�A�L�k�Q�Ы�
		// �p�G�չ� new List �|�ɭP���~
//		list3 = new LikedList<Character>();
		// �����򤣨ϥ� ArrayList�Ӹ� new ArrayList�����G?
//		ArrayList<Character>list4= new ArrayList<>();
		// (1)�]�� ArrayList�O��@ List�̭��w�q�n����k�A�G ArrayList�i�H�Q�����OList���@��
		// �GList ���|�� ArrayLis ���ƥ������A�i�H�˶i ArrayList
		// ==>�u�n�O��@�ۦP interface �����O(class)�A���i�H�� interface �@����e��(�ܼ�)����ƫ��A
		// (2) �]�������i�H�Q�h�����O��@�A��� interface �ӻ��A���P��@���O�L���@��
		// ���藍�P��@(class) �ӻ��A���������۳q�A�G�S����k�˶i�����̭�
		// �]���ĥ� interface �@���e������ƫ��A�A�i�H���˦U���U�˪���@���O(class)

//		List4= new LinkedList<Character>();
//		System.out.print(list1.get(1));
		// Arrays.asList�MList.of �����׵L�k�ܧ�A�Y���ϥ� add(�s�W) �� remove (�R��)�A�N�|����
//		list1.add("3");  
//		list1.remove(0);
//		list2.add(98);
//		list2.remove(0);

		// ********�m��******

		double[] weather = { 30.0, 26.5, 27.5, 23.3, 21.8, 28.5, 35.9 }; // �ϥΰ}�C�i�H�٥h�h�Ӭۦ����ܼơA��K�޲z
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
		// (1)�j�M index of 30.0�A�j�M�����^�� index of 30.0
		// (2)�ھ� index of 30.0�A�����������ޭ�

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

		// �M���g�k
		// item�O�i�۩w�q���ܼƦW�١A�ΨӥN�٫_���᭱�� list �̪��C�@����ơA�i�W�[�{�����iŪ��
		for (Double item : weatherList) { // item = weatherList.goe(i)
			if (weatherList.indexOf(item) == 0) {
				// �M���b�{������e�A�N�|�]�w�n���ޭȪ��d��
				// �]���b�B�@���L�{���A������h�ק� list �����סA�|�ɭP���ޭȿ��~
				weatherList.remove(0);
				weatherList.add(0.0);
			}
			System.out.println(item);
		}

//		//lambda �g�k
//		weatherList.forEach(item -> {  
//		System.out.println(item);
////			sum += item; //lambda �g�k������O���঳�ϰ��ܼƦb�̭��A�ҥH�L�k�έp��Ҧ���ƪ��`�M(�]���S���e���h�x�s���G)
////			if(weatherList)
//		});
		return sum / weatherList.size();
	}

	// **********�m��************
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
		System.out.printf("�̤j��:%d\n�̤p��:%d\n�o��:%d", max, min, (sum - max - min) / (score.length - 2));
		return (sum - max - min) / (score.length - 2);
	}

	public double avgScoreBySort(int[] score) {
		System.out.println("�z��J�����C��:" + Arrays.toString(score));
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
		 //�n��bwhile�j���ح��A�~�|�@���ͦ��H����
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
