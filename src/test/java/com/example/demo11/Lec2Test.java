package com.example.demo11;

import org.junit.jupiter.api.Test;

public class Lec2Test {
	@Test 
	public void reviewLec1() {
		int  a  ;
		String b = "1111";
	}
	
	
	
	public void reviewLec2() {
// 單行註解
		/*多行註解
		 * 這個註解方式可以撰寫比較多行的筆記
		 */
		this.fileCommentTent(0);
}
	/**
	 * 
	 * @param test 書本的ISBN編號
	 * @return 書本名稱
	 */
	public String fileCommentTent(int test) {
		return null;
	}
	
	@Test
	public void computeTest() {
		int remaidar = 10%3;
		int quotient = 10/3;
		System.out.println("10除以3的餘數是:"+remaidar);
		System.out.println("10除以3的商數是:"+quotient);
		
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
	 	System.out.println(res1 && res2); // &&兩個都要成立才會是true
	 	System.out.println(res1 || res2); // ||只要有一個成立就會是true
	}
	
	@Test
	public void practiceTest() {
		int a = this.sum(1,100);
		System.out.println(a);		
	}
	
	/**
	 * 計算從1開始的數列總和
	 * @param start 
	 * @param end 數列終止值
	 * @return 數列總和
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
	
	//華式溫度 = 攝氏溫度 * 9/5 + 32
	/**
	 * 轉換溫度單位為華式
	 * @param C 攝氏溫度
	 * @return 華氏溫度
	 */
	public double CTansferToF(double C) {
		double F = C*9/5+32;
		return F; 
	}
	
	//華式溫度 = 攝氏溫度 * 9/5 + 32
	
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
			int j=1; //每次i執行完一輪之後，就會重新初始化
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
		a:for(int i = 0;i<10;i+=2) {  //幫迴圈加上標籤名稱，只需要再迴圈前面加上[標籤名稱:]
			System.out.println(i);
			for(int j =1;j<10;j+=2) {
				System.out.println(j);
//				break;  //預設會對最近的迴圈作用，故會跳出j的迴圈
				break a;  //若要對外層迴圈作用，須再外層迴圈加上標籤，再註明此標籤內容
				
			}
			System.out.println("內層已結束");
			
		}
		System.out.println("外層已結束");
	}
	
	@Test
	public void chickenRabbitTogetherByTnfiniteLoop(int head,int foot) {
		
		//判斷是否為個數:能否被2整除
		//如果除以2餘0=>個數 | 餘1=>奇數
		if(foot%2==1) {
			System.out.println("此題無解");
			return;
		}
		
		
		//假設兔子的數目是0隻
		int rabbit = 0 ;
		
		//以下方法須重複執行，雇用while包起來
		while(true) {
							
		//利用兔子的數目，反推雞的數目
			int chicken= head - rabbit ;


		//如果兔子+雞的腳數目會剛好符合腳的數目，即為解之一
			if(rabbit*4 + chicken*2 == foot) {
			
				//case1:剛好符合
				System.out.printf("雞:兔\n%d: %d\n",chicken,rabbit);
				//因為只有唯一解,離開迴圈
				//break;
				return;//因為離開環圈後沒有要做其他事情，所以直接離開整個方法也行
			}
		System.out.println("執行一輪");
		
		
		//case2:下一輪
		rabbit++;
		
		//如果兔>頭，無解，跳出迴圈
		if(rabbit > head) {
			System.out.println("此題無解");
//			break;
			return; //因為離開環圈後沒有要做其他事情，所以直接離開整個方法也行
		}
	  
		
		
		
	}
}
	

}
  
	
	
 











	
	
	