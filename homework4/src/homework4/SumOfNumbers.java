//(1번메뉴) 1부터 입력한 수까지 더하기 
package homework4;

import java.util.Scanner;
public class SumOfNumbers {
	Scanner s = new Scanner(System.in);
	public void SumOf(){
		System.out.print("\n1부터 입력한 수까지 더하기 마지막 수를 입력(Q:종료) : ");
		String a = s.next();
		
		switch(a){		// 종료 : 메인메뉴로 돌아감
		case "Q":
			ExamForWhile.Start();
			break;
		}
		
		
		int result =0;
		for(int i = 1; i <= Integer.parseInt(a); i++){
			result = result + i;
		}
		System.out.print("총 합은 "+result+"입니다.");
		SumOf();	
	}
}