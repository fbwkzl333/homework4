//(1번메뉴) 1부터 입력한 수까지 더하기 
package homework4;

import java.util.Scanner;
public class SumOfNumbers {
	Scanner s = new Scanner(System.in);
	public void SumOf(){
		System.out.print("\n1부터 입력한 수까지 더하기 마지막 수를 입력(Q:종료) : ");
		String a = s.next();  // String으로 입력받음 (Q종료 때문에)
		
		switch(a){		// (Q:종료 일때) : 메인메뉴로 돌아감
		case "Q":		// 교수님의 의도가 프로그램 종료인지 메뉴로 돌아가는지 정확히 모르겠습니다
			ExamForWhile.Start();
			break;
		}
		
		
		int result =0;
		for(int i = 1; i <= Integer.parseInt(a); i++){	// 입력받은 값을 Int형으로 바꿈 and  그 값만큼 for문이 반복함
			result = result + i;	// 0부터 입력받은 (int)값까지 result에 더함
		}
		System.out.print("총 합은 "+result+"입니다."); // 0부터 입력받은 (int)a 까지의  총 합이 계산되어 나옴
		SumOf();	
	}
}