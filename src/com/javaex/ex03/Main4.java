package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main4 {
	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = br.read();
		
		for(int i=0; i<=t; i++) {
			int a = br.read();
			int b = br.read();
			bw.write(a+b);//출력
			bw.newLine(); //줄바꿈
			
		
		}
		bw.flush();//남아있는 데이터를 모두 출력시킴
		bw.close();//스트림을 닫음
	}
}
