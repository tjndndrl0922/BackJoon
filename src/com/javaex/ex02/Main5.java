package com.javaex.ex02;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if(h==0 && m <= 44) {
			h=24;
			h = h-1;
			m = m+15;
			System.out.println(h+" "+m);
		}else if (h == 0 && m >= 45) {
			m = m-45;
			System.out.println(h+" "+m);
		}else if(h != 0 && m <= 44) {
			h = h-1;
			m = m+15;
			System.out.println(h+" "+m);
		}else if(h != 0 && m >= 45) {
			m = m-45;
			System.out.println(h+" "+m);
		}
		
			
		
		
			
		
	}

}
