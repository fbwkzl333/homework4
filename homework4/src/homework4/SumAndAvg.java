// (3번) 입력받은숫자의 합계와 평균구하기
package homework4;

import java.util.Scanner;

public class SumAndAvg {
	public void SumAvg(){
		Scanner s = new Scanner(System.in);
		int count =0;
		int su =0;
		int sum =0;
		
		while(true){
		System.out.print("숫자를 입력(Q종료) >> ");
		if(s.hasNextInt()){
		su =+ s.nextInt();
		sum = sum + su;
		count += 1;
		
		}else if(s.next().equals("Q")){
			break;
		}
		}
			double avg = (double)sum/(double)count;
			System.out.print("합계는 "+sum+"이고, "+"평균은 "+avg+"입니다.");
		
		}
		
	}


