package com.example.demo11;

import org.junit.jupiter.api.Test;

public class HelloTest {

 @Test//�n�ϥγ椸���ե����[�W�� annotation
 public void helloTest() {
	 //syso+alt+/ �Y�i�ֳt�I�s�X�t�ΦC�L
	System.out.println(this.helloMarker("hello"));	
	// this �O�Ω�I�s��k�j�A���~����k���ܼƮɡA�~�ݭn�K�[
	//�I�s��k�ɡA���צ��S���ǤJ�ѼơA�������[�W�p�A��
	//�p:this.�j�A���~����k�W��(�Ѽ�)
	System.out.println(this.helloMarker2("hello","bye"));	
	}
	
  public String helloMarker(String inString) {
	  //�]���ŧi��k�ɡA���n�D�^�Ǧr��A�G����return�r��A�~���|����
	  return inString+"world";
  }
  
  //�b�ѼƦW�٫e���[�W...�Y�i��J���u�@�ӰѼơA�ӶǤJ���ѼƷ|�H�}�C(array�B��Ʋզ����@���C)���覡�x�s
  //���ɪ��ѼƦW�ٷ|�N�����}�C���x�s��m(�O����Ŷ�)�A�n���ΰ}�C�������e�ݭn�[�W[���ަ�m]
  //���B�O�o�A�{�������ަ�m�q�`�H0���_�l��
 public String helloMarker2(String ...inString) {
	 return inString[1]+"world";
 }
 @Test
 public void staticFinalTest() {
	 //ctrl+�I��:�i�d�ݸӪ��~���ԲӸ��
	 //�]��PI�Q�[�W�Fstatic���e��A�ҥH����A�Q�ק�
	 //�Ӧ]��PI������static�ҥH���ݭn���Ыؤ~��ϥΡA�ӬO�j�a���s���P�@�ӰO����Ŷ��̪���
	 //�ЫجO���إߤ@�ӰO����Ŷ����Ӫ���
  System.out.println(Math.PI);	 
 }
 @Test
 public void variableTest() {
	 //�ƭ�
	 //-���
	 //�j���૬:�ȫe���[�W(�n�૬������ƫ��A)
	 byte a =(byte)128;
     short b = 3 ;
     int  c = 128 ;
     a=(byte)c;
     long d = 5L ;
     long e = 5l ;
     long f = 5 ;
     System.out.println(a);
     //-�B�I��(�p��)
     float g = (float)0.5;
     double h = 0.5;
     //�r��
     char i ='C';
     char l =65; //����Ʀr��Jchar���e�����ɡA�{���|�۰ʸ�Ū����r�s�X�A���ӼƦr�۹������r��
     //���L��
     boolean j = true;
     boolean k = false;
     
     //�e����Ȫ��y�{
     int res = 5/2;
     System.out.println(res);
     //���S���p���I�ɡA�{���|�۰ʱN�Ʀr�z�Ѭ�int(���)�A�]���p�⪺���G�]�|�ξ�ƪ��覡�e�{
     System.out.println(5/2);
     System.out.println(5/2.0);
     System.out.println(5.0/2);
     //�ӥu�n������@�ƬO�p�ơA�{���N����H�p�ƪ��覡�h�p��X���G(2.5)
     double res2 = (double)5/2;
     //�{�����檺���Ƿ|�O���5�M���2�۰��A�A�N�۰��X�Ӫ�����ഫ���p�ơA�̫��J�p�ƪ��e�����A�]�����G�|�O2.0�Ӥ��O2.5
     System.out.println(res2);     
 }
 
 @Test
 public void hardcodeTest() {
	 
	 //�N��@���e�����g���Ʀr�A�������Ӻ��@�P�Q��
	 int sum = 4 + 5;
	 System.out.println(sum);
	 
	 int add1 = 4;
	 int add2 = 5;
	 
	 
	 //�N��@���e�Ψ���ܼƥ]�˰_�ӡA��K���ӭק�Ȫ����e(�u�n�ק��ܼƧY�i)
	 int sum2=add1+add2;
	 System.out.println(sum2);
	 
	 //�ٲ������ϥΤ@����sum2�A�٬��ΦW�ܼ�
	 System.out.println(add1+add2);
 }
   @Test
 public void stringTest() {
	   //���հ򥻸�ƫ��A���P�_
	   int a = 1 ;
	   int b = 1 ;
	   System.out.println(a == b);
	   
	   String C = "a";
	   String d = "a";
	   String e = new String("a");
	   System.out.println(C == d);
	   System.out.println(e);
	   System.out.println(C == e);
	   
	   //���O�P�򥻸�ƪ����A
   }
 
 }




