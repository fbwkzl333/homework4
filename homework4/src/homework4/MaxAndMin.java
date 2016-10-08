// (2번) 최대값/최소값구하기
package homework4;

import java.util.ArrayList;
import java.util.Scanner;
public class MaxAndMin {		
	public void MaxMin(){
		 int a = 0;
		 int max =0; 
		 int min=100;
		 Scanner s = new Scanner(System.in);
		  String b = "";
		  // 스캔한 s 값을 넣음 (Q종료 기능을 하기위해 string으로)
		  while (true) {
		   // b 가 Q가 아니면 조건문 실행
		   System.out.print("0~100사이의 숫자를 입력(Q:종료) >> ");
		   b = s.next();
		   if(b.equals("Q")) {
		    break;
		   }
		   if(Integer.parseInt(b) > max){	// 입력받은 녀석은 max보다 크냐
			   max = Integer.parseInt(b);	// 처음엔 무조건 max에 들어감
		   }
		   
		  
		   if(Integer.parseInt(b) < min){
			   min = Integer.parseInt(b);
		   }	
		  }
		  System.out.println("가장 큰수는 " +max+"이고,"+" 작은 수는 "+min+"입니다.");
	}
	
	public void Maxmin2(){ // 테스트용
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
