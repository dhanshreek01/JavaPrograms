package java_Interview_Program_;

import java.util.Scanner;

public class Expect_Output_01 {

	public static void main(String[] args) {

		//outpt1();
	//	scan();
		evO();
	}

	public static void outpt1(){
		
		System.out.println(-6+4*2); //-6+8 =2 
		System.out.println((2+3)*4); //5*4= 20
		System.out.println(9+6-3*4/2%5); // 15-1=14  *,/,%,+,-
	}
	
	public static void scan() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		int a = sc.nextInt();
		
		System.out.println("Enter Second number");
		int b = sc.nextInt();
		
		sc.close();
		System.out.println(  a+b + " is sum");
	}
	
	public static void evO() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println(num + " num is even");
		}else
			System.out.println(num + " num is odd");
		
	}
}
