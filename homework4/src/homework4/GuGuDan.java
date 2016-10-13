// (4번) 구구단 출력하기

package homework4;

import java.util.Scanner;

public class GuGuDan {
	public void Gugudan1(){
		Scanner s = new Scanner(System.in);
		while(true){ 		// while 문 시작
		System.out.print("출력하고 싶은 단(Q:종료) >> ");
		if(s.hasNextInt()){		// if문 시작( nxetInt가 아닌 녀석 만나면 false => 22번 Line인 else if 문으로 이동 )
			int su = s.nextInt();  // int형 입력해서 su에 넣음
			if(su <= 1 || su >= 10){	// 입력 받은 su 가 1보다 작거나 10 이상 일 경우
				System.out.println("잘못입력");	// "잘못입력" 을 출력 
			}else{  // 정상적으로 su = 1~9 가 입력됬을 경우
			for(int i=1; i<10; i++){	
				int result = su *i;		// 입력받은값 * i(1~9) 를 result에 넣는다
				System.out.println(su+"*"+i+"="+result); // "su * i = result" 즉 구구단 형태로 출력
			}
			}
		}else if(s.next().equals("Q")){	// 입력 받은 s가 nextInt형이 아닐떄, 비교했을때 "Q" 입니까?
			break;  // while 문을 나감.
		}
		}
	}
}
