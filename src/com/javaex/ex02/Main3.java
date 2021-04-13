package com.javaex.ex02;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
				double x = sc.nextInt();
				
				if(x%4 == 0 && x%100 !=0 || x%400 ==0) {
					System.out.println("1");
				}else {
					System.out.println("0");
				}
		
		sc.close();
		 
	}

}
