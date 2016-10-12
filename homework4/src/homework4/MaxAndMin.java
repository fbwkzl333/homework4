// (2번) 최대값/최소값구하기
package homework4;

import java.util.ArrayList;
import java.util.Scanner;
public class MaxAndMin {		
	public void MaxMin(){
		 int a = 0;
		 int max =0; 	// 첫 max비교 if에서 무조건 max에 들어가게 하기위해 가장 작은수로 선언
		 int min=100;	// 첫 min비교 if에서 무조건 min에 들어가게 하기위해 가장 큰수로 선언
		 Scanner s = new Scanner(System.in);
		  String b = "";	// 스캔한 s 값을 넣을 b 선언,초기화 (Q종료 기능을 하기위해 string으로)
		  while (true) {	// while 문 시작
		   System.out.print("0~100사이의 숫자를 입력(Q:종료) >> ");
		   b = s.next();	// 입력 받아서 넣음 (string)
		   if(b.equals("Q")) {	// b를 문자열로 비교 "Q" 입니까? Yes => while 문 나감,  No => 넘어감
		    break;	
		   }
		   if(Integer.parseInt(b) > max){	// 입력받은 녀석은 max보다 크냐
			   max = Integer.parseInt(b);	// 처음엔 무조건 max에 들어감
		   }
		   
		  
		   if(Integer.parseInt(b) < min){	// 입력받은 녀석이 min 보다 작은가
			   min = Integer.parseInt(b);	// 그렇다면 너는 min에 들어가라
		   }	
		  }
		  System.out.println("가장 큰수는 " +max+"이고,"+" 작은 수는 "+min+"입니다.");	// 입력 한 값들의 max, min 값을 출력
	}
	
	public void Maxmin2(){ // 테스트용 (과제와 상관없는 내용입니다)
		      Scanner sc = new Scanner(System.in); 
		      String input = ""; 
		      ArrayList<String> arr = new ArrayList<>(); 
		      while (!input.equals("q")) { 
		         System.out.println("문자열 입력. (q를 입력하면 종료)"); 
		         input = sc.next(); 
		         if (!input.equals("q")) arr.add(input); 
		      } 
		      System.out.println(arr); 
		   } 
}
