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

	// **********�m��************
	@Test
	public void getPricetTest() {
		this.getPrice(20);
	}

	public int getPrice(int age) {

		// ���ܼƱN�����˰_�ӡA��K������@(�p�����ݭn�ק�A�u����ʦ��B�Y�i)
		int price = 150;
		if (age <= 6 || age >= 80) { // ���z����ɭȡA�|�����K���᪺�B��A�]�����ΥX�Ӫ��q������֥B�s�e
										// �Τp�󵥩�6�� �B �j�󵥩�80���A�ѤU���H�s�|�O =>7~79
										// ��7~12��60~79 �ѤU���H�s�|�O => <=6 13~59 >=80
										// ��13~59���Ϋ�ѤU���H�s�|�O => <=12 >=60
			return (int) (price * 0.2);
		} else if (age <= 12 || age >= 60) { // �]���Ĥ@�h if �w�g�z�良���C���Τj��K�Q�����H�s�A�G�ѤU���H�@�w�|�b7~79����
			return (int) (price * 0.5);
		} else { // �̲׳ѤU���Y�@�벼�����H
			return price;
		}

		// ���if���g�k���M���������A���\Ū�W�� if...else if...else���P
//		if(age <= 6 || age >=80) {
//			return (int)(price*0.2);  //return�|�����N���G�^�Ǩòפ��k�A�G�������󪺤H�|�۰����}
//		}
//		if(age >=7 && age <= 12 || age >= 60 && age <=79) {
//			return(int)(price*0.5);
//		}
//		return price;
	}

	// ���󱱨�-if
	public void ifTest() {

	}

	// ���󱱨�-switch
	@Test
	public void switchTest() {

		String book = "�Ĥ@��";

		// �i�H��switch�Q���n�{��Ū�@����
		switch (book) { // �p�A�����񪺬O�n�{���}�lŪ������
		case "��": // �{���X�|�̧ǹ����C�@��case�A�q�ŦX����case�}�l���U�\Ū
		case "�Ĥ@��":
			System.out.println("11111111");
			break; // Ū��break���ɭԡA�{���N�|���쵲���\Ū���q���A���} switch���j�A��
		case "�ĤG��":
			System.out.println("2222222");
			// �ӭY�S���[�Wbreak���ܡA�{���N�|���۰���A�����㥻�u�ѡv��Ū��
			break;
		default: // �Y�{���ھڿ�J������A�䤣��۲Ū�case�A�N�|�۰ʱq �q�{ (default)����m�}�l����
			System.out.println("END");
		} // default �q�`��b�̫�A�]���᭱�S���O�� case�A�B�|�J�W�k�j�A���A�G�L���S�O�[�Wbreak�N�|�ۦ����}
	}

	@Test
	public void scoreTest() {

		int score = 100;

		// ���/���-��ơA�p���I�|�Q�۰ʬٲ�
		switch (score / 10) { // �ھڿ�J������A�j�M������case�A���n�����۲Ť~�|�i�J��case��

		case 10: // �]��case 10�Mcase 9 �n���檺���e���@�ˡA�G�i�H�����R��case 10 �����e�A�������L����M9�@�˪���k
					// �]��case�u�O�{���n���檺�_�I��m�A�Y�ϳo�Ӱ_�I��m���S���{���X�]�L���A�u�O�|�����~�򩹤U����
		case 9:
			System.out.println("A"); // �����̲׭n�^�Ǫ��ഫ���G
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
		default: // ��{���䤣��۲Ū�case�ɡA�̲״N�|�i�J���϶�����̭�����k
			System.out.println("F");
		}
	}

	public void guessNumberPrepare() {
		// ******�ù���J******
		System.out.println("�п�J�Ʀr");
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		System.out.println("�z��J���Ʀr�O:" + i);

	}

	@Test
	public void Number() {

		Random random = new Random();

		int targetNumber = random.nextInt(97) + 2;
		int lowerBound = 1;
		int upperBound = 99;

		Scanner scanner = new Scanner(System.in);
		int guess;

		System.out.println("�w��Ө�q�Ʀr�C���I�Цb 1 �� 99 �����q�@�ӼƦr�C");
		System.out.print("�п�J�@�ӼƦr�]" + lowerBound + "~" + upperBound + "�^�G");

		while (true) {

			guess = scanner.nextInt();

			if (guess <= lowerBound || guess >= upperBound) {
				System.out.println("��J���~�A�Ʀr�����b " + lowerBound + " �M " + upperBound + " �����C");
			} else if (guess < targetNumber) {

				lowerBound = guess;
				System.out.println("�Цb " + lowerBound + "~" + upperBound + " �d�򤺲q�ӼƦr");
			} else if (guess > targetNumber) {

				upperBound = guess;
				System.out.println("�Цb " + lowerBound + "~" + upperBound + " �d�򤺲q�ӼƦr");
			} else {

				System.out.println("���ߡI�A�q���F�I�ؼмƦr�O�G" + targetNumber);
				break;
			}
		}
	}
}






