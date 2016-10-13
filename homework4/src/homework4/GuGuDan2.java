// (5번) 짝수단/홀수단 출력하기
package homework4;

import java.util.Scanner;

public class GuGuDan2 {
	public void Gugudan2(){
		Scanner s = new Scanner(System.in);
		while(true){	// while문 시작
			System.out.print("E짝수단, O홀수단(Q종료) >> ");
			String a = s.nextLine();
			switch(a){	//switch 문 시작
			case "E":	// 입력받은 a 가 "E", 짝수문 구구단 출력
				for(int j=2; j<10; j=j+2){ // j는 2단 부터 +2씩 더해주고 10미만 (2단, 4단, 6단, 8단 )
					System.out.println("");
				for(int i=1; i<10; i++){	// i는  1부터 9까지 곱해서 result에 넣음
					int result = j *i; // result =  j(2~8) * i(1~9)
					System.out.print(j+"*"+i+"="+result+"  ");	// 구구단형식으로 출력
				}
				}
				break;  // a가 "E"경우의 switch문 종료
			case "O":	// 입력받은 a가 "O"일 경우, 홀수문 구구단 출력
				for(int j=3; j<10; j=j+2){
					System.out.println("");
					for(int i=1; i<10; i++){
						int result = j *i;
						System.out.print(j+"*"+i+"="+result+"  ");
					}
					}
					break; 	// switch 문 종료
			}if(s.next().equals("Q")){  // s가 "Q" 인지 비교 후 맞으면 
				break;	// while문 종료
			}
		}
	}
}
