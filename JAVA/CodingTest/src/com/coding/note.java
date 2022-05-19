package com.coding;

import java.util.Arrays;
import java.util.Scanner;

public class note {

	public static void main(String[] args) {
		
		// 1번 
		Scanner src = new Scanner(System.in); 
		// 객체 생성 해주기
		// 자바에서는 어떠한 값을 입력받기 위해 사용해야한
		int a = src.nextInt();
		int b = src.nextInt();
		
		src.close(); // 자동으로 닫아지지만 명시적으로 닫아주는 것이 좋다 (예외 방지 )
		System.out.print(a+b);
		
		// 더하기 - 각 형마다 맞는 것들을 사용하면 된다 //
		
		//String 문자열_space = src.next();
		//String 문자열_Enter = src.nextLine();
		//
		//boolean 부울 = src.nextBoolean();
		//
		//byte 바이트 = src.nextByte();
		//short 쇼트 = src.nextShort();
		//long 롱 = src.nextLong();
		//
		//double 더블혈 = src.nextDouble();
		// 문제에 나와있듯이 오차 범위를 벗어나지 않게 하기 위해서는 반드시 double형으로 출력을 해주어야 한다.
		//float 플롯 = src.nextFloat();
		
		// 2번 
//		Scanner src = new Scanner(System.in);
//		
//		int a = src.nextInt();
//		String b = src.next();
//		
//		src.close();
//		
//		System.out.println(a * (b.charAt(2) - '0'));
//		System.out.println(a * (b.charAt(1) - '0'));
//		System.out.println(a * (b.charAt(0) - '0'));
//		System.out.println(a * Integer.parseInt(b));
		
		// b는 charAt으로 각 자리수를 참조해준다. 즉 문자열의 인덱스 위치에 있는 문자(Character) 값을 반환한다.
		// 이 때 반환되는 값은 아스키코드값은 문자(char)이다 
		// 그래서 문젱에서 주언진 숫자b(385) charAt(2)의 값 5는 실은 문자'5'이지 숫자 5가아니다
		// 그래서 -0을 해준다 -> 우리가 문자로 저장된 숫자가 아닌 우리가 보는 숫자 그대로의 값을 쓰기 위한 것.
		
//		Scanner sc = new Scanner(System.in);
//		
//		int N = sc.nextInt();
//		
//		int[] arr = new int[N];
//		
//		for(int i=0; i < N; i++) {
//			arr[i] = sc.nextInt();
//		}
//		
//		sc.close();
//		Arrays.sort(arr); // 배열에 저장된 원소 값을 오름차순으로 정렬해주는 메소
//		System.out.println(arr[0] + " " + arr[N - 1]);
//						  // 오름차순 정렬하면 index 0번 째에 최소값이 온다 
//						  // 가장 뒤 N-1에 최솟값이 들어온다.
		
		
		
		
	}

}
