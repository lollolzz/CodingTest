package com.coding;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Main2 {

    // 백준 방배정 문제 
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
      
        int N = sc.nextInt(); 		// 수학여행에 참가하는 학생 수 
        int K = sc.nextInt(); 		// 한 방에 배정할 수 있는 최대 인원 수
        int count = 0; 				// 필요한 최소한의 방의 수를 출력하기 위해 선언 
        
        int[][] as= new int[6][2];  // new int[Y][S]
        							// 2차원 배열을 사용 [6]은 학년을 나타냄 / [2]은 성별을 나타
        						    // 6으로 지정해준 이유는 문제에서 지정 해주었기 때문 
         					        // 0은 여학생 / 1은 남학생 -> 2로 한 이유는 선택지가 2가지 이기 때문 
        
        for (int i = 0 ; i<N ; i ++){
           
        	int Y = sc.nextInt()-1; 
            int S = sc.nextInt();   
            
            as[Y][S]+=1;
            // 인덱스는 0부터 시작
            // 2차 배열as 즉 1학년 부터 6학년까지 
            // 6개가 들어가는데 입력받은 것은 1부터 6까지니까 -1을 해줘야 
            // 0-5까지의 인덱스가 들어간다 
            // 0을 제외하고 싶다면 인덱스를 7로 잡아서 1부터 6을 집어넣으면 됨
            // 보통 0베이스 인덱스라고 보면 된다. 
     

        }
        for (int j = 0; j <6 ; j++) {
        	
            for (int j2= 0 ; j2< 2; j2 ++) {
            	
               if (as[j][j2]%K == 0) { 
            	   // 한방에 만약에 2명씩 들어가면 
            	   // k=2가 되고 
            	   // 나눗셈의 몫이 그룹일거다 
            	   // 근데 만약에 학생이 5명일경우 
            	   // 2명씩 그룹지은다면 
            	   // 2명 2명 1명이 그룹됨 / 4명인 경우는 2명 2명 되서 나머지가 0 그럼 딱 떨어진다 
            	   // 5명일경우 1명 남는경우는 else에서 처럼 count에 +1을 해서 방을 하나 더 추가 해준다
            	   
                  count+=as[j][j2]/K; // 필요한 방 계산 
               }
               else {
                  count+=as[j][j2]/K+1; // 방이 학생에 나누어 떨어지지 않으면 방이 하나더 필요 
               }
            }
         }
        System.out.println(count);
     }

 }