// (3번) 입력받은숫자의 합계와 평균구하기
package homework4;

import java.util.Scanner;

public class SumAndAvg {
	public void SumAvg(){
		Scanner s = new Scanner(System.in); 
		   int count =0; 		// 나누기위해 카운트 갯수 알아내는 녀석
		   int sum =0; 			// 입력받은걸 계속 더해줄 합계 녀석
		   while(true){ 
		      System.out.print("숫자를 입력(Q종료) >> "); // 입력하라 
		      try{
		    	  String su = s.nextLine(); // 문자열로 입력받고 su 에 넣는다
		    	  count += 1; 				// 카운트 들어감
		    	  sum += Integer.parseInt(su);  // 문자열 su를 int로 바꾸고 sum에 더한다
		      	  } catch (NumberFormatException e){	// 숫자가 아닌데 숫자로 파싱할 때 나는 예외
		    	  double avg = (double)sum/(count-1); // count 하나 빼줘야함 예외처리하는것까지 count+1 이 기때문에
		         System.out.println("합계는 "+sum+"이고, "+"평균은 "+avg+"입니다."); 
		         break;
		      }
		      
		   }
		}
		
	}


