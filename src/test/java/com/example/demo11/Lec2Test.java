package com.example.demo11;

import org.junit.jupiter.api.Test;

public class Lec2Test {
	@Test 
	public void reviewLec1() {
		int  a  ;
		String b = "1111";
	}
	
	
	
	public void reviewLec2() {
// ������
		/*�h�����
		 * �o�ӵ��Ѥ覡�i�H���g����h�檺���O
		 */
		this.fileCommentTent(0);
}
	/**
	 * 
	 * @param test �ѥ���ISBN�s��
	 * @return �ѥ��W��
	 */
	public String fileCommentTent(int test) {
		return null;
	}
	
	@Test
	public void computeTest() {
		int remaidar = 10%3;
		int quotient = 10/3;
		System.out.println("10���H3���l�ƬO:"+remaidar);
		System.out.println("10���H3���ӼƬO:"+quotient);
		
		//		
		
		int a = 10 ;
		System.out.println(a);
		System.out.println(a++ * 10 ); //a*10; a=a+1;
		System.out.println(a);
		
		System.out.println("**********************");
		
		a=10;
		System.out.println(a);
		System.out.println(++a * 10); // a=a+1 ; a*10;
		System.out.println(a);
		
	}
	@Test
	public void computeTest2(){
	 	int a = 1; 
	 	int b = 3;
	 	a+=9;
	 	System.out.println(a);
	 	a-=1;
	 	System.out.println(a);
	 	a--;
	 	System.out.println(a);
	 	a*=5;
	 	System.out.println(a);
	 	a%=b;
	 	System.out.println(a);
	 	
	 	//
//	 	boolean test = true;
//	 	System.out.println(!test);
	 	//
	 	boolean res1 = (1!=1); //false
	 	boolean res2 = (1==1); //true
	 	System.out.println(res1);
	 	System.out.println(res2);
	 	System.out.println(res1 && res2); // &&��ӳ��n���ߤ~�|�Otrue
	 	System.out.println(res1 || res2); // ||�u�n���@�Ӧ��ߴN�|�Otrue
	}
	
	@Test
	public void practiceTest() {
		int a = this.sum(1,100);
		System.out.println(a);		
	}
	
	/**
	 * �p��q1�}�l���ƦC�`�M
	 * @param start 
	 * @param end �ƦC�פ��
	 * @return �ƦC�`�M
	 */
	public int sum(int start,int end) {
		int sum=(start+end)*(end-start+1)/2;
		
	    return sum;    	
	}
	
	@Test
	public void practiceTest1() {
		double b = this.CTansferToF(30);
		System.out.println(b);
		
		double C = this.FTansferToC(86);
		System.out.println(C);
	}	
	
	//�ئ��ū� = ���ū� * 9/5 + 32
	/**
	 * �ഫ�ū׳�쬰�ئ�
	 * @param C ���ū�
	 * @return �ؤ�ū�
	 */
	public double CTansferToF(double C) {
		double F = C*9/5+32;
		return F; 
	}
	
	//�ئ��ū� = ���ū� * 9/5 + 32
	
	public double FTansferToC(double F) {
		double C= (F-32)/9*5;
		return C; 
	}
	
	
	@Test
	public void forLoopTest() {
		System.out.println(this.forLoop(5));	
	
		
	}
	@Test
	public int forLoop(int end) {
		int sum=0;
		for(int i = 1; i <= end; i++) {
			sum=sum+i;
		
		}
		return sum;
	}
	
	public int whileLoop(int end) {
		int sum=0;
		int i = 1;
				
		while(i <= end) { 
			sum=sum+i;
			i++;
		}
		return sum;
	}
	
	 @Test
	   public void doWhileLoop(int end) {
		 int sum=0;
		 int i = 1;
	   do{
	       sum=sum+i;
	       i++;  
	   } while(i<= end);

	   }
	   
		
	
	
	
	
	
	@Test
	public void mutipleFormByForLoop() {
		for(int i = 1; i < 10 ; i++) {
			for(int j = 1;j < 10; j++) {
				System.out.printf("%d*%d=%2d ",j,i,i*j);	
			}	
//			System.out.println();
			System.out.printf("\n");
		}
	}
	
	@Test
	public void mutipleFormBywhileLoop() {
		int i =1;
		while(i<10) {
			int j=1; //�C��i���槹�@������A�N�|���s��l��
			while(j<10) {
				System.out.printf("%d*%d=%2d ",j,i,i*j);
				j++;
			}
			System.out.printf("\n");
			i++;
		}
		
	}
	
	@Test
	public void infiniteForLoop() {
//		while(true) {
//			System.out.println("Hi");
			
//		}
		int i = -1;
		for(;;) {
			i++;
			if(i==1) {
//				continue;
//				return;
				break;
			}
			if(i==5) {
//				break;
				continue;
			}
			System.out.println(i);
			i++;
			
		}
		System.out.println("I still here");
	}
	
	@Test
	public void nestedLoopBreakTest(){
		a:for(int i = 0;i<10;i+=2) {  //���j��[�W���ҦW�١A�u�ݭn�A�j��e���[�W[���ҦW��:]
			System.out.println(i);
			for(int j =1;j<10;j+=2) {
				System.out.println(j);
//				break;  //�w�]�|��̪񪺰j��@�ΡA�G�|���Xj���j��
				break a;  //�Y�n��~�h�j��@�ΡA���A�~�h�j��[�W���ҡA�A���������Ҥ��e
				
			}
			System.out.println("���h�w����");
			
		}
		System.out.println("�~�h�w����");
	}
	
	@Test
	public void chickenRabbitTogetherByTnfiniteLoop(int head,int foot) {
		
		//�P�_�O�_���Ӽ�:��_�Q2�㰣
		//�p�G���H2�l0=>�Ӽ� | �l1=>�_��
		if(foot%2==1) {
			System.out.println("���D�L��");
			return;
		}
		
		
		//���]�ߤl���ƥجO0��
		int rabbit = 0 ;
		
		//�H�U��k�����ư���A����while�]�_��
		while(true) {
							
		//�Q�Ψߤl���ƥءA�ϱ������ƥ�
			int chicken= head - rabbit ;


		//�p�G�ߤl+�����}�ƥط|��n�ŦX�}���ƥءA�Y���Ѥ��@
			if(rabbit*4 + chicken*2 == foot) {
			
				//case1:��n�ŦX
				System.out.printf("��:��\n%d: %d\n",chicken,rabbit);
				//�]���u���ߤ@��,���}�j��
				//break;
				return;//�]�����}�����S���n����L�Ʊ��A�ҥH�������}��Ӥ�k�]��
			}
		System.out.println("����@��");
		
		
		//case2:�U�@��
		rabbit++;
		
		//�p�G��>�Y�A�L�ѡA���X�j��
		if(rabbit > head) {
			System.out.println("���D�L��");
//			break;
			return; //�]�����}�����S���n����L�Ʊ��A�ҥH�������}��Ӥ�k�]��
		}
	  
		
		
		
	}
}
	

}
  
	
	
 











	
	
	