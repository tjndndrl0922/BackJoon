package com.javaex.ex02;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if(h == 0) {
			h=24;
			System.out.println(h+" "+m);
		}
		else {
			if(m <= 44) {
				h = h-1;
				m = m+15;
				System.out.println(h+ " " + m);
			}else if(m == 45) {
				m = 0;
				h = h+1;
				System.out.println(h+ " "+m+m);
			}else if(m > 45) {
				m = m-15;
				h = h+1;
				System.out.println(h+ " "+m);
			}
		}	
		
		
			
		
	}

}
