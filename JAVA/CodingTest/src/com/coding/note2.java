package com.coding;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class note2 {

	public static void main(String[] args) throws IOException {
		
		// 1 A+B 연산을 빠르게 하기 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// 입력 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 출력 
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for (int i =0; i< n; i++) {
			st = new StringTokenizer(br.readLine(), " "); // 두 가지 수를 입력하게 해주는 것 
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n"); 
			// 위에서 받은 두 수를 int형으로 바꿔 연산한다 그리고 bw에 넣어주어 출력한다. 
		}
		
		br.close();
		// scanner를 닫듯 입력하는 것도 닫아준
		
		bw.flush();
		bw.close();
		
		// 문제에서 테스트 케이스 1000000가 주어진다. 
		// 케이스가 늘어날 수록 문제가 생김 
		// Sysout.out.println();의 호출횟수 또한 증가한다 
		// 시간초과 문제가 발생 함.
		
		// 또한 Scanner를 사용하게 되면 구문분석을 위해 정규식을 거치게되서 속도가 많이 느림 
		// 그래서 BufferedWriter를 사용 
		
		// 모든 입력은 BufferedReader.readLine()으로 받았다
		// 테스트 케이스에서 주어지는 두 정수는 문자열 분리를 위해 매 반복마다 StringTokenizer을 생성과 동시에 문자를 입력 받음
		
		// 또한 다음 열에서 각 StringTokenizer의 토큰(분리되어 있는 문)을 반환하, 
		// 반환되는 타입은 String이므로 Integer.partInt를 통해 int형으로 바꾸어준다. 
		// 이렇게 바꾼 두 토큰을 더해준 값을 BufferedWriter.write()에 넣어준다.
		
		// 그리고 거의 필수적으로 버퍼를 비운(flush)뒤 닫아줘야함(close).
		
		
//      2번 배열로 입력된 수 중에 X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출
//		Scanner src = new Scanner(System.in);
//		int N = src.nextInt();
//		int X = src.nextInt();
//		int arr[] = new int[N];
//		
//		for(int i = 0; i < N; i++) {
//			arr[i] = src.nextInt();
//		}
//		
//		src.close();
//		
//		for(int i =0; i < N; i++) {
//			if(arr[i] < X) {
//				System.out.println(arr[i] + " ");
//			} 
//		}
//		
//		3번 while문 사용
//		src.hasNextInt()) {
		// 입력값이 있는가 확인 방법 
		
		
	}
	
}

